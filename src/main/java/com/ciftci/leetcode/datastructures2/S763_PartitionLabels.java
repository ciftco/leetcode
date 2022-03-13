package com.ciftci.leetcode.datastructures2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S763_PartitionLabels {
	public static void main(String[] args) {
		String deneme = "ababcbacadefegdehijhklij";
		List<Integer> integers = partitionLabels(deneme);
		System.out.println(integers);

	}

	public static List<Integer> partitionLabels(String s) {

		char[] chars = s.toCharArray();
		Map<Character, Integer> characterLastIndex = new HashMap<>();
		for (int i = 0 ; i < s.length();i++){
			Character charr = s.charAt(i);
			characterLastIndex.put(charr, i);
		}

		//Son karakterleri karşılaştırarak o kısmı ayiriyor
		int index = 0;
		int  anchor = 0;
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < s.length(); ++i) {
			index = Math.max(index, characterLastIndex.get(s.charAt(i)));
			if (i == index) {
				result.add(i - anchor + 1);
				anchor = i + 1;
			}
		}

		return result;
	}
}


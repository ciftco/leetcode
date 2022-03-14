package com.ciftci.leetcode.datastructures2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class S451_SortCharactersByFrequency {
	public static void main(String[] args) {

	}


	public String frequencySort(String s) {
		Map<Character, Integer> frequencyMap = new HashMap<>();

		char[] chars = s.toCharArray();
		for (Character c : chars){
			frequencyMap.put(c , frequencyMap.getOrDefault(c, 0) +1);
		}

		List<Map.Entry<Character, Integer>> collect = frequencyMap.entrySet().stream().sorted((x, y) -> {
			return x.getValue() > y.getValue() ? -1 : 1;
		}).collect(Collectors.toList());

		StringBuffer buf = new StringBuffer();
		for (Map.Entry<Character, Integer> entry : collect ){
			Integer value = entry.getValue();
			Character c = entry.getKey();
			for (int i = 0; i<value;i++){
				buf.append(c);
			}
		}

		String result = buf.toString();
		return result;

	}

}

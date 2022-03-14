package com.ciftci.leetcode.datastructures2;

import java.util.*;

public class S49_GroupAnagrams {

	public static void main(String[] args) {

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String item : strs) {
			char[] chars = item.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			List<String> words = map.getOrDefault(key, new ArrayList<>());
			words.add(item);
			map.put(key, words);
		}

		List<List<String>> result = new ArrayList<>();
		for (List<String> words :  map.values()) {
			result.add(words);
		}

		return result;
	}
}




package com.ciftci.leetcode.datastructures2;

import java.util.HashMap;
import java.util.Map;

public class S290_WordPattern {

	public static void main(String[] args) {

		String pattern = "abba";
		String words = "dog dog dog dog";

		boolean b = wordPattern(pattern, words);
	}

	public static boolean wordPattern(String pattern, String s) {
		char[] patternChars = pattern.toCharArray();
		String[] words = s.split(" ");

		if (patternChars.length != words.length)
			return false;

		Map<Character, String> patternMap = new HashMap<>();
		for (int i = 0; i < patternChars.length; i++) {
			Character currentCharacter = patternChars[i];
			boolean patternContains = patternMap.containsKey(currentCharacter);
			String word = words[i];
			if (!patternContains) {
				if (patternMap.values().contains(word)) {
					return false;
				}
				patternMap.put(currentCharacter, word);
				continue;
			}

			String mapedWord = patternMap.get(currentCharacter);
			if (!word.equals(mapedWord)) {
				return false;
			}
		}
		return true;
	}
}



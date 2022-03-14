package com.ciftci.leetcode.datastructures2;

import java.util.*;

public class S187_RepeatedDNASequences {

	public static void main(String[] args) {
		String str = "AAAAAAAAAAA";
		findRepeatedDnaSequences(str);
	}

	public static List<String> findRepeatedDnaSequences(String s) {

		int start = 0;
		int end = 10;
		StringBuffer buf = new StringBuffer(s);
		Set<String> dnaFractals = new HashSet<>();
		Map<String, Integer> frequency = new HashMap<>();

		while(end-1 < s.length() ){
			String substring = buf.substring(start, end);
			Integer frequencyCount = frequency.getOrDefault(substring, 0);
			if(frequencyCount > 0){
				dnaFractals.add(substring);
			}
			frequency.put(substring, frequencyCount + 1);
			start++;
			end++;
		}

		List<String> result = Arrays.asList(dnaFractals.toArray(new String[0]));
		return result;
	}

}

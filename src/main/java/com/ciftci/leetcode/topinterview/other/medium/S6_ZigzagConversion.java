package com.ciftci.leetcode.topinterview.other.medium;

public class S6_ZigzagConversion {

	public String convert(String s, int numRows) {

		if(numRows == 1)
			return s;

		StringBuilder[] builderArr = new StringBuilder[numRows];

		for	(int i = 0; i<numRows;i++){
			builderArr[i] = new StringBuilder();
		}

		int addition = 1;
		int arrayIndex = 0;
		for (int i = 0; i < s.length();i++){
			char charAt = s.charAt(i);
			builderArr[arrayIndex].append(charAt);

			arrayIndex = arrayIndex + addition;
			if(arrayIndex == -1){
				arrayIndex = 1;
				addition = 1;
			}

			if(arrayIndex == numRows){
				arrayIndex = numRows - 2;
				addition  = -1;
			}
		}

		StringBuilder resultBuilder = new StringBuilder();
		for	(int i = 0; i<numRows;i++){
			String s1 = builderArr[i].toString();
			resultBuilder.append(s1);
		}
		String result = resultBuilder.toString();
		return result;
	}
}

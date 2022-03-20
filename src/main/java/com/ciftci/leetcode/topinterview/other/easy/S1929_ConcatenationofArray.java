package com.ciftci.leetcode.topinterview.other.easy;

public class S1929_ConcatenationofArray {


	public int[] getConcatenation(int[] nums) {
		int length = nums.length;
		int[] newArr = new int[2*length];

		for (int i = 0; i < length; i++){
			int num = nums[i];
			newArr[i] = num;
			newArr[i + length] = num;
		}
		return  newArr;
	}
}

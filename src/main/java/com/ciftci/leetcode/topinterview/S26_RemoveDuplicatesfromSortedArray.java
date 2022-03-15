package com.ciftci.leetcode.topinterview;

public class S26_RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {

	}

	public int removeDuplicates(int[] nums) {

		int firstPointer = 1;
		int currentNumber = nums[0];

		for (int i = 1; i<nums.length ; i++  ){
			int number = nums[i];
			if(number != currentNumber){
				currentNumber = number;
			}
			//if(i != currentNumber)

		}

		return 0;
	}
}

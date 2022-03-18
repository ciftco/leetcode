package com.ciftci.leetcode.topinterview.other;

public class S27_RemoveElement {

	public static void main(String[] args) {

		int[] arr = new int[] {0,1,2,2,3,0,4,2};
		S27_RemoveElement thiss = new S27_RemoveElement();
		thiss.removeElement(arr, 2);
	}
	public int removeElement(int[] nums, int val) {
		int lastPointer = nums.length -1;
		int counter = 0;
		for (int i = 0 ; i <= lastPointer; i++){
			int value  = nums[i];
			if(value == val){
				nums[i] = nums[lastPointer];
				i--;
				lastPointer--;
				counter++;
			}
		}

		return nums.length  - counter;
	}
}

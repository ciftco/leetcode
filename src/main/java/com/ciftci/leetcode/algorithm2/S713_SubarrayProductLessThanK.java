package com.ciftci.leetcode.algorithm2;

public class S713_SubarrayProductLessThanK {

	public static void main(String[] args) {
		int [] arr = {10,5,2,6};
		S713_SubarrayProductLessThanK thiss = new S713_SubarrayProductLessThanK();
		int i = thiss.numSubarrayProductLessThanK(arr, 100);
		System.out.println(i);


	}

	public int numSubarrayProductLessThanK(int[] nums, int k) {

		int lenght = nums.length;
		int count = 0;
		for(int i=0;i<lenght;i++)
		{
			int multiply=1;
			for(int j=i;j<lenght;j++)
			{
				multiply=multiply*nums[j];
				if(multiply<k)
					count++;
				else
					break;
			}
		}
		return count;
	}

}

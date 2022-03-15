package com.ciftci.leetcode.algorithm2;

public class Anla_S209_MinimumSizeSubarraySum {

	public static void main(String[] args) {

		int [] arr =  {2,3,1,2,4,3} ;
		Anla_S209_MinimumSizeSubarraySum thiss = new Anla_S209_MinimumSizeSubarraySum();
		int result = thiss.minSubArrayLen(7, arr);

		System.out.println(result);
	}

	public int minSubArrayLen(int target, int[] nums) {

		int sum = 0;
		int n = nums.length;
		int res = Integer.MAX_VALUE;
		int left = 0;
		for(int right = 0; right < n; right++){
			sum += nums[right];
			while (sum >= target){
				res = Math.min(res, right-left+1);
				sum -= nums[left++];
			}
		}
		int result = res == Integer.MAX_VALUE ? 0 : res;
		return result;

	}
}

package com.ciftci.leetcode.datastructures2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class S215_KthLargestElementinanArray {

	public static void main(String[] args) {
		S215_KthLargestElementinanArray l  = new S215_KthLargestElementinanArray();
		int[] a = {3,2,3,1,2,4,5,5,6};
		l.findKthLargest(a, 4);
	}

	public int findKthLargest(int[] nums, int k) {

		List<Integer> set = new ArrayList<>();
		for (int i = 0; i < nums.length ; i++){
			set.add(nums[i]);
		}
		List<Integer> collect = set.stream().sorted().collect(Collectors.toList());
		int size = collect.size();
		int index = size - k;
		int result = collect.get( index );
		return result;
	}
}

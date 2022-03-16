package com.ciftci.leetcode.algorithm2;

import java.util.ArrayList;
import java.util.List;

public class S78_Subsets {

	public static void main(String[] args) {
		S78_Subsets thiss = new S78_Subsets();

		int[] arr = new int[]{1,2,3};
		List<List<Integer>> subsets = thiss.subsetsWithBacktrack(arr);
		List<List<Integer>> subsets2 = thiss.subsetsLexicographic(arr);
	}

	// Lexicographic solution
	// https://leetcode.com/problems/subsets/solution/
	public List<List<Integer>> subsetsLexicographic(int[] nums) {
		List<List<Integer>> output = new ArrayList();
		int n = nums.length;

		for (int i = (int)Math.pow(2, n); i < (int)Math.pow(2, n + 1); ++i) {
			// generate bitmask, from 0..00 to 1..11
			String bitmask = Integer.toBinaryString(i).substring(1);

			// append subset corresponding to that bitmask
			List<Integer> curr = new ArrayList();
			for (int j = 0; j < n; ++j) {
				if (bitmask.charAt(j) == '1') curr.add(nums[j]);
			}
			output.add(curr);
		}
		return output;
	}

	// Backtrack solution
	// https://leetcode.com/problems/subsets/solution/
	public List<List<Integer>> subsetsWithBacktrack(int[] nums) {
		List<List<Integer>> output = new ArrayList();
		int n, k;

		n = nums.length;
		for (k = 0; k < n + 1; ++k) {
			backtrack(0, new ArrayList<Integer>(), nums, output, k, n);
		}
		return output;
	}

	public void backtrack(int first, ArrayList<Integer> curr, int[] nums,List<List<Integer>> output ,int k, int n) {
		// if the combination is done
		if (curr.size() == k) {
			output.add(new ArrayList(curr));
			return;
		}
		for (int i = first; i < n; ++i) {
			// add i into the current combination
			curr.add(nums[i]);
			// use next integers to complete the combination
			backtrack(i + 1, curr, nums,output ,k,n);
			// backtrack
			curr.remove(curr.size() - 1);
		}
	}


	// Cascading solution
	// https://leetcode.com/problems/subsets/solution/
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> output =  new ArrayList<>();
		output.add(new ArrayList<>());

		for (int num : nums) {
			List<List<Integer>> newSubsets = new ArrayList();
			for (List<Integer> curr : output) {
				newSubsets.add(new ArrayList<Integer>(curr){
					{
						add(num);
					}
				});
			}
			for (List<Integer> curr : newSubsets) {
				output.add(curr);
			}
		}
		return output;
	}

}

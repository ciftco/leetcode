package com.ciftci.leetcode.algorithm2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class S384_ShuffleanArray {

	public static void main(String[] args) {
		Solution s = new Solution(new int[] {1, 2} );
		s.shuffle();
		s.shuffle();
		s.reset();

	}



	private  static class Solution {

		private int[] nums;
		private int[] original;

		private Random rand = new Random();

		private List<Integer> getArrayCopyAsList() {
			List<Integer> asList = new ArrayList<Integer>();
			for (int i = 0; i < nums.length; i++) {
				asList.add(nums[i]);
			}
			return asList;
		}

		public Solution(int[] nums) {
			this.nums = nums;
			original = nums.clone();
		}

		public int[] reset() {
			nums = original;
			original = original.clone();
			return nums;
		}

		public int[] shuffle() {
			List<Integer> backStore = getArrayCopyAsList();

			for (int i = 0; i < nums.length; i++) {
				int removeIdx = rand.nextInt(backStore.size());
				nums[i] = backStore.get(removeIdx);
				backStore.remove(removeIdx);
			}

			return nums;
		}
	}

}


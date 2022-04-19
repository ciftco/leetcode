package com.ciftci.leetcode.topinterview.other.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S26_RemoveDuplicatesfromSortedArray {

	public int removeDuplicates(int[] nums) {
		// 2 pointer ile ekstra alan olmadan yazılır usenddim.
		Set<Integer> numbers = new HashSet<>();
		List<Integer> list = new ArrayList<Integer>();

		for (int integer : nums) {
			if(!numbers.contains(integer)) {
				numbers.add(integer);
				list.add(integer);
			}
		}

		int index = 0;
		for (int i : list) {
			nums[index] = i;
			index++;
		}

		return numbers.size();
	}
}

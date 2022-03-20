package com.ciftci.leetcode.topinterview.other.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotCompleteS239_SlidingWindowMaximum {

	public int[] maxSlidingWindow(int[] nums, int k) {

		List<Integer> resulltList = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int[] elements = new int[k];
		int[] elementsSort = new int[k];

		for (int i = 0; i< nums.length ;i++){
			int number = nums[i];
			if(i < k -1){
				elements[i] = number;
				if(number > max)
					max = number;

				continue;
			}

			if(i == k - 1 ){
				elements[i] = number;

				if(number > max)
					max = number;

				resulltList.add(max);
				continue;
			}

			int index = i % k;
			if(i >= k){
				int erasedNumber = elements[index];
				elements[index] = number;
				if(number > max)
					max = number;

				if(erasedNumber == max){
					elementsSort = elements.clone();
					Arrays.sort(elementsSort);
					int maximum = elementsSort[elementsSort.length - 1];
					max = maximum;
				}
				resulltList.add(max);
			}
		}

		int size = resulltList.size();
		int[] result = new int[size];

		for (int i = 0; i < size  ; i++){
			result[i] = resulltList.get(i);
		}

		return result;
	}

}

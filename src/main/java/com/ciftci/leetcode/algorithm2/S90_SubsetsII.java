package com.ciftci.leetcode.algorithm2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class S90_SubsetsII {

	public static void main(String[] args) {
		int[] num = new int[]{1,2,2};
		S90_SubsetsII thiss = new S90_SubsetsII();
		List<List<Integer>> lists = thiss.subsetsWithDupBacktracking(num);
	}

	//with backtracking
	public List<List<Integer>> subsetsWithDupBacktracking(int[] nums) {
		List<List<Integer>> result =  new ArrayList<>();

		int arrLenght = nums.length;
		int elementCount = 0;
		Set<String> existingSubsets = new HashSet<>();


		for (int i = 0 ; i <=  arrLenght; i++ ){
			bactracking(0, new ArrayList<>(), nums, i, arrLenght, result, existingSubsets);
			elementCount++;

		}
		return result;
	}

	private void bactracking(int start , ArrayList<Integer> currentList, int[] nums, int elementCount, int arrLenght, List<List<Integer>> result,Set<String> existingSubsets ) {

		if(currentList.size() == elementCount){
			StringBuilder strBuilder = new StringBuilder();
			for (int number : currentList.stream().sorted().collect(Collectors.toList())){
				strBuilder.append(number);
				strBuilder.append("-");
			}
			String key = strBuilder.toString();
			if(!existingSubsets.contains(key)) {
				existingSubsets.add(key);
				result.add(new ArrayList<>(currentList));
			}
			return;
		}

		for (int i = start; i < arrLenght; i++)
		{
			int number = nums[i];
			currentList.add(number);
			bactracking(i+1, currentList, nums, elementCount, arrLenght, result, existingSubsets);
			currentList.remove(currentList.size() -1);
		}
	}


	// with Cascading
	public List<List<Integer>> subsetsWithDupCascading(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Set<String> existingSubsets = new HashSet<>();
		result.add(new ArrayList<>());

		for(int num : nums){
			List<List<Integer>> newSubsets = new ArrayList<>();

			for (List<Integer> itemList : result){
				List<Integer> newList = new ArrayList<>(itemList);
				newList.add(num);
				StringBuilder strBuilder = new StringBuilder();
				for (int number : newList.stream().sorted().collect(Collectors.toList())){
					strBuilder.append(number);
					strBuilder.append("-");
				}
				String key = strBuilder.toString();
				if(!existingSubsets.contains(key)){
					existingSubsets.add(key);
					newSubsets.add(newList);
				}
			}

			for (List<Integer> set : newSubsets){
				result.add(set);
			}

		}

		return result;
	}
}

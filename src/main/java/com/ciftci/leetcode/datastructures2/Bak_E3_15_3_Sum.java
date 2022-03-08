package com.ciftci.leetcode.datastructures2;

import java.util.*;

public class Bak_E3_15_3_Sum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        Set<String> numberSet = new HashSet();
        int length = nums.length;
        for (int i = 0 ; i < length -2; i++){
            int value = nums[i];
            int target = 0 - value;
            int start = i + 1;
            int end = length -1;
            while (start < end) {
                if (nums[start] + nums[end] == target &&
                        !numberSet.contains(nums[i] + "," + nums[start] + "," + nums[end])) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    result.add(list);
                    numberSet.add(nums[i] + "," + nums[start] + "," + nums[end]);
                    start++;
                    end--;
                } else if (nums[start] + nums[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }//end while

        }
        return result;
    }
}
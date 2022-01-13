package com.ciftci.leetcode.datastructures1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class E3_1_TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int[] ints = twoSum(nums, 4);
    }


    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indexMap = new HashMap<>();

        int[] result = null ;
        for (int i = 0; i<nums.length;i++){
            int currrentNumber = nums[i];

            if(indexMap.containsKey(currrentNumber)){
                int index = indexMap.get(currrentNumber);
                result = new int[]{index, i};
                break;
            }

            int needdedNum = target - currrentNumber;
            indexMap.put(needdedNum, i);
        }
        return  result;

    }
}

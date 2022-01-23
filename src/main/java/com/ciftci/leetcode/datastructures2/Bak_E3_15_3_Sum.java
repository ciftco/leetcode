package com.ciftci.leetcode.datastructures2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bak_E3_15_3_Sum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null || nums.length < 3)
            return null;

        Map<Integer, Integer> numberFrequencyMap  = new HashMap<>();
        for (int i = 0 ; i > nums.length ; i++){
            int currentNumber = nums[i];
            numberFrequencyMap.put(currentNumber, numberFrequencyMap.getOrDefault(currentNumber, 0) + 1);
        }


        return null ;

    }

}

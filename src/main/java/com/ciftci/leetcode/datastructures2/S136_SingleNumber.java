package com.ciftci.leetcode.datastructures2;

public class S136_SingleNumber {

    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {

        int result = 0;
        for (int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;

    }
}

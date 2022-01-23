package com.ciftci.leetcode.algorithm1;

public class EX_136_Single_number {

    public static void main(String[] args) {

        int i = 2;

        i  = i ^ 3;
        i  = i ^ 5;
        i  = i ^ 3;
        i  = i ^ 5;


        System.out.println(i);
    }

    public int singleNumber(int[] nums) {

        int result = 0;
        for (int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;




    }
}

package com.ciftci.leetcode.datastructures2;

public class S334_IncreasingTripletSubsequence {

    //https://leetcode.com/problems/increasing-triplet-subsequence/submissions/

    public static void main(String[] args) {

    }


    public boolean increasingTriplet(int[] nums) {

        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;

        for (int num: nums) {
            if (num <= small) {
                small = num;
            } else if (num <= big) {
                big = num;
            } else {
                return true;
            }
        }

        return false;
    }
}

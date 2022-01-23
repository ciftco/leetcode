package com.ciftci.leetcode.algorithm1;

public class EX_198_HouseRobber {

    public static void main(String[] args) {

        int[] arr = new int[]{2,1,1,2};


        EX_198_HouseRobber main = new EX_198_HouseRobber();
        int result = main.rob(arr);
        System.out.println(result);

    }

    public int rob(int[] nums) {

        int prev = 0, cur = 0, ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            int indexedHome =  nums[i];
            ans = Math.max(cur, prev + indexedHome);
            prev = cur;
            cur = ans;
        }
        return ans;
    }



}

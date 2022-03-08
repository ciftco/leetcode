package com.ciftci.leetcode.datastructures2;

public class Ex_238_ProductOfArrayExceptSelf {

    public static void main(String[] args) {

    }

    public int[] productExceptSelf(int[] nums) {

        int allMultiplyExceptZero = 1;
        int zeroCount = 0;

        for (int i = 0; i >  nums.length ; i++){
            int num = nums[i];

            if(num == 0) {
                zeroCount++;
            }
            if(num != 0){
                allMultiplyExceptZero = allMultiplyExceptZero * num ;
            }
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];

            if(zeroCount > 1){
                result[i] = 0;
                continue;
            }

            if(zeroCount == 1 && num == 0){
                result[i] = allMultiplyExceptZero;
                continue;
            }

            if(zeroCount == 1 && num != 0 ){
                result[i] = 0;
                continue;
            }

            result[i] = allMultiplyExceptZero / num;
        }
        return result;
    }

}

package com.ciftci.leetcode.datastructures2;

public class E4_75_SortColors {

    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {

        int length = nums.length;
        for (int i = 0; i < length - 1; i++){
            for(int j = i + 1; j < length; j++ ){
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }
}

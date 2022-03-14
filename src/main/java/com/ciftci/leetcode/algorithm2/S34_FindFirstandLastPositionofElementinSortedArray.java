package com.ciftci.leetcode.algorithm2;

public class S34_FindFirstandLastPositionofElementinSortedArray {

    public static void main(String[] args) {

        int[] arr = new int[]{5,7,7,8,8,10};

        int[] ints = new S34_FindFirstandLastPositionofElementinSortedArray().searchRange(arr, 8);

        System.out.println(ints);


    }

    public int[] searchRange(int[] nums, int target) {
        int firstOccurance = findFirstOccurrence(nums, target);
        int lastOccurrence = findLastOccurrence(nums, target);

        return new int[]{ firstOccurance, lastOccurrence };
    }

    private int findFirstOccurrence(int[] nums, int target) {
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Index of first occurrence
        int firstOccurrence = -1;
        // Loop until the two pointers meet
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // Check if we have found the value
            if (nums[middle] == target) {
                firstOccurrence = middle;
                right = middle - 1;
            }
            // If the target is less than the element
            // at the middle index
            else if (target < nums[middle]) {
                right = middle - 1;
            }
            // If the target is greater than the element
            // at the middle index
            else {
                left = middle + 1;
            }
        }
        return firstOccurrence;
    }

    private int findLastOccurrence(int[] nums, int target) {
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Index of first occurrence
        int lastOccurrence = -1;
        // Loop until the two pointers meet
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // Check if we have found the value
            if (nums[middle] == target) {
                lastOccurrence = middle;
                left = middle + 1;
            }
            // If the target is less than the element
            // at the middle index
            else if (target < nums[middle]) {
                right = middle - 1;
            }
            // If the target is greater than the element
            // at the middle index
            else {
                left = middle + 1;
            }
        }
        return lastOccurrence;
    }

}

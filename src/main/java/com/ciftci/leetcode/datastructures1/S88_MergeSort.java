package com.ciftci.leetcode.datastructures1;

public class S88_MergeSort {

    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        while(m > 0 && n > 0  ) {
            if(nums1[m-1] > nums2[n -1]){
                nums1[m + n -1] = nums1[m-1] ;
                m--;
            }else{
                nums1[m + n -1] = nums2[n-1] ;
                n--;
            }

        }

        while(n > 0){
            nums1[m+n-1] = nums2[n-1];
            n--;
        }


    }
}

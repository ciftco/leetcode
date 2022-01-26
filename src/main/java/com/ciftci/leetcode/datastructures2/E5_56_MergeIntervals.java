package com.ciftci.leetcode.datastructures2;

import java.util.Arrays;

public class E5_56_MergeIntervals {

    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,3},{8,10},{2, 6},{15,18}};

        new E5_56_MergeIntervals().merge(arr);
    }

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals);

        int i = 0;
        return intervals;

    }


}

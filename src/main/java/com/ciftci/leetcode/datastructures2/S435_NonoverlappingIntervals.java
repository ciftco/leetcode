package com.ciftci.leetcode.datastructures2;

import java.util.Arrays;

public class S435_NonoverlappingIntervals {

    public static void main(String[] args) {
        int[][] intervals = new int[][] {{1,2},{2,3},{3,4},{1,3}};
        new S435_NonoverlappingIntervals().eraseOverlapIntervals(intervals);
    }

    public int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length == 0 )
            return 0;
       Arrays.sort(intervals, (a,b) -> { return a [1] - b[1]; });

       int count = 1;
       int end = intervals[0][1];
       for (int i = 1 ; i < intervals.length ; i++){
           int tupleStart =  intervals[i][0];
           if(tupleStart >= end){
               end = intervals[i][1];
               count++;
           }
       }
        int result = intervals.length - count;
       return result;
    }

}




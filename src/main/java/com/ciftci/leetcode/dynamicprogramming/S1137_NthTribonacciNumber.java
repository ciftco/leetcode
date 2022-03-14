package com.ciftci.leetcode.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class S1137_NthTribonacciNumber {
    public static void main(String[] args) {

    }

    Map<Integer, Integer> backingStore = new HashMap<>();
    public int tribonacci(int n) {
        if(n == 0) {
            return 0;
        }

        if(n == 1 || n == 2) {
            return 1;
        }

        if(backingStore.containsKey(n)){
            int result = backingStore.get(n);
            return result;
        }

        int value = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        backingStore.put(n,value);

        return value;
    }
}

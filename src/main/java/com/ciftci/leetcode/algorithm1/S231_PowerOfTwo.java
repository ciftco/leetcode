package com.ciftci.leetcode.algorithm1;

public class S231_PowerOfTwo {

    public static void main(String[] args) {
        S231_PowerOfTwo instance = new S231_PowerOfTwo();
        instance.isPowerOfTwo(16);
    }


    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while ((n & 1) == 0) {
            n >>= 1;
        }

        return (n == 1);
    }
}

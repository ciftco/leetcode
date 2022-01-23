package com.ciftci.leetcode.algorithm1;

public class EX_190_ReverseBits {

    public static void main(String[] args) {

        reverseBits(16);
    }


    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n >>> i & 1) == 1) {
                result |= 1 << (31 - i);
            }
        }
        return result;
    }
}

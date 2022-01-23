package com.ciftci.leetcode.algorithm1;

public class EX_191_NumberOf1Bits {
    public static void main(String[] args) {

    }

    public int hammingWeight(int n) {
        int result = 0;

        for(int i=0; i<32; i++){
            if((n & 1) == 1){
                result++;
            }
            n = n>>1;
        }

        return result;
    }
}

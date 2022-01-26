package com.ciftci.leetcode.datastructures2;

public class E9_59_SpiralMatrix {

    public static void main(String[] args) {

        generateMatrix(3);

    }

    public static int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int itemCount = n * n ;

        int i = 0;
        int j = -1;

        int west = 0;
        int south = 1;
        int east = 2;
        int north = 3;

        int direction = west;

        for (int index  = 0; index< itemCount;index++){

            if(direction == west){
                j = j+1;
            }

            if(direction == south){
                i = i+1;
            }

            if(direction == east){
                j = j-1;
            }

            if(direction == north){
                i = i - 1;
            }

            // changeDirection
            if(i >= n || j >= n || i<0 || j < 0 || matrix[i][j] > 0 ){
                direction = (direction + 1 ) % 4;
                if(direction == west){
                    i = i+1;
                    j = j+1;
                }
                if(direction == south){
                    j = j-1;
                    i = i+1;
                }
                if(direction == east){
                    j = j - 1;
                    i = i - 1;
                }
                if(direction == north){
                    j = j +1;
                    i = i -1;
                }
            }

            matrix[i][j] = index +1;
        }
        return matrix;
    }
}

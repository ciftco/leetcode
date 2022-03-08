package com.ciftci.leetcode.datastructures2;

public class Bak_PerformansDahaiyiOlabilir_E10_240_Search2DMatrixII {

    public static void main(String[] args) {

    }


    public boolean searchMatrix(int[][] matrix, int target) {

        int heignt = matrix.length;
        int width = matrix[0].length;

        int heightEnd = heignt;
        int widthEnd = width;

        for(int i = 0; i < heignt; i++) {
            int value = matrix[i][0];
            if(value == target)
                return  true;
            if ( value > target ){
                heightEnd = i;
            }
        }


        for(int i = 0; i < width; i++) {
            int value = matrix[0][i];
            if(value == target)
                return  true;
            if ( value > target ){
                widthEnd = i;
            }
        }


        for (int i = 0; i < heightEnd; i++){
            for (int j = 0; j < widthEnd; j++){
                int value = matrix[i][j];
                if(value  == target){
                    return  true;
                }
            }
        }

        return false;
    }
}

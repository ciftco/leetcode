package com.ciftci.leetcode.algorithm1;

import java.util.ArrayList;
import java.util.List;

public class Bak_EX_542_01Matrix {


    public static void main(String[] args) {
        int[][] mat = new int[][] {{0,1,0,1,1},{1,1,0,0,1},{0,0,0,1,0},{1,0,1,1,1},{1,0,0,0,1}};

        new Bak_EX_542_01Matrix().updateMatrix(mat);
    }

    public int[][] updateMatrix(int[][] mat) {

        int height = mat.length;
        int width = mat[0].length;

        int [][] result = new int[height][width];

        for (int i = 0; i< height; i++){
            for (int j = 0; j < width;j++){
                boolean[][] isVisited = new boolean[height][width];
                int distance = calculate(i,j,mat,0, isVisited);
                result[i][j] = distance;
            }
        }
        return result;

    }

    private boolean[][] copyArr(boolean[][] arr){
        int height = arr.length;
        int width = arr[0].length;

        boolean[][] newArr = new  boolean[height][width];

        for(int i = 0; i<height;i++){
            for(int j = 0; j < width ; j++){
                newArr[i][j] = arr[i][j];
            }
        }

        return newArr;
    }

    private int  calculate(int i, int j, int[][] mat, int distance, boolean[][] isVisited) {

        int height = mat.length;
        int width = mat[0].length;

        isVisited[i][j] = true;

        int value = mat[i][j];

        if (value == 1) {
            if (value == 1) {
                distance = distance + 1;
                List<Integer> results = new ArrayList<>();
                if (i + 1 < height && !isVisited[i + 1][j]) {
                    boolean[][] arr2 = copyArr(isVisited);
                    int dist = calculate(i + 1, j, mat, distance, arr2);
                    results.add(dist);
                }
                if (i - 1 >= 0 && !isVisited[i - 1][j]) {
                    boolean[][] arr2 = copyArr(isVisited);
                    int dist = calculate(i - 1, j, mat, distance, arr2);
                    results.add(dist);
                }

                if (j + 1 < width && !isVisited[i][j + 1]) {
                    boolean[][] arr2 = copyArr(isVisited);
                    int distance4 = calculate(i, j + 1, mat, distance, arr2);
                    results.add(distance4);
                }
                if (j - 1 >= 0 && !isVisited[i][j - 1]) {
                    boolean[][] arr2 = copyArr(isVisited);
                    int distance5 = calculate(i, j - 1, mat, distance, arr2);
                    results.add(distance5);
                }

                int min = Integer.MAX_VALUE;
                for (int index = 0; index < results.size(); index++) {
                    min = Math.min(min, results.get(index));
                }

                return min;
            }

            return distance;
        }
        return distance;
    }
}

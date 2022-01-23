package com.ciftci.leetcode.algorithm1;

public class EX_733_FloodFill {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];



    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] isVisited = new boolean[image.length][image[0].length];

        int currentColor =  image[sr][sc];
        fillArr(image, sr  , sc, currentColor, newColor, isVisited );

        return image;
    }

    public void fillArr(int[][] image, int  i,int  j , int currentColor, int newColor, boolean[][] isVisited){
        if(i < 0 || j< 0)
            return;

        if(i>= image.length || j >= image[0].length){
            return;
        }

        boolean isvisited = isVisited[i][j];
        if(isvisited) {
            return;
        }

        int color = image[i][j];
        if(color == currentColor ){
            image[i][j] = newColor;
        }else{
            return;
        }

        isVisited[i][j] = true;

        fillArr(image, i - 1 , j, currentColor, newColor, isVisited );
        fillArr(image, i + 1 , j, currentColor, newColor, isVisited );
        fillArr(image, i , j -1 , currentColor, newColor, isVisited );
        fillArr(image, i , j + 1, currentColor, newColor, isVisited );

    }
}

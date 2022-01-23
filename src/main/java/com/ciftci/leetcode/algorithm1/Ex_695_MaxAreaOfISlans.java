package com.ciftci.leetcode.algorithm1;

public class Ex_695_MaxAreaOfISlans {

    public static void main(String[] args) {
        int[][] grid = new int[][] { {0,0,1,0,0,0,0,1,0,0,0,0,0} , {0,0,0,0,0,0,0,1,1,1,0,0,0} , {0,1,1,0,1,0,0,0,0,0,0,0,0} , {0,1,0,0,1,1,0,0,1,0,1,0,0} , {0,1,0,0,1,1,0,0,1,1,1,0,0}, {0,0,0,0,0,0,0,0,0,0,1,0,0}, {0,0,0,0,0,0,0,1,1,1,0,0,0}, {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int maxArea = new Ex_695_MaxAreaOfISlans().maxAreaOfIsland(grid);
        System.out.println(maxArea);
    }

    public int maxAreaOfIsland(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        boolean[][] isVisited = new boolean[height][width];

        int maxArea = 0;
        for (int i = 0; i < height; i++ ){
            for (int j = 0; j < width; j++ ){
                int area =  calculateArea(i,j, grid,isVisited, 0);
                maxArea = Math.max(maxArea , area);
            }

        }

        return maxArea;
    }

    private int calculateArea(int i, int j, int[][] grid, boolean[][] isVisited, int area) {

        if(i< 0 || j<0)
            return area;
        int height = grid.length;
        int width = grid[0].length;

        if(i>= height || j >= width){
            return area;
        }

        boolean isVisit = isVisited[i][j];
        if(isVisit) {
            return area;
        }

        isVisited[i][j] = true;

        int cellValue = grid[i][j];

        if(cellValue == 1){
            area += 1;
            area = calculateArea(i-1, j, grid, isVisited, area);
            area = calculateArea(i +1, j, grid, isVisited, area);
            area = calculateArea(i, j-1, grid, isVisited, area);
            area = calculateArea(i, j +1, grid, isVisited, area);
        }

        return area;
    }
}

package com.ciftci.leetcode.algorithm2;

public class S11_ContainerWithMostWater {

	// tuned solution
	public int maxArea(int[] height) {
		int start = 0 ;
		int end = height.length -1;
		int result  = 0;
		while (start < end ){
			int h1 = height[start];
			int h2 = height[end];
			int h = Math.min(h1,h2);

			int width = end-start;
			int area = width * h;
			result = Math.max(area, result);

			if(h1 > h2){
				end--;
			}
			if( h1 <= h2){
				start++;
			}
		}
		return result;
	}

	// brute force Implementation
	public int maxArea2(int[] height) {
		int max = 0;
		for (int i = 0; i < height.length -1 ; i++){
			for (int j = i+1; j <  height.length; j++){
				int height1 = height[i];
				int height2 = height[j];

				int h = Math.min(height1, height2);
				int len = j - i;
				int area  = len * h;
				max = Math.max(area, max);
			}
		}
		return max;
	}
}

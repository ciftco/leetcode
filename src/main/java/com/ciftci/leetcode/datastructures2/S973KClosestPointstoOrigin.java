package com.ciftci.leetcode.datastructures2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class S973KClosestPointstoOrigin {
	public static void main(String[] args) {
		S973KClosestPointstoOrigin a = new S973KClosestPointstoOrigin();

		int[][] points ={{1,3},{-2,2}};

		a.kClosest(points, 1);
	}
	public int[][] kClosest(int[][] points, int k) {

		int length = points.length;
		List<Point> pointList = new ArrayList<>();
		for (int i = 0; i <  length; i++){
			int[] point = points[i];
			int x = point[0];
			int y = point[1];

			Point p = new Point(point, x*x + y * y);
			pointList.add(p);
		}

		List<Point> orderedList = pointList.stream().sorted((x, y) -> {
			return x.getDistance() < y.getDistance() ? -1 : 1;
		}).collect(Collectors.toList());

		int[][] result = new int[k][2] ;
		for(int i = 0; i < k  ; i++){
			result[i] = orderedList.get(i).getCordinates();
		}

		return result;


	}

	private class Point {
		private int[] cordinates;
		private int distance;

		public Point(int[] cordinates, int distance){
			this.cordinates = cordinates;
			this.distance = distance;
		}

		public int getDistance() {
			return distance;
		}

		public int[] getCordinates() {
			return cordinates;
		}
	}


}

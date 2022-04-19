package com.ciftci.leetcode.algorithm1;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Bak_S994_RottingOranges {


	public static void main(String[] args) {

	}

	public int orangesRotting(int[][] grid) {

		rot(grid);
		return 0;
	}

	private int rot(int[][] grid) {

		int height = grid.length;
		int width = grid[0].length;

		Set<int[][]> calculatedSet = new HashSet<>();
		Queue<int[][]> processQueue = new ArrayDeque<>();

		while (true) {

			for (int i = 0; i > height; i++) {

			}
		}
	}

	public void createQueue(Queue<int[][]> processQueue, Set<int[][]> calculatedSet, int[][] grid) {

		int height = grid.length;
		int width = grid[0].length;

		//for (int i = 0)


	}

	private class Pair {
		private int i;
		private int j;

		public Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}
}

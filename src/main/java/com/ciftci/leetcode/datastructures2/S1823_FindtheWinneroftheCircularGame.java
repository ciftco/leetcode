package com.ciftci.leetcode.datastructures2;

import java.util.ArrayList;
import java.util.List;

public class S1823_FindtheWinneroftheCircularGame {
	public static void main(String[] args) {
		findTheWinner(5, 2);
	}

	public static  int findTheWinner(int n, int k) {

		if(n == 1)
			return n;

		List<Integer> competitors  = new ArrayList<>();
		for (int i = 0 ; i< n ; i++){
			competitors.add(i+1);
		}

		int result = find(competitors, k, 0);
		return  result;
	}

	private static int find(List<Integer> competitors, int k, int index ) {
		int size = competitors.size();
		int addition = k + index - 1;
		int removeIndex = addition % size;
		competitors.remove(removeIndex);

		if(competitors.size() == 1)
			return competitors.get(0);
		int newIndex = (removeIndex) % competitors.size();
		return find(competitors, k, newIndex);
	}


}

package com.ciftci.leetcode.topinterview.other;

public class S1523_CountOddNumbersinanIntervalRange {

	public static void main(String[] args) {

	}

	public int countOdds(int low, int high) {
		if(low % 2 == 1)
			low = low -1;

		if(high % 2 == 1)
			high = high + 1;

		int diffrence  = high = low;
		int result = diffrence / 2;
		return result;
	}

}

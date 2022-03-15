package com.ciftci.leetcode.algorithm2;

import java.util.ArrayList;
import java.util.List;

public class S986_IntervalListIntersections {

	public static void main(String[] args) {

		int[][] first  = new int[][] {{0,2},{5,10},{13,23},{24,25}};
		int[][] second  = new int[][] {{1,5},{8,12},{15,24},{25,26}} ;

		S986_IntervalListIntersections item = new S986_IntervalListIntersections();
		int[][] ints = item.intervalIntersection(first, second);

	}

	public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

		int firstIndex = 0;
		int secondIndex = 0;

		int firstLentgh = firstList.length;
		int secondLentgh = secondList.length;

		List<Integer> start = new ArrayList<>();
		List<Integer> end = new ArrayList<>();


		while(firstIndex != firstLentgh && secondIndex != secondLentgh){
			int[] firstElement = firstList[firstIndex];
			int[] secondElement = secondList[secondIndex];

			int firstStart = firstElement[0];
			int firstEnd = firstElement[1];

			int secondStart = secondElement[0];
			int secondEnd = secondElement[1];

			if((secondStart >= firstStart && secondStart <= firstEnd) || (firstStart >= secondStart && firstStart <= secondEnd)  ){
				int intervalstart = Math.max(firstStart, secondStart);
				int intervalEnd = Math.min(firstEnd, secondEnd);
				start.add(intervalstart);
				end.add(intervalEnd);

				if(intervalEnd == firstEnd){
					firstIndex++;
				}

				if(intervalEnd == secondEnd){
					secondIndex++;
				}

				continue;
			}

			if(secondEnd<firstEnd)
				secondIndex++;

			if(secondEnd>firstEnd)
				firstIndex++;

		}

		int lengthArr = start.size();

		int[][] result = new int[lengthArr][2];

		for(int i = 0;i<lengthArr;i++){
			int startIndex = start.get(i);
			int endIndex = end.get(i);

			result[i][0] = startIndex;
			result[i][1] = endIndex;
		}

		return result;

	}
}

package com.ciftci.leetcode.datastructures2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class S347_TopKFrequentElements {
	public static void main(String[] args) {

	}

	public int[] topKFrequent(int[] nums, int k) {

		Map<Integer, Element> frequencyMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++){
			int num = nums[i];
			Element element = frequencyMap.getOrDefault(num, new Element(num, 0));
			element.setFrequency(element.frequency + 1);
			frequencyMap.put(num, element);
		}

		List<Element> collect = frequencyMap.values().stream().sorted((x,y) -> {
			if(x.getFrequency() == y.getFrequency())
			return 0;
			return  x.getFrequency() < y.getFrequency() ? 1 : -1;
		}
		).collect(Collectors.toList());

		int[] result = new int[k];
		for (int i = 0; i < k ; i++){
			 result[i] = collect.get(i).getNum();
		}
		return result;
	}

	private class Element
	{
		private int frequency ;
		private int num;

		public Element(int num , int frequency){
			this.frequency = frequency;
			this.num = num;
		}

		public int getFrequency() {
			return frequency;
		}

		public void setFrequency(int frequency) {
			this.frequency = frequency;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}
	}
}

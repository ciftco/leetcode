package com.ciftci.leetcode.topinterview.other.hard;

import java.util.*;

public class S380_InsertDeleteGetRandomO1 {

	public static void main(String[] args) {
		RandomizedSet s = new RandomizedSet();
		s.insert(3);
		s.insert(3);
		s.getRandom();
		s.getRandom();
		s.insert(1);
		s.remove(3);
		s.getRandom();
		s.getRandom();
		s.insert(0);
		s.remove(0);
	}

	static class RandomizedSet {

		private List<Integer> backingStoreList;
		private Map<Integer, Integer> frequencyMap;
		private Random random;

		public RandomizedSet() {
			this.backingStoreList = new ArrayList<>();
			this.frequencyMap = new HashMap<>();
			this.random = new Random();
		}

		public boolean insert(int val) {

			int count = frequencyMap.getOrDefault(val, 0);
			boolean result = count == 0;
			if(result) {
				frequencyMap.put(val, count + 1);
				backingStoreList.add(val);
			}
			return result;

		}

		public boolean remove(int val) {
			int count = frequencyMap.getOrDefault(val, 0);
			boolean result = count != 0;

			if(result){
				backingStoreList.remove((Integer) val);
				frequencyMap.remove(val);
			}
			return result;
		}

		public int getRandom() {
			int size = backingStoreList.size();
			int index = random.nextInt(size);
			Integer result = backingStoreList.get(index);
			return result;
		}
	}



}

package com.ciftci.leetcode.datastructures2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class S1557_MinimumNumberofVerticestoReachAllNodes {
	public static void main(String[] args) {

	}

	public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

		Set<Integer> froms = new HashSet<>();
		Set<Integer> tos = new HashSet<>();

		for (List<Integer> item : edges){
			Integer from = item.get(0);
			Integer to = item.get(1);
			froms.add(from);
			tos.add(to);
		}

		for (int to : tos){
			froms.remove(to);
		}
		List<Integer> result = froms.stream().collect(Collectors.toList());
		return result;
	}
}

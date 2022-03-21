package com.ciftci.leetcode.topinterview.other.medium;

import java.util.HashMap;
import java.util.Map;

public class S1302_DeepestLeavesSum {



	public int deepestLeavesSum(TreeNode root) {
		Map<Integer, Integer> levelSum = new HashMap<>();
		calculateSum(root, 1, levelSum );

		Integer level = levelSum.keySet().stream().max(Integer::compare).get();
		int result = levelSum.get(level);

		return result;
	}

	private void calculateSum(TreeNode node, int level, Map<Integer, Integer> levelSum){
		if(node == null) {
			return;
		}

	    levelSum.put(level,  levelSum.getOrDefault(level, 0) + node.val);
		calculateSum( node.left, level + 1, levelSum);
		calculateSum( node.right, level + 1, levelSum);
	}


	public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

}

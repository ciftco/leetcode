package com.ciftci.leetcode.topinterview.other.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class S1305_AllElementsinTwoBinarySearchTrees {


	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		List<Integer> result = new ArrayList<>();

		travese(root1, result);
		travese(root2, result);

		result = result.stream().sorted().collect(Collectors.toList());
		return result;
	}

	private void travese(TreeNode node, List<Integer> result ){
		if(node == null)
			return;

		result.add(node.val);
		travese(node.left, result);
		travese(node.right, result);
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

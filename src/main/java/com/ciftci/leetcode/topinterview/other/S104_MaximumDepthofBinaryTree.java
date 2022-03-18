package com.ciftci.leetcode.topinterview.other;

public class S104_MaximumDepthofBinaryTree {


	public int maxDepth(TreeNode root) {

		if(root == null)
			return 0;

		int left = root.left != null ?  maxDepth(root.left) +1  :0 ;
		int rigght = root.left != null  ?  maxDepth(root.right) + 1 : 0 ;
		int result = Math.max(left, rigght);

		return result;
	}


	 class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}


}

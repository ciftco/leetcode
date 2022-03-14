package com.ciftci.leetcode.algorithm1;

public class S617_MergeTwoBinaryTrees {


    public static void main(String[] args) {

    }




    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        TreeNode  head = traverse(root1, root2);

        return head;

    }

    private TreeNode traverse(TreeNode root1, TreeNode root2) {

        if(root1 == null && root2 == null){
            return null;
        }

        if(root1 != null && root2 == null){
            TreeNode nodeleft = traverse(root1.left , null);
            TreeNode nodeRight = traverse(root1.right , null);

            TreeNode node = new TreeNode(root1.val, nodeleft, nodeRight );
            return node;
        }

        if(root1 == null && root2 != null){
            TreeNode nodeleft = traverse(null , root2.left);
            TreeNode nodeRight = traverse(null , root2.right);

            TreeNode node = new TreeNode(root2.val, nodeleft, nodeRight );
            return node;
        }


        TreeNode nodeleft = traverse(root1.left , root2.left);
        TreeNode nodeRight = traverse(root1.right , root2.right);


        TreeNode node = new TreeNode(root2.val + root1.val , nodeleft, nodeRight );
        return node;
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

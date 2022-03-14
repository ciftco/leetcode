package com.ciftci.leetcode.algorithm1;

import java.util.ArrayList;
import java.util.List;

public class S116_PopulatingRightPointers {


    public static void main(String[] args) {

    }


    public Node connect(Node root) {

        if(root == null){
            return root;
        }

        if(root.left == null)
        {
            return root;
        }
        List< List<Node>> levels = new ArrayList<>();
        List<Node> initialNode = new ArrayList<>();
        initialNode.add(root);
        returnLevels(initialNode, levels);


        for (List<Node> nodes : levels){
            int size = nodes.size();

            for (int i = 0 ; i <size -1 ; i++ ){
                nodes.get(i).next = nodes.get(i+1);
            }

        }

        return root;
    }
    private void returnLevels(List<Node> nodeList , List<List<Node>> levels) {

        List<Node> childNodeList = new ArrayList<>();
        for (Node node : nodeList){
            if(node.left == null){
                return;
            }
            childNodeList.add(node.left);
            childNodeList.add(node.right);
        }
        levels.add(childNodeList);
        returnLevels(childNodeList, levels);
    }


    /*private void connectInternal(Node left, Node right, Node next) {

        left.next = right;
        right.next = next;

        if(left.left != null) {
            connectInternal(left.left, left.right, right.left);
            connectInternal(right.left, right.right, null);
        }
    }


     */


    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }




}

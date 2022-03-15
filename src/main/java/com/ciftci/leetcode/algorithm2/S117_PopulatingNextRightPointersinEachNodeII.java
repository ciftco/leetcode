package com.ciftci.leetcode.algorithm2;

import java.util.*;

public class S117_PopulatingNextRightPointersinEachNodeII {

	public static void main(String[] args) {

	}


	public Node connect(Node root) {
		Map<Integer, List<Node>> nodeMap = new HashMap<>();
		traverse(root, 1, nodeMap);

		for (Map.Entry<Integer, List<Node>> entry : nodeMap.entrySet()){
			List<Node> list = entry.getValue();
			int listSize = list.size();

			for (int i = 0; i < listSize -1; i++){
				Node node1 = list.get(i);
				Node node2 = list.get(i + 1);
				node1.next = node2;
			}
		}

		return root;
	}

	public void traverse(Node node, int level, Map<Integer, List<Node>> nodeMap){
		Node left = node.left;
		Node right = node.right;

		List<Node> levelList = nodeMap.getOrDefault(level, new ArrayList<>());

		if(left != null) {
			levelList.add(left);
			traverse(left, level + 1, nodeMap);
		}

		if(right != null) {
			levelList.add(right);
			traverse(right, level+1, nodeMap);
		}

		nodeMap.put(level, levelList);
	}


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

package com.ciftci.leetcode.topinterview.other;

public class S237_DeleteNodeinaLinkedList {


	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode l = new ListNode(3);
	}


	public static class Solution {
		public void deleteNode(ListNode node) {
			node.val = node.next.val;
			node.next = node.next.next;
		}
	}

	 public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}

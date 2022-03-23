package com.ciftci.leetcode.topinterview.other.medium;

import java.util.Stack;

public class S61_RotateList {

	public ListNode rotateRight(ListNode head, int k) {

		Stack<ListNode> stack = new Stack<>();
		int nodeCount = 0;
		ListNode pointer = head;
		while(pointer != null){
			stack.push(pointer);
			nodeCount++;
			pointer = pointer.next;
		}

		int shift = k % nodeCount;

		for (int i = 0; i<shift;i++){
			ListNode pop = stack.pop();
			pop.next = head;
			head = pop;
			stack.peek().next = null;
		}
		return head;

	}

   public class ListNode {
	   int val;
	   ListNode next;

	   ListNode() {
	   }

	   ListNode(int val) {
		   this.val = val;
	   }

	   ListNode(int val, ListNode next) {
		   this.val = val;
		   this.next = next;
	   }
   }
}

package com.ciftci.leetcode.topinterview.other.medium;

import java.util.Stack;

public class S92_ReverseLinkedListII {

	public static void main(String[] args) {

		S92_ReverseLinkedListII thiss = new S92_ReverseLinkedListII();
		thiss.run();
	}

	private void run(){
		ListNode head = new ListNode(1, new ListNode( 2, new ListNode( 3, new ListNode(4 , new ListNode(5)))));
		reverseBetween(head, 2,4);

	}
	public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode pointer = head;
		ListNode before = null;
		for(int i = 0; i<left-1; i++){
			before = pointer;
			pointer = pointer.next;
			if(pointer == null){
				return head;
			}
		}

		Stack<ListNode> stack = new Stack<>();

		for(int i = 0; i < right - left + 1 ;i++ )
		{
			stack.push(pointer);
			before.next = pointer.next;
		}

		while (!stack.isEmpty()){
			ListNode node = stack.pop();
			node.next = before.next;
			before.next = node;
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

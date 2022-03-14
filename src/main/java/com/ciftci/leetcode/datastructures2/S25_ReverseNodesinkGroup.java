package com.ciftci.leetcode.datastructures2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class S25_ReverseNodesinkGroup {

	public static void main(String[] args) {
	    ListNode list = new ListNode(1, new ListNode(2,  new ListNode (3,new ListNode(4, new ListNode(5)))));
		ListNode listNode = reverseKGroup(list, 3);
	}

	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode ponter = head;
		ListNode before = null;
		List <ListNode> reverseList = new ArrayList<>();

		while (ponter != null){
			reverseList.add(ponter);
			if(reverseList.size() == k) {
				ListNode afterNode = ponter.next;
				ListNode listNode = reverseList(reverseList);

				if (before != null){
					before.next = listNode;
				}
				if (before == null){
					ListNode listNode1 = reverseList.get(reverseList.size() - 1);
					head = listNode1;
				}

				before = reverseList.get(0);
				before.next = afterNode;

				ponter = before;
				reverseList.clear();
			}
			ponter = ponter.next;
		}
		return head;
	}

	private static ListNode reverseList(List<ListNode> nodelist){
		Stack<ListNode> stack = new Stack<>();
		for (ListNode node : nodelist){
			stack.push(node);
		}

		ListNode newHead = stack.pop();
		ListNode pointer =newHead;

		while (!stack.isEmpty()){
			ListNode node = stack.pop();
			pointer.next = node;
			pointer = node;
		}

		pointer.next = null;
		return newHead;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

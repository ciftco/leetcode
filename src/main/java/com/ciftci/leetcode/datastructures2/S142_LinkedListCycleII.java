package com.ciftci.leetcode.datastructures2;

import java.util.HashSet;
import java.util.Set;

public class S142_LinkedListCycleII {
	public static void main(String[] args) {

	}

	public ListNode detectCycle(ListNode head) {
		ListNode pointer = head;
		Set<ListNode> nodes = new HashSet<>();
		while (pointer != null){
			if(nodes.contains(pointer)){
				return pointer;
			}
			nodes.add(pointer);
			pointer = pointer.next;
		}
		return null;
	}


	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val,ListNode next) {
			this.val = val;
			this.next = next;
		}
	}



}

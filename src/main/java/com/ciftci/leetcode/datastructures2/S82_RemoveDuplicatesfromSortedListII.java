package com.ciftci.leetcode.datastructures2;

public class S82_RemoveDuplicatesfromSortedListII {
	public static void main(String[] args) {

	}

	public ListNode deleteDuplicates(ListNode head) {

		ListNode pointer = head;
		ListNode before = null;

		while (pointer != null && pointer.next != null) {
			int currentvalue = pointer.val;
			if (currentvalue == pointer.next.val) {
				while (pointer != null && pointer.val == currentvalue) {
					if (before != null) {
						before.next = pointer.next;
					}
					if (before == null) {
						head = head.next;
					}
					pointer = pointer.next;
				}
			}

			if (pointer != null && pointer.val == currentvalue) {
				before = pointer;
				pointer = pointer.next;
			}
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

package com.ciftci.leetcode.topinterview.other.medium;

public class Tamamla_S86_PartitionList {



	public ListNode partition(ListNode head, int x) {

		ListNode pointer = head;
		ListNode before = null;


		boolean start = false;


		while (pointer != null ) {
			if (pointer.val >= x) {
				start = true;
			}
			if(start && pointer.val < x){

			}
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

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}

package com.ciftci.leetcode.topinterview.other.medium;

public class S2181_MergeNodesinBetweenZeros {

	public ListNode mergeNodes(ListNode head){

		ListNode pointer = head;
		ListNode result = null;
		ListNode resultPointer = null;

		while(pointer != null){
			if(pointer.val == 0 && pointer.next != null){
				ListNode node = new ListNode(0);
				if(result == null){
					result = node;
					resultPointer = node;
				}else{
					resultPointer.next = node;
					resultPointer = node;
				}
				pointer = pointer.next;
				continue;
			}
			if(pointer.val == 0 && pointer.next == null) {
				pointer = pointer.next;
				continue;
			}

			resultPointer.val = result.val + pointer.val;
			pointer = pointer.next;


		}

		return result;
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

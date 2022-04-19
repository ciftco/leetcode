package com.ciftci.leetcode.topinterview.other.medium;

import java.util.ArrayList;
import java.util.List;

public class S86_PartitionList {

	public static void main(String[] args) {
		S86_PartitionList thiss = new S86_PartitionList();
		thiss.run();
	}

	private void run(){
		//[1,4,3,0,2,5,2]
		ListNode head = new ListNode(1, new ListNode( 4, new ListNode( 3, new ListNode(0 , new ListNode(2, new ListNode(5, new ListNode(2)))))));
		partition(head, 3);

	}

	public ListNode partition(ListNode head, int x) {

		ListNode pointer = head;
		ListNode before = null;
		ListNode insertionNode = null;

		List<ListNode> store  =new ArrayList<>();

		boolean start = false;

		while (pointer != null ) {
			if (pointer.val >= x && !start) {
				start = true;
			}
			if(start && pointer.val < x){
				store.add(pointer);
				before.next = pointer.next;
				pointer = pointer.next;
				continue;

			}
			before = pointer;
			pointer = pointer.next;
		}
		if(store.size() == 0)
			return head;

		pointer = head;

		before = null;
		while (pointer != null ) {
			if (pointer.val >= x) {

				if(before == null){
					before = store.get(0);
					store.remove(0);
					before.next = head;
					head = before;
				}

				for(ListNode node : store){
					ListNode temp = before.next;
					before.next = node;
					node.next = temp;
					before = node;
				}
				break;
			}
			before = pointer;
			pointer = pointer.next;
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

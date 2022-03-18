package com.ciftci.leetcode.topinterview.other.hard;

public class S23_MergekSortedLists {

	public static void main(String[] args) {

	}

	public ListNode mergeKLists(ListNode[] lists) {

		ListNode head = null;
		ListNode pointer = null ;
		while(true){
			int minval = Integer.MAX_VALUE;
			int minIndex = -1;
			boolean finish = true;
			for (int i = 0 ; i < lists.length;i++){
				ListNode list = lists[i];
				if(list == null) {
					continue;
				}

				finish = false;
				int val = list.val;
				if(minval > val){
					minval = val;
					minIndex = i;
				}
			}


			if(finish == true)
				break;

			ListNode minNode = lists[minIndex];
			int val = minNode.val;
			ListNode node = new ListNode(val);
			minNode = minNode.next;
			lists[minIndex] = minNode;

			if(head == null){
				head = node;
				pointer = node;
			}else{
				pointer.next = node;
				pointer = node;
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

package com.ciftci.leetcode.datastructures2;

import java.util.HashSet;
import java.util.Set;

public class S160_IntersectionofTwoLinkedLists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> list1Set = new HashSet<>();
		ListNode pointer = headA;
		while (pointer != null){
			list1Set.add(pointer);
			pointer = pointer.next;
		}

		pointer = headB;
		while (pointer != null){
			boolean contains = list1Set.contains(pointer);
			if(contains){
				return pointer;
			}
			pointer = pointer.next;

		}
		return null;
	}
}

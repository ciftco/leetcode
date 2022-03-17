package com.ciftci.leetcode.topinterview.other;

public class S1290_ConvertBinaryNumberinaLinkedListtoInteger {

	public static void main(String[] args) {


		ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
		S1290_ConvertBinaryNumberinaLinkedListtoInteger thiss = new S1290_ConvertBinaryNumberinaLinkedListtoInteger();
		int decimalValue = thiss.getDecimalValue(head);

	}


	public int getDecimalValue(ListNode head) {

		ListNode pointer  = head;
		StringBuilder builder = new StringBuilder();
		while(pointer != null){
			int val = pointer.val;
			builder.append(val);
			pointer = pointer.next;
		}

		String binaryNumber = builder.toString();

		int stringLength = binaryNumber.length();
		int total = 0;
		for (char character : binaryNumber.toCharArray()){
			int  num = Integer.valueOf(new String(new char[]{character}));
			total = total +  (int )( num * Math.pow(2, stringLength -1));
			stringLength--;

		}
		return total;
	}



	 public static class ListNode {
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

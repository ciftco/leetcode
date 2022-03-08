package com.ciftci.leetcode.datastructures2;

public class EX_2_AddNumbers {

    //https://leetcode.com/problems/add-two-numbers/
    public static void main(String[] args) {


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int addition = 0;

        ListNode head = null;
        ListNode pointer = null;


        while (l1 != null || l2 != null){
            int l1Val = 0 ,l2Val = 0;

            if(l1 != null){
                l1Val = l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                l2Val = l2.val;
                l2 = l2.next;
            }

            int total = l1Val + l2Val;
            int nodeVal = (total + addition) % 10 ;
            addition =  (total + addition ) / 10;
            ListNode node = new ListNode(nodeVal);
            if(head == null){
                head = node;
                pointer = node;
            }else{
                pointer.next =node;
                pointer = pointer.next;
            }


        }

        if(addition != 0){
            ListNode node = new ListNode(addition);
            pointer.next = node;
        }

        return head;
    }

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

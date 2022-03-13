package com.ciftci.leetcode.datastructures2;

public class S24_SwapNodesInPairs {

    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        ListNode pointer = head;
        ListNode previous = null;

        while(pointer != null && pointer.next != null){
            ListNode nextNode = pointer.next;
            pointer.next = nextNode.next;
            nextNode.next = pointer;
            if(previous != null){
                previous.next = nextNode;
            }
            if(previous == null){
                head = nextNode;
            }
            previous = pointer;
            pointer = pointer.next;
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


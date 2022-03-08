package com.ciftci.leetcode.datastructures2;

import java.util.Stack;

public class EX_143_ReoderList {

    public static void main(String[] args) {

        EX_143_ReoderList thiss = new EX_143_ReoderList();
        thiss.run();;

    }

    private void run(){
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1,node2);
        reorderList(head);
    }



    public void reorderList(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        ListNode pointer = head;
        int max = 0;
        while(pointer != null){
            stack.push(pointer);
            pointer = pointer.next;
        }

        pointer = head;
        while (pointer.next != null && pointer.next.next != null){
            ListNode insertionNode = stack.pop();
            insertionNode.next = pointer.next;
            pointer.next = insertionNode;
            ListNode peekNode = stack.peek();
            peekNode.next = null;
            pointer = pointer.next.next;
        }
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

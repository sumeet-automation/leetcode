package com.learning.linkedlistandtree.predefine;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createListFromArray(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        ListNode head = new ListNode(array[0]);
        ListNode current = head;

        for (int i = 1; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }

        return head;
    }

    private void traverse(){
        ListNode curr = this;
        while (curr != null) {
            System.out.println(curr.val);
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(18);
        ListNode l4 = new ListNode(80);

        ListNode head = l1;
        head.next= l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=null;

        head.traverse();
    }

}
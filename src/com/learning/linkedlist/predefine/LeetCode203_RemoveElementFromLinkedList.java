package com.learning.linkedlist.predefine;

public class LeetCode203_RemoveElementFromLinkedList {

    public ListNode removeElements(ListNode head, int val) {
        ListNode current=head;
        while (current != null) {
            if (current.val == val) {
                current=current.next;
            }
        }
        return head;
    }
}

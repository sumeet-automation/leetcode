package com.learning.linkedlist;

import com.learning.linkedlist.predefine.ListNode;

public class LeetCode2807_InsertGreatestCommonDivisorInLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode copy = head;
        while (copy.next != null) {
            ListNode dummy = new ListNode();
            dummy.val = findGreatestCommonDivisors(copy.val, copy.next.val);
            dummy.next = copy.next;
            copy.next = dummy;
            copy = dummy.next;
        }
        return head;
    }

    private int findGreatestCommonDivisors(int num1, int num2) {
        int gcd = 1;
        int min = Math.min(num1, num2);
        for (int i = 2; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private int findGreatestCommonDivisorsRecursion(int a, int b) {
        if (b == 0) return a;
        return findGreatestCommonDivisorsRecursion(b, a % b);
    }
}

package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.ListNode;
import com.learning.linkedlistandtree.predefine.TreeNode;

import java.util.*;
import java.util.function.Function;

public class L897 {

    public static void main(String[] args) {
        var head = ListNode.createListFromArray(new Integer[]{1, 2, 31});
        L897 solution = new L897();
        solution.reverseList(head);
    }

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        //int p1=0;
        node = head;
        while (node != null && node.val == stack.pop()) {
            node = node.next;
        }
        return node == null;
    }

    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        //node = new ListNode(stack.pop());
        //node.next=null;

        //ListNode head = new ListNode(array[0]);
        ListNode current = new ListNode(stack.pop());

        while (!stack.empty()) {
            // node
            current.next = new ListNode(stack.pop());
            current = current.next;
            //System.out.println(node.val);
        }
//node.next = null;
        return current;
    }

}

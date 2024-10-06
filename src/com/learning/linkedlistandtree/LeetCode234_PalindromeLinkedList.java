package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.ListNode;

import java.util.Stack;

public class LeetCode234_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while (node!=null){
            stack.push(node.next);
            node=node.next;
        }
        //int p1=0;
        for (int i = 0; i <= stack.size()/2; i++) {
            if(stack.pop().val!=head.val ) return false;
            head=head.next;
        }
        return true;
    }
}

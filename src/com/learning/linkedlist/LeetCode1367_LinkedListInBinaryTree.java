package com.learning.linkedlist;

import com.learning.linkedlist.predefine.ListNode;
import com.learning.linkedlist.predefine.TreeNode;

public class LeetCode1367_LinkedListInBinaryTree {

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
        if (root.val == head.val) {
            //dfs is preorder traversal
            if (dfs(head, root)) {
                return true;
            }
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    //dfs is preorder traversal
    public boolean dfs(ListNode head, TreeNode node) {
        if(head==null) return true;
        if(node==null) return false;
        if(head.val!=node.val) return false;
        return dfs(head.next,node.left) || dfs(head.next,node.right);
    }
}
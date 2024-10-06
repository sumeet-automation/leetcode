package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

import java.util.Stack;

public class LeetCode98ValidateBinarySearchTree_WIP {
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            int rootValue = stack.peek().val;
            TreeNode node = stack.pop();
            if(node.left!=null){
                stack.push(node.left);
                if(stack.peek().val>rootValue) return false;
            }

            if(node.right!=null){
                stack.push(node.right);
                if(stack.peek().val<rootValue) return false;
            }
        }
        return true;
    }
}

package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode144_PreOrderTraversal {
    private List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

    public List<Integer> preorderTraversalIterative(TreeNode root) {
        if(root==null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }
}

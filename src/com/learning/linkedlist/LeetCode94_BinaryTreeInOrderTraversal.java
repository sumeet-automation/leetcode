package com.learning.linkedlist;

import com.learning.linkedlist.predefine.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode94_BinaryTreeInOrderTraversal {

    public static void main(String[] args) {
        var root = TreeNode.createBasicTreeNode();
        LeetCode94_BinaryTreeInOrderTraversal solution = new LeetCode94_BinaryTreeInOrderTraversal();
        System.out.println(solution.inorderTraversal(root));
    }

    private List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return list;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
    }
}

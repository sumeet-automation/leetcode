package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode94_BinaryTreeInOrderTraversal {

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
        Collections.addAll(list);
    }
}

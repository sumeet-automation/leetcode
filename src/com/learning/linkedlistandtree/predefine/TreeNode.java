package com.learning.linkedlistandtree.predefine;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        // Traverse left subtree
        inorderTraversal(node.left);

        // Visit the root (print value)
        System.out.print(node.val + " ");

        // Traverse right subtree
        inorderTraversal(node.right);
    }

    public static void preorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        // Visit the root (print value)
        System.out.print(node.val + " ");

        // Traverse left subtree
        preorderTraversal(node.left);

        // Traverse right subtree
        preorderTraversal(node.right);
    }

    public static void postorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        // Traverse left subtree
        postorderTraversal(node.left);
        // Traverse right subtree
        postorderTraversal(node.right);
        // Visit the root (print value)
        System.out.print(node.val + " ");
    }

    public static void levelOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        // Use a path to traverse level by level
        Queue<TreeNode> path = new LinkedList<>();
        path.add(root);  // Start with the root node

        while (!path.isEmpty()) {
            TreeNode current = path.poll();
            // Print the value of the current node
            System.out.print(current.val + " ");
            // Enqueue the left child if it exists
            if (current.left != null) {
                path.add(current.left);
            }
            // Enqueue the right child if it exists
            if (current.right != null) {
                path.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree:
        //       1
        //      /  \
        //     2    3
        //    / \  / \
        //   4   5 6 7

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.print("Pre-order Traversal: ");
        preorderTraversal(root);
        System.out.print("In-order Traversal: ");
        inorderTraversal(root);
        System.out.print("Post-order Traversal: ");
        postorderTraversal(root);
        System.out.print("Level-order Traversal: ");
        levelOrderTraverse(root);
    }

    public static TreeNode createBasicTreeNode() {
        /*TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);*/
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        //root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        return root;
    }

    public static TreeNode createTreeFromArray(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int index = 1;
        while (index < array.length) {
            TreeNode current = queue.poll();

            // Create left child
            if (array[index] != null) {
                current.left = new TreeNode(array[index]);
                queue.add(current.left);
            }
            index++;

            // Create right child
            if (index < array.length && array[index] != null) {
                current.right = new TreeNode(array[index]);
                queue.add(current.right);
            }
            index++;
        }
        return root;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "root=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

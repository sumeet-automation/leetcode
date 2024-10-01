package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode104_MaximumDepth {

    public int maxDepthUsingBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                size--;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            if (!queue.isEmpty()) {
                depth++;
            }
        }
        return depth+1;
    }

    //DFS - PostOrder Traversal
    public int maxDepthUsingDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepthUsingDFS(root.left);
        int rightHeight = maxDepthUsingDFS(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}

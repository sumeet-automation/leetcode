package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

import java.util.*;

public class LeetCode515_FindLargestValueonEachTreeRow {

    public static void main(String[] args) {
        LeetCode515_FindLargestValueonEachTreeRow solution = new LeetCode515_FindLargestValueonEachTreeRow();
        TreeNode root = TreeNode.createBasicTreeNode();
        System.out.println(solution.largestValues(root));
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            while(size-- > 0) {
                TreeNode node = q.poll();
                max = Math.max(max, node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            ans.add(max);
        }

        return ans;
    }
}

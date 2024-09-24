package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

public class LeetCode404_SumOFLeftLeaves {

    public static void main(String[] args) {
        var tree = TreeNode.createTreeFromArray(new Integer[]{1,2,3,4,5});
        LeetCode404_SumOFLeftLeaves solution = new LeetCode404_SumOFLeftLeaves();
        System.out.println(solution.sumOfLeftLeaves(tree));
    }
    public int sumOfLeftLeaves(TreeNode root) {
        preOrderTraversal(root);
        return sum;
    }

    private int sum=0;
    private int preOrderTraversal(TreeNode root) {
        if(root==null) return sum;
        preOrderTraversal(root.left);
        if(root.left!=null) sum+=root.left.val;
        preOrderTraversal(root.right);
        if(root.left!=null) sum+=root.left.val;
        return sum;
    }
}

package com.learning.linkedlist;

import com.learning.linkedlist.predefine.TreeNode;

import java.util.Stack;

public class LeetCode112_PathSum {

    public static void main(String[] args) {
        var root = TreeNode.createBasicTreeNode();
        LeetCode112_PathSum solution = new LeetCode112_PathSum();
        System.out.println(solution.hasPathSum(root, 42));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        Stack<TreeNode> nodePath = new Stack<>();
        Stack<Integer> sumPath = new Stack<>();
        nodePath.push(root);
        sumPath.push(root.val);
        while (!nodePath.isEmpty()){
            var temp = nodePath.pop();
            var sumTemp = sumPath.pop();

            if(temp.left==null && temp.right==null && sumTemp==targetSum)
                return true;

            if(temp.right!=null) {
                nodePath.push(temp.right);
                sumPath.push(temp.right.val+sumTemp);
            }

            if(temp.left!=null) {
                nodePath.push(temp.left);
                sumPath.push(temp.left.val+sumTemp);
            }
        }
        return false;
    }
}

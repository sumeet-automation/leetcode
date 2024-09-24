package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;
import java.util.*;
public class LeetCode145_BinaryTreePostOrderTraversal {

    public static void main(String[] args) {
        Integer[] input = {1, null, 2, 3};
        var node = TreeNode.createTreeFromArray(input);
        LeetCode145_BinaryTreePostOrderTraversal solution = new LeetCode145_BinaryTreePostOrderTraversal();
        System.out.println(solution.postorderTraversal(node));
    }

    private List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}

package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

public class LeetCode100_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return (p.val ==q.val) &&isSameTree(p.left,q.left) &&  isSameTree(p.right,q.right);
    }
}

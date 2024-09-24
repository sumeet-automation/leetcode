package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102_LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        queue.offer(root);  // add root in queue
        while (!queue.isEmpty()) {
            int currLevel = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < currLevel; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);  // if curr has any left than add in queue
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right); // if curr has any right than add in queue
                temp.add(queue.poll().val);  // poll will add the curr val in queue and will remove from queue as well
            }
            ans.add(temp);
        }
        return ans;
    }

}

package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_1609 {

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBasicTreeNode();
        LeetCode_1609 solution = new LeetCode_1609();
        System.out.println(solution.isEvenOddTree(root));
    }

    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1;
        if (root.val % 2 == 0) return false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    list.add(node.left.val);
                    queue.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right.val);
                    queue.add(node.right);
                }

            }

            if(list.size()>0){

                //System.out.println(list + " - "+level);
                if (level % 2 == 0) {
                    if(list.size()==1) if(list.getFirst()%2==0) return false;
                    for (int i = 1; i < list.size(); i++) {
                        if(list.get(i-1)>=list.get(i)) return false;
                        if(list.get(i-1)%2==0||list.get(i)%2==0) return false;
                    }
                } else {
                    if(list.size()==1) if(list.getFirst()%2!=0) return false;
                    for (int i = 1; i < list.size(); i++) {
                        if(list.get(i-1)<=list.get(i)) return false;
                        if(list.get(i-1)%2!=0||list.get(i)%2!=0) return false;
                    }
                }
                level++;
                //System.out.println("*******");
            }
        }
        return true;
    }
}

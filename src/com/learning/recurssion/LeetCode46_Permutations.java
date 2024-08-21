package com.learning.recurssion;

import java.util.ArrayList;
import java.util.List;

public class LeetCode46_Permutations {

    public static void main(String[] args) {
        new LeetCode46_Permutations().permute(new int[]{1, 1, 2});
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        permute(nums, new ArrayList<>(), output,0, nums.length, new boolean[nums.length] );
        System.out.println(output);
        return output;
    }

    public void permute(int[] nums, List<Integer> perm, List<List<Integer>> curr, int index, int uptoIndex, boolean[] visited) {
        if(perm.size()==uptoIndex)
        curr.add(new ArrayList<>(perm));
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            perm.add(nums[i]);
            permute(nums,perm,curr,i+1,uptoIndex,visited);
            perm.removeLast();
            visited[i] = false;
        }
    }
}

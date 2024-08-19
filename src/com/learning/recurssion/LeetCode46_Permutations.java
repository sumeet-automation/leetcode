package com.learning.recurssion;

import java.util.ArrayList;
import java.util.List;

public class LeetCode46_Permutations {

    public static void main(String[] args) {
        new LeetCode46_Permutations().permute(new int[]{1, 2, 3});
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        subsets(nums, 0, new ArrayList<>(), output);
        System.out.println(output);
        return output;
    }

    private void subsets(int[] nums, int index, ArrayList<Integer> cur, List<List<Integer>> ans) {
        //if (cur.size() == nums.length)
            ans.add(new ArrayList<>(cur));
        for (int i = index; i < nums.length; i++) {
            cur.add(nums[i]);
            subsets(nums, i + 1, cur, ans);
            cur.removeLast();
        }
    }
}

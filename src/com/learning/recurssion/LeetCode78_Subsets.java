package com.learning.recurssion;

import java.util.ArrayList;
import java.util.List;

public class LeetCode78_Subsets {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        new LeetCode78_Subsets().subsets(array);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        subsets(nums, 0, new ArrayList<>(), output);
        System.out.println(output);
        return output;
    }

    public void subsets(int[] nums, int index, List<Integer> cur, List<List<Integer>> ans) {
        //base
        ans.add(new ArrayList<>(cur));
        for (int i = index; i < nums.length; i++) {
            cur.add(nums[i]);
            subsets(nums, i+1, cur, ans);
            cur.removeLast();
        }
    }
}
/*
    private static void permutationOfArray(int[] array, List<List<Integer>> list, List<Integer> perm) {
        if (array.length==perm.size()) {
            list.add(new ArrayList<>(perm));
        }
        for (int i = 0; i < array.length; i++) {
            if(list.contains(array[i])) continue;;
            perm.add(array[i]);
            permutationOfArray(array, list, perm);
            perm.remove(perm.size() - 1);
        }
    }*/

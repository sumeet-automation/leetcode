package com.learning.recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class WIP_LeetCode77_Combinations {

    public static void main(String[] args) {
        System.out.println(combine(10, 2));
    }

    public static List<List<Integer>> combine(int n, int k) {
        int[] input = IntStream.rangeClosed(1, n).toArray();
        List<List<Integer>> output = new ArrayList<>();
        perm(input, new ArrayList<>(), output, 0, k);
        return output;
    }

    public static void perm(int[] nums, List<Integer> perm, List<List<Integer>> currAns, int index, int uptoIndex) {
        if (perm.size() == uptoIndex)
            currAns.add(new ArrayList<>(perm));
        for (int i = index; i < nums.length; i++) {
            perm.add(nums[i]);
            perm(nums, perm, currAns, i + 1, uptoIndex);
            perm.removeLast();
        }
    }
}

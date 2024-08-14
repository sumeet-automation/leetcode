package com.learning.array;

import java.util.List;

public class LeetCode2824_CountPairWhoseSumIsLessThanTarget {

    public static void main(String[] args) {
        System.out.println(countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i != j) {
                    System.out.println(nums.get(i) + " - " + nums.get(j));
                    if ((0 <= i && i < j && j < nums.size()) && (nums.get(i) + nums.get(j)) < target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
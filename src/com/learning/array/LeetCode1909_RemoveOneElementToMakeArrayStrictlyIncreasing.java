package com.learning.array;

public class LeetCode1909_RemoveOneElementToMakeArrayStrictlyIncreasing {

    public static void main(String[] args) {
        LeetCode1909_RemoveOneElementToMakeArrayStrictlyIncreasing solution = new LeetCode1909_RemoveOneElementToMakeArrayStrictlyIncreasing();
        System.out.println(solution.canBeIncreasing(new int[]{1, 2, 10, 5, 6}));
        //System.out.println(solution.canBeIncreasing(new int[]{1, 2, 10, 5, 2, 6}));
        System.out.println(solution.canBeIncreasing(new int[]{1, 1}));
        System.out.println(solution.canBeIncreasing(new int[]{1, 1, 1}));
        //System.out.println(solution.canBeIncreasing(new int[]{1, 2, 3}));
        //System.out.println(solution.canBeIncreasing(new int[]{2, 3, 1, 2}));
    }

    public boolean canBeIncreasing(int[] nums) {
        int i = 1, n = nums.length;
        for (; i < n && nums[i - 1] < nums[i]; ++i)
            ;
        return check(nums, i - 1) || check(nums, i);
    }

    private boolean check(int[] nums, int i) {
        int prev = Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; ++j) {
            if (i == j) {
                continue;
            }
            if (prev >= nums[j]) {
                return false;
            }
            prev = nums[j];
        }
        return true;
    }
}

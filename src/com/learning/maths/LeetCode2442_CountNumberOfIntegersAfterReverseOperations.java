package com.learning.maths;

import java.util.HashSet;
import java.util.Set;

public class LeetCode2442_CountNumberOfIntegersAfterReverseOperations {
    public static void main(String[] args) {
        LeetCode2442_CountNumberOfIntegersAfterReverseOperations solution = new LeetCode2442_CountNumberOfIntegersAfterReverseOperations();
        solution.countDistinctIntegers(new int[]{2, 3, 31, 13});
    }

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(reverse(nums[i]));
            set.add(nums[i]);
        }
        return set.size();
    }

    public int reverse(int n) {
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = (reverse * 10) + digit;
            n /= 10;
        }
        return reverse;
    }
}

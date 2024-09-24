package com.learning.hashtable;

import java.util.HashSet;
import java.util.Set;

public class LeetCode128_LongestConsecutiveSequence {

    public static void main(String[] args) {
        LeetCode128_LongestConsecutiveSequence solution = new LeetCode128_LongestConsecutiveSequence();
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) return 1;
        int longestLength = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currLength = 1;
                while (set.contains(num + currLength)) {
                    currLength++;
                }
                longestLength = Math.max(currLength, longestLength);
            }
        }
        return longestLength;
    }
}

package com.learning.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).mapToObj(Integer::valueOf).collect(Collectors.toSet());

        Set<Integer> set2 = Arrays.stream(nums2).mapToObj(Integer::valueOf).collect(Collectors.toSet());
//1,2    2
        Set<Integer> set = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                set.add(num);
            }
        }

        for (int num : nums1) {
            if (set2.contains(num)) {
                set.add(num);
            }
        }
        int[] output = new int[set.size()];
        int index = 0;
        for (int element : set) {
            output[index++] = element;
        }
        return output;
    }
}

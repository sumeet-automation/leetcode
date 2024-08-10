package com.learning.hashtable;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode349_IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).mapToObj(Integer::valueOf).collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).mapToObj(Integer::valueOf).collect(Collectors.toSet());
        set1.retainAll(set2);
        int[] output = new int[set1.size()];
        int index = 0;
        for (int element : set1) {
            output[index++] = element;
        }
        return output;
    }
}

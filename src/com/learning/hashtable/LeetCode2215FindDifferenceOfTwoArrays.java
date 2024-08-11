package com.learning.hashtable;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCode2215FindDifferenceOfTwoArrays {

    public static void main(String[] args) {
        findDifference(new int[]{4,1, 2, 1}, new int[]{2, 4});
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var set1 = Arrays.stream(nums1).mapToObj(Integer::valueOf).collect(Collectors.toSet());
        var set2 = Arrays.stream(nums2).mapToObj(Integer::valueOf).collect(Collectors.toSet());
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : set1) {
            if(!set2.contains(i))
                list1.add(i);
        }
        for (int i : set2) {
            if(!set1.contains(i))
                list2.add(i);
        }
        return List.of(list1, list2);
    }
}

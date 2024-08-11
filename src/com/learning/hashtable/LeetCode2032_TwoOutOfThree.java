package com.learning.hashtable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode2032_TwoOutOfThree {

    public static void main(String[] args) {
        System.out.println(twoOutOfThree(new int[]{1, 6, 2, 3}, new int[]{2, 3}, new int[]{4, 1, 2, 3, 6}));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Boolean> output = new HashMap<>();
        for (var i : nums1) {
            output.put(i, false);
        }

        for (int i : nums2) {
            if (output.containsKey(i))
                output.put(i, true);
        }

        for (int i : nums3) {
            if (output.containsKey(i))
                output.put(i, true);
        }
        return output.keySet().stream().filter(x -> output.get(x)).toList();
    }
}
/*

         Set<Integer> output = new HashSet<>();
        var set1 = Arrays.stream(nums1).mapToObj(Integer::valueOf).collect(Collectors.toSet());
        var set2 = Arrays.stream(nums2).mapToObj(Integer::valueOf).collect(Collectors.toSet());
        var set3 = Arrays.stream(nums3).mapToObj(Integer::valueOf).collect(Collectors.toSet());

        for (var i : set1) {
            if (set2.contains(i) || set3.contains(i))
                output.add(i);
        }

        for (var i : set2) {
            if (set1.contains(i) || set3.contains(i))
                output.add(i);
        }

        for (var i : set3) {
            if (set2.contains(i) || set1.contains(i))
                output.add(i);
        }
        return new ArrayList<>(output);

 */
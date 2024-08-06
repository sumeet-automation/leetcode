package com.learning.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1515_NoOfMatchingPairs {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        return map.values().stream().mapToInt(x -> (x * (x - 1)) / 2).sum();
    }
}

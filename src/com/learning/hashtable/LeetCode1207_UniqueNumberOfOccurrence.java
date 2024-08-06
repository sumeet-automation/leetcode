package com.learning.hashtable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LeetCode1207_UniqueNumberOfOccurrence {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int number : arr) {
            countMap.compute(number, (k, v) -> v == null ? 1 : v + 1);
        }
        return new HashSet<>(countMap.values()).size()==countMap.values().size();
    }
}

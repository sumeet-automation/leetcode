package com.learning.hashtable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LeetCode1941_AllCharactersHaveEqualOccurrences {
    public boolean areOccurrencesEqual(String s) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String character : s.split("")) {
            countMap.compute(character, (k, v) -> v == null ? 1 : v + 1);
        }
        return new HashSet<>(countMap.values()).size() == 1;
    }
}

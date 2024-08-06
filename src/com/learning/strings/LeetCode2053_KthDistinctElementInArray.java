package com.learning.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCode2053_KthDistinctElementInArray {

    public String kthDistinct(String[] arr, int k) {
        //arr = ["d","b","c","b","c","a","b"], k = 2
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for (String word : arr) {
            countMap.compute(word, (key, v) -> v == null ? 1 : v + 1);
        }

        return "";
    }
}

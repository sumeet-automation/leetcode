package com.learning.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3146_PermutationDifferenceBetweenTwoStrings {

    public int findPermutationDifference(String s, String t) {
        Map<String, Integer> indexMap = new HashMap<>();
        int count=0;
        for (String letter : t.split("")) {
            indexMap.put(letter, count++);
        }

        int sum=0;
        int i=0;
        for (String letter : s.split("")) {
            sum+=Math.abs(i - indexMap.get(letter));
            i++;
        }
        return sum;
    }
}

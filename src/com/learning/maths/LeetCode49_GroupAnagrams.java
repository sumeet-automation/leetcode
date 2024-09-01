package com.learning.maths;

import java.util.*;

public class LeetCode49_GroupAnagrams {
    public static void main(String[] args) {
        LeetCode49_GroupAnagrams solution = new LeetCode49_GroupAnagrams();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (var word : strs) {
            char[] s = word.toCharArray();
            Arrays.sort(s);
            String key = new String(s);
            anagrams.compute(key, (k, v) -> (v == null) ? new ArrayList<>() : v).add(word);
        }
        return new ArrayList<>(anagrams.values());
    }
}

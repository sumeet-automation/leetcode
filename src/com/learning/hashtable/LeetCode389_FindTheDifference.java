package com.learning.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode389_FindTheDifference {

    public static void main(String[] args) {
        System.out.println(new LeetCode389_FindTheDifference().findTheDifference(
                "abcd", "abcda"
        ));
    }
    public char findTheDifference(String s, String t) {
        var map1 = countOccurrences(s);
        var shuffledMap = countOccurrences(t);

        for (Map.Entry<String, Integer> map1EntrySet : shuffledMap.entrySet()) {
            var key = map1EntrySet.getKey();
            if (!map1.containsKey(key)) {
                return key.charAt(0);
            }
            if (map1.containsKey(key) && map1.get(key)!=shuffledMap.get(key)) {
                return key.charAt(0);
            }
        }
        return '0';
    }

    private Map<String, Integer> countOccurrences(String s) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String letter : s.split("")) {
            countMap.compute(letter, (k, v) -> v == null ? 1 : v + 1);
        }
        return countMap;
    }
}

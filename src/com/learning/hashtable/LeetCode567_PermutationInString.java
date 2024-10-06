package com.learning.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode567_PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        int window = s1.length();
        Map<Character, Integer> permFreq = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            permFreq.put(s1.charAt(i), permFreq.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s2.length() - window + 1; i++) {
            Map<Character, Integer> freq = new HashMap<>();
            String s = s2.substring(i, i + window);
            for (int j = 0; j < s.length(); j++) {
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
            }
            if(freq.equals(permFreq)) return true;
        }
        return false;
    }
}

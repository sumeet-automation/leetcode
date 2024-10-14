package com.learning.strings;

import java.util.HashMap;
import java.util.Map;

public class LeetCode2131_LongestPalindromie {

    public static void main(String[] args) {
        LeetCode2131_LongestPalindromie solution = new LeetCode2131_LongestPalindromie();
        System.out.println(solution.longestPalindrome(new String[]{"cc","ll","xx"}));
    }

    public int longestPalindrome(String[] words) {
        Map<String, Integer> freq = new HashMap<>();
        for (var word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        int longestLength = 0;
        for (var entrySet : freq.entrySet()) {
            var key = entrySet.getKey();
            var value = entrySet.getValue();
            var reverse = new String(new char[]{key.charAt(1), key.charAt(0)});
            if (key.equals(reverse)) {
                longestLength += 2;
            } else if (freq.containsKey(reverse) && !key.equals(reverse)) {
                longestLength += 2;
                freq.put(reverse, freq.get(reverse) - 1); 
            }
            freq.put(key, value - 1);
        }
        return longestLength;
    }
}

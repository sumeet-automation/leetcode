package com.learning.hashtable;

import java.util.HashMap;
import java.util.Map;
public class LeetCode2744_FindMaximumStringPairs {

    public static void main(String[] args) {
        LeetCode2744_FindMaximumStringPairs solution = new LeetCode2744_FindMaximumStringPairs();
        System.out.println(solution.maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"}));
    }

    class Solution {
        public int maximumNumberOfStringPairs(String[] words) {
            Map<Integer, Integer> cnt = new HashMap<>();
            int ans = 0;
            for (var w : words) {
                int a = w.charAt(0) - 'a', b = w.charAt(1) - 'a';
                ans += cnt.getOrDefault(b << 5 | a, 0);
                cnt.merge(a << 5 | b, 1, Integer::sum);
            }
            return ans;
        }
    }

    public int maximumNumberOfStringPairs(String[] words) {
        Map<String, String> map = new HashMap<>();
        for (String word : words) {
            String reverse = reverse(word);
            if (!word.equals(reverse)) map.put(word, reverse);
        }
        int count = 0;
        System.out.println(map);
        for (String word : words) {
            if (map.containsValue(word)) {
                count++;
                map.remove(word);
            }
        }
        return count;
    }

    public String reverse(String word) {
        return String.valueOf(word.charAt(1)) + word.charAt(0);
    }
}
package com.learning.strings;

public class LeetCode1668_MaximumRepeatingSubstring {

    public static void main(String[] args) {
        LeetCode1668_MaximumRepeatingSubstring solution = new LeetCode1668_MaximumRepeatingSubstring();
        System.out.println(solution.maxRepeating("ababa", "ab"));
    }
    public int maxRepeating(String sequence, String word) {
        int currMax = 0;
        for (int i = 0; i <= sequence.length()/word.length(); i++) {
            if(!sequence.contains(word.repeat(i)))
                return currMax;
            currMax=i;
        }
        return currMax;
    }
}

package com.learning.strings;

public class WIP_LeetCode1668_MaximumRepeatingSubstring {

    public static void main(String[] args) {
        WIP_LeetCode1668_MaximumRepeatingSubstring solution = new WIP_LeetCode1668_MaximumRepeatingSubstring();
        System.out.println(solution.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }
    public int maxRepeating(String sequence, String word) {
        int max=0;
        int currMax = 0;
        for (int i = 0; i <= sequence.length()-word.length(); i++) {
            if(sequence.substring(i).startsWith(word)){
                i+=word.length()-1;
                currMax++;
                max = Math.max(currMax, max);
            }else {
                currMax = 0;
                //i=i-word.length()+1;
            }
        }
        return max;
    }
}

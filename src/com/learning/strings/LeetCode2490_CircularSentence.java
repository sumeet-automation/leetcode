package com.learning.strings;

public class LeetCode2490_CircularSentence {
    public static void main(String[] args) {
        LeetCode2490_CircularSentence solution = new LeetCode2490_CircularSentence();
        System.out.println(solution.isCircularSentence("leetcode exercises sound delightful"));
    }
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length ; i++) {
            int j=(i+1)% words.length;
            String currWord = words[i];
            String laterWord = words[j];
            if(currWord.charAt(currWord.length()-1)!=laterWord.charAt(0)) return false;
        }
        return true;
    }
}

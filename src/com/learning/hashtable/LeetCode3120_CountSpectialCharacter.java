package com.learning.hashtable;

public class LeetCode3120_CountSpectialCharacter {

    public static void main(String[] args) {
        LeetCode3120_CountSpectialCharacter solution = new LeetCode3120_CountSpectialCharacter();
        System.out.println(solution.numberOfSpecialChars("aAbBcC"));
    }
    public int numberOfSpecialChars(String word) {
        int count=0;
        boolean[] chars = new boolean[128];
        for (int i = 0; i < word.length(); i++) {
            chars[word.charAt(i)]=true;
        }
        for (int i = 0; i < 26; i++) {
            if(chars['a'+i]&&chars['A'+i]) count++;
        }
        return count;
    }
}

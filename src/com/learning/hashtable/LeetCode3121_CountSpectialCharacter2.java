package com.learning.hashtable;

import java.util.Arrays;

public class LeetCode3121_CountSpectialCharacter2 {

    public static void main(String[] args) {
        LeetCode3121_CountSpectialCharacter2 solution = new LeetCode3121_CountSpectialCharacter2();
        System.out.println(solution.numberOfSpecialChars("aAbBCc"));
    }
    public int numberOfSpecialChars(String word) {
        int count=0;
        int[] chars = new int[128];
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) - 'a');
            if (word.charAt(i)-'a'<=0) {
                chars[word.charAt(i)]=1;
            } else
                chars[word.charAt(i)]=3;
        }
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < 26; i++) {
            //System.out.println(chars['A'+i]-chars['a'+i]);
            if(chars['A'+i]-chars['a'+i]<1) count++;
        }
        return count;
    }
}

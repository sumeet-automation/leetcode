package com.learning.strings;

import java.util.TreeMap;

public class LeetCode3121_CountNoumberOfSpecialCharacters2 {

    public static void main(String[] args) {
        LeetCode3121_CountNoumberOfSpecialCharacters2 solution = new LeetCode3121_CountNoumberOfSpecialCharacters2();
        System.out.println(solution.numberOfSpecialChars("aaAbcBC"));
    }
    public int numberOfSpecialChars(String word) {
        TreeMap<Character, Integer> smallFreq = new TreeMap<>();
        TreeMap<Character, Integer> upperFreq = new TreeMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
                upperFreq.putIfAbsent(ch, i);
            else
                smallFreq.put(ch, i);
        }
        int count=0;
        for (int i = 0; i < 26; i++) {
            char smallKey = (char)(i + 'a');
            char upperKey = (char)(i + 'A');
            if(smallFreq.containsKey(smallKey)&&upperFreq.containsKey(upperKey)){
               if(smallFreq.get(smallKey)< upperFreq.get(upperKey)) count++;
            }
        }
        return count;
    }
}

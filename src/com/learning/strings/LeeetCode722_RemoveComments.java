package com.learning.strings;

import java.util.*;

public class LeeetCode722_RemoveComments {

    public static void main(String[] args) {
        LeeetCode722_RemoveComments solution = new LeeetCode722_RemoveComments();
    }
    public String shortestCompletingWord(String licensePlate, String[] words) {
        //Arrays.sort(words);
        Map<Character, Integer> freq = new TreeMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            freq.compute(licensePlate.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }
        for (String word : words) {
            Map<Character, Integer> freqWord = new TreeMap<>();
            for (int i = 0; i < word.length(); i++) {
                freqWord.compute(word.charAt(i), (k, v) -> v == null ? 1 : v + 1);

            }
        }
        return "";
    }
}
package com.learning.strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeetCode884_UncommonWordsFromTwoWords {

    public static void main(String[] args) {
        String s1 = "this apple apple is sweet", s2 = "this apple is sour sour";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        Map<String, Integer> countMap1= new HashMap<>();
        Map<String, Integer> countMap2= new HashMap<>();

        for (String word : words1) {
            countMap1.compute(word, (k, v) -> v == null ? 1 : v + 1);
        }

        for (String word : words2) {
            countMap2.compute(word, (k, v) -> v == null ? 1 : v + 1);
        }

        Set<String> unCommonKeys = new HashSet<>();
        for (String s : countMap1.keySet()) {
            if(!countMap2.containsKey(s) && countMap1.get(s)<2)
                unCommonKeys.add(s);
        }
        for (String s : countMap2.keySet()) {
            if(!countMap1.containsKey(s) && countMap2.get(s)<2)
                unCommonKeys.add(s);
        }
        String[] output = new String[unCommonKeys.size()];
        int count=0;
        for (String key : unCommonKeys) {
            output[count++]=key;
        }
        return output;
    }
}

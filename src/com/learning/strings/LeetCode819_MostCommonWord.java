package com.learning.strings;

import java.util.Arrays;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class LeetCode819_MostCommonWord {

    public static void main(String[] args) {
        System.out.println(new LeetCode819_MostCommonWord().mostCommonWord("a.",
                new String[]{}));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        var countMap = Arrays.stream(paragraph.toLowerCase().split("[\\p{Punct}\\s]+"))
                .collect(groupingBy(identity(), counting()));

        for (String word : banned) {
            countMap.remove(word);
        }

        long max = 0;
        String output = "";
        for (String word : countMap.keySet()) {
            if (countMap.get(word) > max) {
                max = countMap.get(word);
                output = word;
            }
        }
        return output;
    }
}

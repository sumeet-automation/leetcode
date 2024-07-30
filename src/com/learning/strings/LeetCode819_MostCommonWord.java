package com.learning.strings;

import java.util.Arrays;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class LeetCode819_MostCommonWord {

    public static void main(String[] args) {
        new LeetCode819_MostCommonWord().mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit",new String[]{"hit"});
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        var countMap = Arrays.stream(paragraph.toLowerCase().split("[\\p{Punct}\\s]+"))
                .filter(word -> {
                    for (String x : banned) {
                        if(!x.equalsIgnoreCase(word))
                            return true;
                        else return false;
                    }
                    return false;
                })
                .collect(groupingBy(identity(), counting()));
        System.out.println(countMap);
        return "";
    }
}

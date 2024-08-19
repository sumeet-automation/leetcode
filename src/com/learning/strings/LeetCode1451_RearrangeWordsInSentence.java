package com.learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode1451_RearrangeWordsInSentence {

    public static void main(String[] args) {
        System.out.println(arrangeWords("Keep code and calm on"));
    }
    public static String arrangeWords(String text) {
        text = text.toLowerCase();
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(text.split(" ")));
        list.sort(Comparator.comparing(String::length));
        String output = String.join(" ", list);
        return String.valueOf(output.charAt(0)).toUpperCase() + output.substring(1);
    }
}

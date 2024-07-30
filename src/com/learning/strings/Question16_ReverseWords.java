package com.learning.strings;

import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Question16_ReverseWords {

    public static void main(String[] args) {
        String input = "  hello  world  ";
        System.out.println(reverseWords(input));
        System.out.println(reverseWord("hello"));
    }
    private static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringJoiner string = new StringJoiner(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            string.add(words[i]);
        }
        return string.toString();
    }

    private static String reverseWord(String s) {
        int left=0;int right = s.length()-1;
        char[] characters = s.toCharArray();
        while (left < right) {
            char temp = characters[left];
            characters[left++]=characters[right];
            characters[right--]=temp;
        }
        return new String(characters);
    }
}

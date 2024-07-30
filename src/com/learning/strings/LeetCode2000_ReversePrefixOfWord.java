package com.learning.strings;

/*
Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
 */
public class LeetCode2000_ReversePrefixOfWord {

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String output = "";
        for (int i = index; i >= 0; i--) {
            output += word.charAt(i);
        }
        output += word.substring(index+1);
        return index == -1 ? word : output;
    }
}

package com.learning.strings;

import java.util.List;

public class LeetCode557_ReverseWordsPreservingSpaces {

    /*
    Input: s = "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"
     */
    public String reverseWords(String s) {
        String output = "";
        for (String word : s.split(" ")) {
            output+=reverse(word)+" ";
        }
        return output;
    }

    public static String reverse(String word) {
        String output = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            output += word.charAt(i);
        }
        return output;
    }



}

package com.learning.strings;

import java.util.regex.Pattern;

public class LeetCode1047_ReplaceAllDuplicateAdjacentsLetters {

    public static void main(String[] args) {
        System.out.println(areNumbersAscending("hello world 5 x 5"));
    }

    public static boolean areNumbersAscending(String s) {
        int number = Integer.MIN_VALUE;
        var match = Pattern.compile("\\d+").matcher(s);
        while (match.find()) {
            if(number >= Integer.parseInt(match.group()))
                return false;
            else
                number = Integer.parseInt(match.group());
        }
        return true;
    }
}

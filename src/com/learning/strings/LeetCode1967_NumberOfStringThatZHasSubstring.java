package com.learning.strings;

public class LeetCode1967_NumberOfStringThatZHasSubstring {

    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for (String pattern : patterns) {
            if(word.contains(pattern)) count++;
        }
        return count;
    }
}

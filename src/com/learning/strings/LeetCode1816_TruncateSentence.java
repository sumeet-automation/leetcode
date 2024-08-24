package com.learning.strings;

import java.util.StringJoiner;
public class LeetCode1816_TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringJoiner output = new StringJoiner(" ");
        for (int i = 0; i<words.length && i<k; i++) {
            output.add(words[i]);
        }
        return output.toString();
    }
}

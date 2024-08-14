package com.learning.strings;

public class LeetCode2810_FaultyKeyboard {

    public String finalString(String s) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                output=output.reverse();
            } else
                output.append(s.charAt(i));
        }
        return output.toString();
    }
}

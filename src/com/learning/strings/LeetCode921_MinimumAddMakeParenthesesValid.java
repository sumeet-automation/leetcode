package com.learning.strings;

public class LeetCode921_MinimumAddMakeParenthesesValid {

    public int minAddToMakeValid(String s) {
        int openBracket = 0;
        int closeBracket = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                openBracket++;
            else {
                if (openBracket < 0) {
                    closeBracket++;
                } else openBracket--;
            }
        }
        return openBracket+closeBracket;
    }

}

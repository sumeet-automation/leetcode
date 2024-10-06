package com.learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1324_PrintWordsVertically {

    public static void main(String[] args) {
        LeetCode1324_PrintWordsVertically solution = new LeetCode1324_PrintWordsVertically();
        System.out.println(solution.printVertically("TO BE OR NOT TO BE"));
    }

    public List<String> printVertically(String s) {
        List<String> result = new ArrayList<>();
        String[] words = s.split(" ");
        int maxLength = words[0].length();
        for (int i = 0; i < words.length; i++) {
            maxLength = Math.max(maxLength, words[i].length());
        }
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i] + " ".repeat(maxLength - words[i].length());
        }
        for (int j = 0; j < maxLength; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i<words.length; i++) {
                sb.append(words[i].charAt(j));
            }
            result.add(sb.toString().stripTrailing());
        }
        return result;
    }
}

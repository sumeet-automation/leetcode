package com.learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1078_OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> output = new ArrayList<>();
        for (int i = 0; i < words.length-2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                output.add(words[i + 2]);
            }
        }
        return output.toArray(new String[output.size()]);
    }
}

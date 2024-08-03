package com.learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode500_KeyboardRow {

    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for (String word : words) {
            int[] rows = new int[3];
            for (String s : word.split("")) {
                if (r1.indexOf(s) != -1) {
                    rows[0] = 1;
                }
                if (r2.indexOf(s) != -1) {
                    rows[1] = 1;
                }
                if (r3.indexOf(s) != -1) {
                    rows[2] = 1;
                }
            }
            if (Arrays.stream(rows).sum() == 1) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}

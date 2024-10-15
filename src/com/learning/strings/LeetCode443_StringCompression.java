package com.learning.strings;

public class LeetCode443_StringCompression {

    public int compress(char[] chars) {
        int p1 = 0;
        int index = 0;
        int length = chars.length;
        while (p1 < length) {
            char curr_char = chars[p1];
            int count = 0;
            while (p1 < length && chars[p1] == curr_char) {
                count++;
                p1++;
            }
            chars[index++] = curr_char;
            if (count > 1) {
                String countS = String.valueOf(count);
                for (int i = 0; i < countS.length(); i++) {
                    chars[index++] = countS.charAt(i);
                }
            }
        }
        return index;
    }
}

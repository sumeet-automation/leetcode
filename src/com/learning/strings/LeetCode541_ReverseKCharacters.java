package com.learning.strings;

public class LeetCode541_ReverseKCharacters {

    private void reverse(char[] chars, int i, int j) {
        while (i < j) {
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }
    }
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int start = 0, end = s.length();
        while (start < end) {
            int j = Math.min(end-1, start + k - 1);
            reverse (chars,start,j);
            start = start + (2 * k);
        }
        return new String(chars);
    }
}

package com.learning.strings;

public class LeetCode3114_FindLatestTime {

    public static void main(String[] args) {
        LeetCode3114_FindLatestTime solution = new LeetCode3114_FindLatestTime();
    }


    public String findLatestTime(String s) {
        char[] chars = s.toCharArray();
        if (chars[0] == '?') {
            if (chars[1] == '?') {
                chars[0] = '1';
            } else if (chars[1] < '2') {
                chars[0] = '1';
            } else {
                chars[0] = '0';
            }
        }
        if (chars[1] == '?') {
            if (chars[0] == ('1'))
                chars[1] = 1 + '0';
            else
                chars[1] = 9 + '0';
        }
        if (chars[3] == '?') {
            chars[3] = 5 + '0';
        } else chars[3] = s.charAt(3);
        if (chars[4] == '?') {
            chars[4] = 9 + '0';
        }
        return new String(chars);
    }
}

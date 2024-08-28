package com.learning.strings;

public class LeetCode11417_ReformatString {

    public static void main(String[] args) {
        System.out.println(reformat("j"));
    }

    public static String reformat(String s) {
        String strings = String.join("", s.split("\\d"));
        String integers = String.join("", s.split("[a-z]"));
        int count = Math.min(strings.length(), integers.length());
        StringBuilder output = new StringBuilder();
        if (Math.abs(strings.length() - integers.length()) > 1)
            return "";
        for (int i = 0; i < count; i++) {
            output.append(strings.charAt(i));
            output.append(integers.charAt(i));
        }
        if (strings.length() - count == 1)
            output.append(strings.charAt(count));
        else if (integers.length() - count == 1)
            output.insert(0, integers.charAt(count));
        return output.toString();
    }
}

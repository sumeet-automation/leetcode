package com.learning.strings;

// flower, flow, flight --> output fl

public class Question11_LongestPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(
                new String[]{"flower", "flow", "flight"}
        ));
    }

    private static String longestCommonPrefix(String[] input) {
        String prefix = input[0];
        for (int i = 1; i < input.length; i++) {
            while (!prefix.isEmpty() || prefix.equals(input[i])) {
                if (!input[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                } else {
                    break;
                }
            }
        }
        return prefix;
    }
}

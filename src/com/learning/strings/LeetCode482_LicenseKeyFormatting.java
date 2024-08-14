package com.learning.strings;

import java.util.StringJoiner;

public class LeetCode482_LicenseKeyFormatting {

    /*
    Input: s = "5F3Z-2e-9-w", k = 4
    Output: "5F3Z-2E9W"
     */
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder reverse = new StringBuilder(s.replaceAll("-","").toUpperCase()).reverse();
        StringJoiner output = new StringJoiner("-");
        for (int i = 0; i < reverse.length(); i=i+k) {
            int lastLength = Math.min(i + k, reverse.length());
            output.add(reverse.substring(i, lastLength));
        }
        return new StringBuilder(output.toString()).reverse().toString();
    }
}

package com.learning.strings;

import java.util.StringJoiner;

public class LeetCode482_LicenseKeyFormatting {

    /*
    Input: s = "5F3Z-2e-9-w", k = 4
    Output: "5F3Z-2E9W"
     */
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-4A0r7-4k", 4));
    }
    public static String licenseKeyFormatting(String s, int k) {
        String[] array = s.split("-");
        StringJoiner output = new StringJoiner("-");
        output.add(array[0]);
        s=s.replaceAll("-","").substring(array[0].length()).toUpperCase();
        for (int i = 0; i < s.length(); i=i+k) {
            int lastLength = i + k > s.length() ? s.length() : i + k;
            output.add(s.substring(i, lastLength));
        }
        return output.toString();
    }
}

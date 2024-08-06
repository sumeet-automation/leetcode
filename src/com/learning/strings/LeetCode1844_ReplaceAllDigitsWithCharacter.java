package com.learning.strings;

public class LeetCode1844_ReplaceAllDigitsWithCharacter {

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1b2c3d4e"));
    }

    public static String replaceDigits(String s) {
        char[] output = new char[s.length()];
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int length;
        if (s.length() % 2 == 0) {
            length = s.length();
        }
        else {
            length = s.length() - 1;
            output[length] = s.charAt(length);
        }
        for (int i = 0; i < length; i=i+2) {
            output[i]=s.charAt(i);
            output[i+1]=alphabets[(int)s.charAt(i)+(int)s.charAt(i+1)-48-97];
        }
        return new String(output);
    }
}

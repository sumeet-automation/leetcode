package com.learning.strings;

public class LeetCode1374_NumbeOfStringWithOddCharacter {

    public static void main(String[] args) {
        System.out.println(generateTheString(4));
    }
    public static String generateTheString(int n) {
        if (n % 2 != 0) {
            return "a".repeat(n);
        } else return "a".repeat(n-1)+"b";
    }
}

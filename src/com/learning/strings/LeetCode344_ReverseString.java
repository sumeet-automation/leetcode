package com.learning.strings;

import java.util.Arrays;

public class LeetCode344_ReverseString {

    public static void main(String[] args) {

        char[] input = {'h', 'e', 'l', 'l', 'o'};
        reverseString(input);
        System.out.println(Arrays.toString(input));
    }
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (right >= left) {
            char temp = s[left];
            s[left++]=s[right];
            s[right--]=temp;
        }
    }
}

package com.learning.strings;

import java.util.List;

public class LeetCode1903_LargestOddNumber {

    public static void main(String[] args) {
        System.out.println(largestOddNumber("7542351161"));
    }
    public static String largestOddNumber(String num) {
        for (int i = num.length()-1; i >=0 ; i--) {
            int value = num.charAt(i)-'0';
            if (value %2!=0) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}

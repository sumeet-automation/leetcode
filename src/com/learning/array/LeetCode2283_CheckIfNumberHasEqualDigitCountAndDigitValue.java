package com.learning.array;

import java.util.Arrays;

public class LeetCode2283_CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static boolean digitCount(String num) {
        //"1210"
        int count[] = new int[10];
        for (int i=0;i< num.split("").length;i++) {
            int n = num.charAt(i)-'0';
            count[n]++;
        }
        for (int i = 0; i < num.length(); i++) {
            if((num.charAt(i)-'0')!=count[i]) {
                return false;
            }
        }
        return true;
    }
}

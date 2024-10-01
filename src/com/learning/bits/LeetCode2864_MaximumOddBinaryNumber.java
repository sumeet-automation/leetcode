package com.learning.bits;

import java.util.Arrays;

public class LeetCode2864_MaximumOddBinaryNumber {

    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        char[] input = s.toCharArray();
        for (char ch : input) {
            if (ch == '1') {
                ones++;
            }
        }
        char[] output = new char[s.length()];
        for (int i = 0; i < s.length() ; i++) {
            output[i] = '0';
        }
        for (int i = 0; i < s.length() &&ones>1; i++,ones--) {
            output[i] = '1';
        }
        output[s.length() - 1] = '1';
        return new String(output);
    }

    public static void main(String[] args) {
        LeetCode2864_MaximumOddBinaryNumber solution = new LeetCode2864_MaximumOddBinaryNumber();
        solution.maximumOddBinaryNumber("110");

    }

}

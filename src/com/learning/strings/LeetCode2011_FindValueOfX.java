package com.learning.strings;

public class LeetCode2011_FindValueOfX {

    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String value : operations) {
            if (value.startsWith("+") || value.endsWith("+")) {
                sum++;
            } else {
                sum--;
            }
        }
        return sum;
    }
}
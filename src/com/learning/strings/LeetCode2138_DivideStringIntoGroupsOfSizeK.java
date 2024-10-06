package com.learning.strings;

import java.util.Arrays;

public class LeetCode2138_DivideStringIntoGroupsOfSizeK {

    public static void main(String[] args) {
        LeetCode2138_DivideStringIntoGroupsOfSizeK solution = new LeetCode2138_DivideStringIntoGroupsOfSizeK();
        System.out.println(Arrays.toString(solution.divideString("abcdefghij", 3, 'x')));
    }
    public String[] divideString(String s, int k, char fill) {
        int length = s.length();
        int size = length/k;
        if(length%k!=0) {
            int maxLength  = k-(length%k);
            s += String.valueOf(fill).repeat((maxLength));
            size++;
        }
        String[] output = new String[size];
        for (int i = 0,j=0; i < size; i++,j+=k) {
            output[i] = s.substring(j, j + k);
        }
        return output;
    }
}

package com.learning.strings;

import java.util.HashSet;
import java.util.Set;

public class PermutatioPractice {

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
    }

    public static int countGoodSubstrings(String s) {
        int count=0;
        for (int i = 0; i < s.length() - 2; i++) {
            if(s.substring(i,i+3).charAt(0)!=s.substring(i,i+3).charAt(1) &&
                    s.substring(i,i+3).charAt(1)!=s.substring(i,i+3).charAt(2)
            && s.substring(i,i+3).charAt(2)!=s.substring(i,i+3).charAt(0))
            count++;
        }
    return count;
    }


}

package com.learning.strings;

import java.util.HashSet;
import java.util.Set;

public class LeetCode2264_Largest3SameDigitNumber {

    public static void main(String[] args) {
        permutation("abc","",new HashSet<>());
    }
    public String largestGoodInteger(String num) {
        for (int i = 9; i >= 0; i--) {
            String s = String.valueOf(i).repeat(3);
            if (num.contains(s)) {
                return s;
            }
        }
        return "";
    }

    public static void permutation(String input, String perm, Set<String> ans){
        ans.add(perm);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String temp = input.substring(0,i)+input.substring(i+1);
            permutation(temp,perm+ch,ans);
        }
        System.out.println(ans);
    }
}


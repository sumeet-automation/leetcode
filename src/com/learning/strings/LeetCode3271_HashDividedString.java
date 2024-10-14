package com.learning.strings;

public class LeetCode3271_HashDividedString {

    public String stringHash(String s, int k) {
        int[] alphabets = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i=i+k){
            int sum = 0;
            String sub = s.substring(i,i+k);
            for(char ch:sub.toCharArray()){
                sum+=(ch-'a');
                sum%=26;
            }
            char ch = (char)(sum+'a');
            sb.append(ch);
        }
        return sb.toString();
    }
}

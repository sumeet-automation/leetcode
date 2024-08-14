package com.learning.strings;

public class WIP_LeetCode541_ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 3));
    }
    public static String reverseStr(String s, int k) {
        if(s.length()<k)
            return reverse(s);
        String output = "";
        for (int i = 0; i < s.length();) {
            System.out.println("i + k ----> "+i +" ----- "+ k);
            output+=reverse(s.substring(i, Math.min(i + k,s.length())));
            if(i + k+k<s.length()){
                output+=s.substring(i + k,i + k+k);
            } else {
                output+=s.substring(i + k);
            }
            i=i+k+k;
        }
        return output;
    }

    public static String reverse(String s) {
        String output = "";
        for (int i = s.length()-1; i >= 0; i--) {
            output += s.charAt(i);
        }
        return output;
    }
}

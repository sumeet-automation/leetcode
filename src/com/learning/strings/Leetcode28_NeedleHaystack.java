package com.learning.strings;

public class Leetcode28_NeedleHaystack {

    public static void main(String[] args) {
        System.out.println(strStr("abc", "c"));
    }

    public static int strStr(String haystack, String needle) {
        int index = -1;
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return index;
    }
}

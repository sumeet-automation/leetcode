package com.learning.strings;

import java.util.HashMap;
import java.util.Map;

public class Leetcode409_LongestPalindrome {

    public static int longestPalindrome(String s) {
        Map<Character,Integer> countMap = new HashMap<>();
        int result = 0;
        int oddCount=0;
        for(char ch:s.toCharArray()){
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);
            int currFreq = countMap.get(ch);
            if(currFreq%2==0){
                result+=2;
                oddCount--;
            } else{
                oddCount++;
            }
        }
        return oddCount>0?result+1:result;
    }

    public static int longestPalindromeUsingArray(String s) {
        int[] chars = new int[128];
        int result = 0;
        int oddCount=0;
        for(char ch:s.toCharArray()){
            if(chars[ch]%2==0){
                result+=2;
                chars[ch] = 0;
                oddCount--;
            } else{
                chars[ch] = 1;
                oddCount++;
            }
        }
        return oddCount>0?result+1:result;
    }
}

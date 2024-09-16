package com.learning.strings;

public class LeetCode1221_BalanceSubstrings {
    public int balancedStringSplit(String s) {
        int sum=0;
        int count=0;
        for (char letter : s.toCharArray()) {
            if(letter=='R')
                sum+=1;
            else if(letter=='L')
                sum-=1;
            if(sum==0){
                count++;
            }
        }
        return count;
    }
}

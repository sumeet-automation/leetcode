package com.learning.dynamicprogramming;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode2707_ExtraCharactersInString {

    public static void main(String[] args) {
    }

    int dp[] = new int[50];
    public int minExtraChar(String s, String[] dictionary) {
        Arrays.fill(dp,-1);
        HashSet<String> dictionarySet = new HashSet<>(Arrays.asList(dictionary));
        return recur(s,dictionarySet,0);
    }
    public int recur(String s, HashSet<String> dictionary, int index){
        if(index==s.length()){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        StringBuilder sb = new StringBuilder();
        int minExtraChar = Integer.MAX_VALUE;
        for(int i=index;i<s.length();i++){
            sb.append(s.charAt(i));
            int extraChar = 0;
            if(!dictionary.contains(sb.toString())){
                extraChar = sb.length();
            }
            int curExtra = recur(s,dictionary,i+1);
            minExtraChar = Math.min(minExtraChar,extraChar + curExtra);
        }
        return dp[index] = minExtraChar;
    }
}

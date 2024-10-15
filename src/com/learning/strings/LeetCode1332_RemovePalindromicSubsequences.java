package com.learning.strings;

public class LeetCode1332_RemovePalindromicSubsequences {

    public int removePalindromeSub(String s) {
        if(s.isEmpty()) return 0;
        if(s.length()==1) return 1;
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            } else{
                return 2;
            }
        }
        return 1;
    }
}

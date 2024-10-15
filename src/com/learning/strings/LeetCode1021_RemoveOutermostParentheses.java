package com.learning.strings;

public class LeetCode1021_RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < n; i++) {
            if(s.charAt(i)=='('){
                count++;
                res.append('(');
            } else {
                if(count==0){
                    i++;
                } else {
                    res.append(')');
                    count--;
                }
            }
        }
        return res.toString();
    }
}

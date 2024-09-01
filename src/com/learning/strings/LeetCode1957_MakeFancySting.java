package com.learning.strings;

public class LeetCode1957_MakeFancySting {

    public static void main(String[] args) {
        LeetCode1957_MakeFancySting solution = new LeetCode1957_MakeFancySting();
        System.out.println(solution.makeFancyString("a"));
    }
    public String makeFancyString(String s) {
        if(s.length()<3) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length()-2; i++) {
            if(!(s.charAt(i)==s.charAt(i+1) &&
                    s.charAt(i+1)==s.charAt(i+2))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString()+s.charAt(s.length()-2)+s.charAt(s.length()-1);
    }
}

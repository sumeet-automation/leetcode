package com.learning.strings;

import java.util.regex.Pattern;

public class LeetCode844_BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
    }
    public static boolean backspaceCompare(String s, String t) {
        /*var pattern = Pattern.compile(".#");
        while (pattern.matcher(s).find()) {
            System.out.println(matcher.group());
        }*/
        for(int i =0;i<Math.max(s.length(),t.length())+10;i++){
            s = s.replaceAll(".#", "");
            System.out.println("1----> "+s);
            t = t.replaceAll(".#", "");
            System.out.println(t);
        }
        System.out.println("compare ---> "+s+" ------ "+t);
        return false;
    }
}

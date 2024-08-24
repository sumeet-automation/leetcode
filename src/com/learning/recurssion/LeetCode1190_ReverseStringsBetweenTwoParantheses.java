package com.learning.recurssion;

import java.util.Stack;

public class LeetCode1190_ReverseStringsBetweenTwoParantheses {

    public static void main(String[] args) {
        reverseParentheses("ta()usw((((a))))"); // tauswa
        reverseParentheses("(ba)cd");
        reverseParentheses("(u(love)i)");
    }
    public static String reverseParentheses(String s) {
        if (!s.contains("(")) return s;
        int openingParanthesis = s.lastIndexOf("(");
        int closingParanthesis = s.indexOf(")", openingParanthesis);
        String temp = new StringBuilder(s.substring(openingParanthesis + 1, closingParanthesis))
                .reverse().toString();
        System.out.println("temp ---> " + temp);
        s = s.substring(0, openingParanthesis)
                + temp
                + s.substring(closingParanthesis + 1);
        System.out.println("new ----> " + s);
        return reverseParentheses(s);
    }
}

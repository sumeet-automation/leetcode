package com.learning.stacksandqueue;

import java.util.Stack;

public class LeetCode1249_MinimumRemoveToMakeParanthesis {

    public static void main(String[] args) {
        LeetCode1249_MinimumRemoveToMakeParanthesis solution = new LeetCode1249_MinimumRemoveToMakeParanthesis();
        System.out.println(solution.minRemoveToMakeValid("))(("));
        System.out.println(solution.minRemoveToMakeValid("Lee((tco))de"));
        System.out.println(solution.minRemoveToMakeValid("(a(b(c)d)"));
        System.out.println(solution.minRemoveToMakeValid("())()((("));
    }
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(') {
                stack.push(i);
                sb.append('(');
            }
            else if(s.charAt(i)==')') {
                if(!stack.isEmpty()) {
                    stack.pop();
                    sb.append(')');
                } else {
                    //mark for deletion
                    sb.append(" ");
                }
            } else sb.append(s.charAt(i));
        }
        int count=0;
        for (int i : stack) {
            sb.deleteCharAt(i -count);
            count++;
        }
        //removing deletion
        return sb.toString().replaceAll(" ","");
    }
}

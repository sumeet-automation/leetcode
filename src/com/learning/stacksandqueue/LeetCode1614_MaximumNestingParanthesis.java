package com.learning.stacksandqueue;

import java.util.Stack;

public class LeetCode1614_MaximumNestingParanthesis {

    public static void main(String[] args) {
        LeetCode1614_MaximumNestingParanthesis solution = new LeetCode1614_MaximumNestingParanthesis();
        System.out.println(solution.maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(solution.maxDepth("(1)+((2))+(((3)))"));
        System.out.println(solution.maxDepth("()(())((()()))"));
    }
    public int maxDepth(String s) {
        int maxCount=0;
        int currentCount=0;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if(ch=='('){
                currentCount++;
                stack.push('{');
            } else if(ch==')'){
                maxCount = Math.max(maxCount, currentCount);
                currentCount--;
                stack.pop();
            }
            if(stack.isEmpty()){
                currentCount=0;
            }
        }
        return maxCount;
    }
}

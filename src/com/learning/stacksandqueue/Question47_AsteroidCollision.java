package com.learning.stacksandqueue;

import java.util.Map;
import java.util.Stack;

public class Question47_AsteroidCollision {

    public static void main(String[] args) {
        System.out.println(collission(new int[]{-5, 10, -5}));
    }

    public static Stack<Integer> collission(int[] array) {
        //5 10 -5
        Stack<Integer> stack = new Stack<>();
        stack.push(array[0]);
        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            if ((stack.peek() > 0 && num > 0) || (stack.peek() < 0 && num < 0)) {
                stack.push(num);
            } else if ((stack.peek() > 0 && num<0) || (stack.peek() < 0 && num>0)) {
                //do nothing
                stack.push(num);
            } else if (Math.abs(stack.peek()) < Math.abs(num)) {
                //destroyed
                stack.pop();
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        return stack;
    }
}

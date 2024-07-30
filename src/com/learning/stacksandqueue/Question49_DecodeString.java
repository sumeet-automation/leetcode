package com.learning.stacksandqueue;

import java.util.Stack;

public class Question49_DecodeString {

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }

    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        Stack<String> numStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        for (String letter : s.split("")) {
            if (Character.isDigit(letter.charAt(0))) {
                numStack.push(letter);
            } else if (letter.equals("[")) {
                stringStack.push(sb);
                sb.delete(0, sb.length());
            } else if (letter.equals("]")) {
                temp = stringStack.pop();
                temp.repeat(sb, Integer.parseInt(numStack.pop()));
                System.out.println(temp);
                temp.delete(0, sb.length());
            } else {
                sb.append(letter);
            }
        }
        System.out.println(numStack);
        return sb.toString();
    }
}

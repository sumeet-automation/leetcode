package com.learning.strings;

import java.util.Stack;

public class LeetCode394_DecodeString {

    public String decodeString(String s) {
        Stack<String> characterStack = new Stack<>();
        Stack<Integer> integerStack = new Stack<>();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < s.length();) {
            char ch = s.charAt(i);
            System.out.println(ch);
            while (ch!=']'){
                if(Character.isDigit(ch)){
                    integerStack.push(ch-'0');
                    System.out.println(ch);
                } else {
                    characterStack.push(String.valueOf(ch));
                }
                ch = s.charAt(++i);
            }
            System.out.println("integerStack --- "+integerStack);
            System.out.println("characterStack --- "+characterStack);
            StringBuilder temp = new StringBuilder();
            while (!characterStack.peek().equals("[")) {
                temp.insert(0,characterStack.pop());
            }
            characterStack.pop();
            characterStack.push(temp.toString().repeat(integerStack.pop()));
            //output.append(0,temp.toString())

            System.out.println("temp - "+temp);
            System.out.println("output - "+output);

        }

        System.out.println(integerStack);
        System.out.println(characterStack);
        return "";
    }

    public static void main(String[] args) {
        LeetCode394_DecodeString solution = new LeetCode394_DecodeString();
        System.out.println(solution.decodeString("3[a2[c]]"));
    }
}

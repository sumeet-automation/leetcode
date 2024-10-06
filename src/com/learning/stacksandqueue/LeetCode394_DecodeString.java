package com.learning.stacksandqueue;

import java.util.Stack;

public class LeetCode394_DecodeString {

    public String decodeString(String s) {
        Stack<StringBuilder> strBuild = new Stack<>();
        Stack<Integer> numberStack = new Stack<>();
        int num = 0;
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = (num * 10) + ch - '0';
            } else if (ch == '[') {
                strBuild.push(str);
                str = new StringBuilder();
                numberStack.push(num);
                num = 0;
            } else if (ch == ']') {
                StringBuilder temp = str;
                str = strBuild.pop();
                int count = numberStack.pop();
                while (count-- > 0) {
                    str.append(temp);
                }
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}

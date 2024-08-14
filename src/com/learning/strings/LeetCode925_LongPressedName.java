package com.learning.strings;

import java.util.Stack;

public class LeetCode925_LongPressedName {

    public static void main(String[] args) {
        System.out.println(isLongPressedName("aalex", "aaaaalleexxxx"));
        //stack a --> aaaaaaa
        //stack l!=a -->
    }
    public static boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed)) return true;
        if(name.length()>typed.length()) return false;
        int index1 = 0, index2 = 0;
        while (index2 < typed.length()) {
            if (index1 < name.length() && name.charAt(index1) == typed.charAt(index2)) {
                index1++;
            } else if(index2==0 || typed.charAt(index2-1)!=typed.charAt(index2)) return false;
            index2++;
        }
        return index1==name.length();
    }

}

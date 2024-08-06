package com.learning.strings;

public class LeetCode925_LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        // name = "aleex", typed = "aaleex"
        String compare="";
        int i=0,right=0;
        for (; i < typed.length(); i++) {
            if(typed.charAt(i)!=typed.charAt(right)){
                compare+=typed.charAt(i);
                right=i;
            }
        }
        System.out.println(compare);
        return (compare+typed.charAt(typed.length())).equals(name);
    }
}

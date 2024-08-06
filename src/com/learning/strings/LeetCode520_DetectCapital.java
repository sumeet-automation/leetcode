package com.learning.strings;

public class LeetCode520_DetectCapital {

    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toLowerCase()))
            return true;
        else if(word.equals(word.toUpperCase()))
            return true;
        else if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()))
            return true;
        else return false;
    }
}

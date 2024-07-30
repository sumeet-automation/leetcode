package com.learning.strings;

import java.util.List;

public class LeetCode2828_AcronymWords {

    public static void main(String[] args) {

    }

    public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=words.get(i).charAt(0))
                return false;
        }
        return true;
    }
}

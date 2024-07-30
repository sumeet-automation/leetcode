package com.learning.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeetCode3136_ValidWord {

    public static void main(String[] args) {
        System.out.println(new LeetCode3136_ValidWord().isValid("UuE6"));
    }
    public boolean isValid(String word) {
        if(word.length()<4)
            return false;
        Matcher matcher = Pattern.compile("@|\\$|#").matcher(word);
        if (matcher.find())
            return false;
        Matcher vowels = Pattern.compile("[aeiouAEIOU]").matcher(word);
        Matcher consonants = Pattern.compile("[^aeiouAEIOU0-9]").matcher(word);
        boolean flag1=false, flag2=false;
        if (vowels.find())
            flag1=true;
        if (consonants.find())
            flag2=true;
        return flag1&&flag2;
    }
}

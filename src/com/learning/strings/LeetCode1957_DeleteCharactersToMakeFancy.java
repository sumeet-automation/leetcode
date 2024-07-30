package com.learning.strings;

import java.util.regex.Pattern;

public class LeetCode1957_DeleteCharactersToMakeFancy {

    public static void main(String[] args) {
        makeFancyString("leeetcooode");
    }
    public static String makeFancyString(String s) {
        var pattern = Pattern.compile("\\w").matcher(s);
        while (pattern.find()) {
            System.out.println(pattern.group());
        }
        return "";
    }
}

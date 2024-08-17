package com.learning.strings;


public class LeetCode1935_BrokenKeyboard {

    public static void main(String[] args) {
        System.out.println(canBeTypedWords("leet code", ""));
    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        if(brokenLetters.isEmpty())
            return text.split(" ").length;
        String[] brokenLetterArray = brokenLetters.split("");
        int count = 0;
        for (String word : text.split(" ")) {
            for (String s : brokenLetters.split("")) {
                if (word.contains(s)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(brokenLetterArray.length );
        System.out.println(count);
        return brokenLetterArray.length - count;
    }
}

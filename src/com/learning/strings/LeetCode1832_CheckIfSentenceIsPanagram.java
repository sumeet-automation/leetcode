package com.learning.strings;

import java.util.Arrays;

public class LeetCode1832_CheckIfSentenceIsPanagram {

    public static void main(String[] args) {
        checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
    }
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length()<26) {
            return false;
        }
        boolean[] chars = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            chars[sentence.charAt(i)-'a']=true;
        }
        for (boolean aChar : chars) {
            if(!aChar) return false;
        }
        return true;
    }
}

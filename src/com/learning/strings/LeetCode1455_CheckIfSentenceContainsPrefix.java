package com.learning.strings;

public class LeetCode1455_CheckIfSentenceContainsPrefix {

    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = 0;
        for (String word : sentence.split(" ")) {
            if (word.startsWith(searchWord))
                return index + 1;
            else
                index++;
        }
        return -1;
    }
}

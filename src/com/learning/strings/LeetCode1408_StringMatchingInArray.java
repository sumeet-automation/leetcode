package com.learning.strings;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1408_StringMatchingInArray {

    public List<String> stringMatchingBruteForce(String[] words) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && (words[j].contains(words[i]))) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }

        public List<String> stringMatching(String[] words) {
            String str = String.join(" ", words);
            List<String> res = new ArrayList<>();
            for(int i = 0; i < words.length; i++){
                if(str.indexOf(words[i]) != str.lastIndexOf(words[i])){
                    res.add(words[i]);
                }
            }
            return res;
        }

}

package com.learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1002_FindCommonCharacter {

    public static void main(String[] args) {
        LeetCode1002_FindCommonCharacter solution = new LeetCode1002_FindCommonCharacter();
        System.out.println(solution.commonChars(new String[]{"bella", "label", "roller"}));
    }
    public List<String> commonChars(String[] words) {
        int[] ans = new int[26];
        for (int i = 0; i < words[0].length(); i++) {
            ans[words[0].charAt(i)-'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] curr = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                curr[words[i].charAt(j)-'a']++;
            }
            for (int k = 0; k < 26; k++) {
                ans[k] = Math.min(ans[k], curr[k]);
            }
        }
        List<String> output = new ArrayList<>();
        for (int k = 0; k < 26; k++) {
            if (ans[k] != 0) {
                for (int i = 0; i < ans[k]; i++) {
                    output.add(String.valueOf((char) (k + 'a')));
                }
            }
        }
        return output;
    }
}

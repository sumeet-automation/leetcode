package com.learning.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode2325_DcodeMessage {

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
    public static String decodeMessage(String key, String message) {
        Map<Character, Character> characterMap = new HashMap<>();
        char first = 'a';
        for (int i = 0; i < key.length(); i++) {
            if(Character.isLetter(key.charAt(i)) && !characterMap.containsKey(key.charAt(i))){
                characterMap.put(key.charAt(i),first++);
            }
        }
        System.out.println(characterMap);
        String ans = "";
        for (int i = 0; i < message.length(); i++) {
            ans+=characterMap.getOrDefault(message.charAt(i),message.charAt(i));
        }
        return ans;
    }
}

package com.learning.strings;
public class LeetCode1576_ReplaceAll {

    public static void main(String[] args) {
        LeetCode1576_ReplaceAll solution = new LeetCode1576_ReplaceAll();
        System.out.println(solution.modifyString("jqg??b"));
    }

    public String modifyString(String s) {
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (i + 'a');
        }
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '?') {
                for (char c : chars) {
                    if ((i > 0 && characters[i - 1] == c) || (i + 1 < characters.length && characters[i + 1] == c)) {
                        continue;
                    }
                    characters[i] = c;
                    break;
                }
            }
        }
        return new String(characters);
    }
}

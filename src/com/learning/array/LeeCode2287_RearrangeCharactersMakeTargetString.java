package com.learning.array;

public class LeeCode2287_RearrangeCharactersMakeTargetString {

    public static void main(String[] args) {
        LeeCode2287_RearrangeCharactersMakeTargetString solution = new LeeCode2287_RearrangeCharactersMakeTargetString();
        System.out.println(solution.rearrangeCharacters("abcab", "abc"));
        System.out.println(solution.rearrangeCharacters("ilovecodingonleetcode", "code"));
        System.out.println(solution.rearrangeCharacters("abbaccaddaeea", "aaaaaaaa"));
    }

    public int rearrangeCharacters(String s, String target) {
        int[] chars = new int[26];
        int[] chars2 = new int[26];
        for (char c : target.toCharArray()) {
            chars[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            chars2[c - 'a']++;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (chars[i] != 0) result = Math.min(result, (chars2[i] / chars[i]));
        }
        return result;
    }
}

package com.learning.strings;

public class LeetCode2839_MakeStringEquals {

    public static void main(String[] args) {
        LeetCode2839_MakeStringEquals solution = new LeetCode2839_MakeStringEquals();
        System.out.println(solution.canBeEqual("bnxw", "bwxn"));
    }

    public boolean canBeEqual(String s1, String s2) {
        for (int i = 0; i < 2; i++) {
            char[] chars = s1.toCharArray();
            swap(chars, 1, 3);
            if (new String(chars).equals(s2)) return true;
        }
        for (int i = 0; i < 2; i++) {
            char[] chars = s1.toCharArray();
            swap(chars, 0, 2);
            if (new String(chars).equals(s2)) return true;
        }

        for (int i = 0; i < 2; i++) {
            char[] chars = s1.toCharArray();
            swap(chars, 0, 2);
            if (new String(chars).equals(s2)) return true;
            swap(chars, 1, 3);
            if (new String(chars).equals(s2)) return true;
        }
        return false;
    }

    private static void swap(char[] chars, int idx1, int idx2) {
        char temp = chars[idx1];
        chars[idx1] = chars[idx2];
        chars[idx2] = temp;
    }
}

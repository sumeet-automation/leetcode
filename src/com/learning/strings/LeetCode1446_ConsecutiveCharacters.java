package com.learning.strings;

public class LeetCode1446_ConsecutiveCharacters {

    public static void main(String[] args) {
        LeetCode1446_ConsecutiveCharacters solution = new LeetCode1446_ConsecutiveCharacters();
        System.out.println(solution.maxPower("leeetcode"));
    }
    public int maxPower(String s) {
        int max = 0;
        int curr = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
                max = Math.max(max, curr);
            } else {
                curr=1;
            }
        }
        return max;
    }
}

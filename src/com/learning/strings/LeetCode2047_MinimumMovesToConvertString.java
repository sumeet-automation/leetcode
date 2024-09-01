package com.learning.strings;
public class LeetCode2047_MinimumMovesToConvertString {

    public static void main(String[] args) {
        LeetCode2047_MinimumMovesToConvertString solution = new LeetCode2047_MinimumMovesToConvertString();
        System.out.println(solution.minimumMoves("XXXX"));
    }
    public int minimumMoves(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }
}

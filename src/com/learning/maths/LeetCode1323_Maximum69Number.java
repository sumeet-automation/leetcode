package com.learning.maths;

public class LeetCode1323_Maximum69Number {

    public static void main(String[] args) {
        LeetCode1323_Maximum69Number solution = new LeetCode1323_Maximum69Number();
        System.out.println(solution.maximum69Number(9999));
    }

    public int maximum69NumberWithReplaceFirst(int num) {
        return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));
    }

    public int maximum69Number(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '9') {
                sb.deleteCharAt(i);
                sb.insert(i, "9");
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
package com.learning.strings;

public class LeetCode1945_SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        LeetCode1945_SumOfDigitsOfStringAfterConvert solution = new LeetCode1945_SumOfDigitsOfStringAfterConvert();
        //System.out.println(solution.getLucky("iiii", 1));
        //System.out.println(solution.getLucky("leetcode", 2));
        //System.out.println(solution.getLucky("zbax", 2));
        System.out.println(solution.getLucky("dbvmfhnttvr", 5));
        //System.out.println(solution.sum(123));
    }
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }
        s = sb.toString();
        while (k-- > 0) {
            int t = 0;
            for (char c : s.toCharArray()) {
                t += c - '0';
            }
            s = String.valueOf(t);
        }
        return Integer.parseInt(s);
    }


}

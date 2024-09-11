package com.learning.recurssion;

public class LeetCode2243_CalculateDidigSumOfStrings {

    public static void main(String[] args) {
        LeetCode2243_CalculateDidigSumOfStrings solution = new LeetCode2243_CalculateDidigSumOfStrings();
        System.out.println(solution.digitSum("11111222223", 3));
    }

    public String digitSum(String s, int k) {
        if (s.length() <= k) return s;
        else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                int endIndex = Math.min(i + k, s.length());
                sb.append(sumOfDigits(s.substring(i, endIndex)));
            }
            return digitSum(sb.toString(), k);
        }
    }

    public String sumOfDigits(String input) {
        int sum = 0;
        for (String s : input.split("")) {
            sum += Integer.parseInt(s);
        }
        return String.valueOf(sum);
    }
}

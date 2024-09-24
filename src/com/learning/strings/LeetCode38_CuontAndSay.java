package com.learning.strings;

public class LeetCode38_CuontAndSay {

    public static void main(String[] args) {
        LeetCode38_CuontAndSay solution = new LeetCode38_CuontAndSay();
        System.out.println(solution.countAndSay(4));
    }
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String num = countAndSay(n - 1);
        int currCount = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            currCount++;
            if (i==num.length()-1||num.charAt(i) != num.charAt(i+1)) {
                ans.append(currCount).append(num.charAt(i));
                currCount = 0;
            }
        }
        return ans.toString();
    }

    private String count(int n) {
        String num = String.valueOf(n);
        int currCount = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            currCount++;
            if (i==num.length()-1||num.charAt(i) != num.charAt(i+1)) {
                ans.append(currCount).append(num.charAt(i));
                currCount = 0;
            }
        }
        return ans.toString();
    }
}

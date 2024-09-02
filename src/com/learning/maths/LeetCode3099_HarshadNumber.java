package com.learning.maths;

public class LeetCode3099_HarshadNumber {

    public static void main(String[] args) {
        LeetCode3099_HarshadNumber solution = new LeetCode3099_HarshadNumber();
        System.out.println(solution.sumOfTheDigitsOfHarshadNumber(23));
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x==0) return 0;
        int sum = 0;
        final int xCopy = x;
        while (x != 0) {
            int digit = x % 10;
            sum += digit;
            x /= 10;
        }
        return xCopy % sum == 0 ? sum : -1;
    }
}

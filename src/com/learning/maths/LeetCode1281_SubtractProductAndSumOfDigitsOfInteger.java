package com.learning.maths;

public class LeetCode1281_SubtractProductAndSumOfDigitsOfInteger {

    public static void main(String[] args) {
        LeetCode1281_SubtractProductAndSumOfDigitsOfInteger solution = new LeetCode1281_SubtractProductAndSumOfDigitsOfInteger();
        System.out.println(solution.subtractProductAndSum(234));
    }
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            product*=digit;
            sum+=digit;
            n /= 10;
        }
        return product-sum;
    }
}

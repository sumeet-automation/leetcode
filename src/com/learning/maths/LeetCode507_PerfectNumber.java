package com.learning.maths;
public class LeetCode507_PerfectNumber {

    public static void main(String[] args) {
        System.out.println(new LeetCode507_PerfectNumber().checkPerfectNumber(120));
    }
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= num/i; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}

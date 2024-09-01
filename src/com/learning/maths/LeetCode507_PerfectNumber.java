package com.learning.maths;
public class LeetCode507_PerfectNumber {

    public static void main(String[] args) {
        System.out.println(new LeetCode507_PerfectNumber().checkPerfectNumber(120));
    }
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int s = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                s += i;
                if (i != num / i) {
                    s += num / i;
                }
            }
        }
        return s == num;
    }
}

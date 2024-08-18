package com.learning.maths;

public class Question6_PowerOfN {

    public static void main(String[] args) {
        System.out.println(pow(2,7));
    }
    private static double pow(double x, int n) {
        long num = Math.abs((long) n);
        double result = 1.0;
        while (num != 0) {
            if (num % 2 != 0) {
                result*=x;
                num--;
            }
            x=x*x;
            num/=2;
        }
            return n<0?1.0/result:result;
    }
}

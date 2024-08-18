package com.learning.maths;

public class LeetCode258_AddDigitsRecursively {

    public static void main(String[] args) {
        System.out.println(LeetCode258_AddDigitsRecursively.addDigits(10));
    }
    public static int addDigits(int num) {
        if (num >9) {
            int quotient = num / 10; //8976
            int sum = 0;
            while (num > 0) {
                quotient = num / 10;
                int remainder = num % 10;
                sum += remainder;
                num = quotient;
            }
            return addDigits(sum);
        } else {
            return num;
        }
    }

    private static int addAllDigits(int num) {
        int quotient = num / 10; //8976
        int sum = 0;
        while (num > 1) {
            quotient = num / 10;
            int remainder = num % 10;
            sum += remainder;
            num = quotient;
        }
        System.out.println("sum - " + sum);
        return sum;
    }

    //412
    public String fizzbuzz(int n){
        if(n%3==0 && n%5==0){
            return "FizzBuzz";
        } else if(n%3==0){
            return "Fizz";
        } else if(n%5==0){
            return "Buzz";
        } else
            return String.valueOf(n);
    }
}

package com.learning.maths;

import java.util.HashSet;
import java.util.Set;

public class LeetCode202_HappyNumber {

    public static void main(String[] args) {
        LeetCode202_HappyNumber solution = new LeetCode202_HappyNumber();
        System.out.println(solution.isHappy(19));
        System.out.println(solution.isHappy(2));
        //System.out.println(solution.sumOfSquares(82));
        //System.out.println(solution.isHappy(2));
    }
    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        while (n!=1 ) {
            n=sumOfSquares(n);
            if(numbers.contains(n)) return false;
            numbers.add(n);
        }
        return true;
    }

    public int sumOfSquares(int num) {
        int sum=0;
        while (num != 0) {
            int digit = num%10;
            sum += (digit * digit);
            num /= 10;
        }
        return sum;
    }
}

package com.learning.maths;

public class LeetCode2443_SumOfNumberAndItsReverse {

    public static void main(String[] args) {
        LeetCode2443_SumOfNumberAndItsReverse solution = new LeetCode2443_SumOfNumberAndItsReverse();
        System.out.println(solution.sumOfNumberAndReverse(443));
    }
    public boolean sumOfNumberAndReverse(int num) {
        for (int left = 1;left<num ; left++) {
            String leftValue = String.valueOf(left);
            StringBuilder reverse = new StringBuilder(leftValue).reverse();
                if (left+Integer.parseInt(reverse.toString())==num) {
                    return true;
            }
        }
        return false;
    }
}

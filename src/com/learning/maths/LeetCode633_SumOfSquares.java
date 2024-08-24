package com.learning.maths;

public class LeetCode633_SumOfSquares {

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2147483600));
    }
    public static boolean judgeSquareSum(int c) {
        long left = 0, right = (long) Math.sqrt(c);
        while (left<=right){
            long sum = (left*left) + (right*right);
            if(sum==c){
                return true;
            } else if(sum<c){
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}

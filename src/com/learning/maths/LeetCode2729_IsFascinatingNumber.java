package com.learning.maths;

public class LeetCode2729_IsFascinatingNumber {

    public static void main(String[] args) {
        LeetCode2729_IsFascinatingNumber solution = new LeetCode2729_IsFascinatingNumber();
        System.out.println(solution.isFascinating(192));
    }

    public boolean isFascinating(int n) {
        int[] check = new int[9];
        final int copy = n;
        for (int i = 1; i < 4; i++) {
            n=copy*i;
            while (n != 0) {
                int digit = n % 10;
                if (digit == 0) return false;
                if(check[digit - 1]>1) return false;
                check[digit - 1]++;
                n = n / 10;
            }
        }

        for (int i : check) {
            if (i != 1) return false;
        }
        return true;
    }
}

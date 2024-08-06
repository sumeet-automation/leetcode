package com.learning.integer;

public class LeetCode1342_ReduceToZero {
    public int numberOfSteps(int num) {
        if (num == 0)
            return 0;
        int count = 0;
        while (num != 0) {
            if (num % 2 != 0) {
                num--;
            } else {
                num /= 2;
            }
            count++;
        }
        return count;
    }
}

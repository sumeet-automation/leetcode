package com.learning.maths;

public class LeetCode991_BrokenCalculator {

    public static void main(String[] args) {
        LeetCode991_BrokenCalculator solution = new LeetCode991_BrokenCalculator();
        System.out.println(solution.brokenCalc(2, 3));
    }
    public int brokenCalc(int startValue, int target) {
        int count=0;
        while (target > startValue) {
            count++;
            //odd check
            if ((target &1)  == 0) {
                ///divide 2 shorthand
                target=target>>1;
            } else {
                target++;
            }
        }
        return count+(startValue-target);
    }
}

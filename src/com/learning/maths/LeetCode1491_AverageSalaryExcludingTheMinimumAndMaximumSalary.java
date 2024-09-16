package com.learning.maths;

public class LeetCode1491_AverageSalaryExcludingTheMinimumAndMaximumSalary {

    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int s : salary) {
            sum += s;
            min = Math.min(s, min);
            max = Math.max(s, max);
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }
}

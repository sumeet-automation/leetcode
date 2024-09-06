package com.learning.simulation;

import java.util.Arrays;
import java.util.List;

public class LeetCode20028_FindMissingObservations {

    public static void main(String[] args) {
        LeetCode20028_FindMissingObservations solution = new LeetCode20028_FindMissingObservations();
        //System.out.println(Arrays.toString(solution.missingRolls(new int[]{3, 2, 4, 3,}, 4, 2)));
        //System.out.println(Arrays.toString(solution.missingRolls(new int[]{1, 5, 6}, 3, 4)));
        System.out.println(Arrays.toString(solution.missingRolls(new int[]{6, 1, 5, 2}, 4, 4)));
        System.out.println(Arrays.toString(solution.missingRolls(new int[]{4, 5, 6, 2, 3, 6, 5, 4, 6, 4, 5, 1, 6, 3, 1, 4, 5, 5, 3, 2, 3, 5, 3, 2, 1, 5, 4, 3, 5, 1, 5}, 4, 40)));
    }

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = Arrays.stream(rolls).sum();
        int sumToFind = (mean * (n + rolls.length)) - sum;
        if (sumToFind < n || sumToFind > (n * 6)) return new int[0];
        int[] output = new int[n];
        int valueToFill = sumToFind / n;
        int remainingValue = sumToFind - (valueToFill * n);
        //int remainingValue = sumToFind % n;
        System.out.println(remainingValue % n);
        Arrays.fill(output, valueToFill);
        System.out.println(Arrays.toString(output));
        if (valueToFill == 0)
            return output;
        else {
            int trace = 0;
            while (remainingValue > 0 && trace < n) {
                if (output[trace] + remainingValue <= 6) {
                    output[trace] += remainingValue;
                    remainingValue = 0;
                } else {
                    int temp = 6 - output[trace];
                    output[trace] = 6;
                    remainingValue-=temp;
                }
                trace++;
            }
            return output;
        }
    }
}

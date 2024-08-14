package com.learning.array;

import java.util.Arrays;

public class LeetCode2798_EmployeesWhMetTarget {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for (int hour : hours) {
            if(hour>target)
                count++;
        }
        return count;
    }
}

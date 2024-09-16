package com.learning.array;

public class LeetCode1450_NoOfStudentsDoingHomework {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                System.out.println(i);
                res++;
            }
        }
        return res;
    }

}

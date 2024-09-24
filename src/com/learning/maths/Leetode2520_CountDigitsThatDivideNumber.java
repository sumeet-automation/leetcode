package com.learning.maths;

public class Leetode2520_CountDigitsThatDivideNumber {

    public int countDigits(int num) {
        int count = 0;
        final int numCopy = num;
        while (num != 0) {
            int digit = num % 10;
            if (numCopy % digit == 0) count++;
            num /= 10;
        }
        return count;
    }
}

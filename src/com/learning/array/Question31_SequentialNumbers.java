package com.learning.array;

import java.util.ArrayList;
import java.util.List;

public class Question31_SequentialNumbers {
    public static void main(String[] args) {
        System.out.println(sequentialDigits(100, 9000));
    }

    public static List<Integer> sequentialDigits(int low, int high) {
        int numberOfDigitsInLow = numberOfDigits(low);
        int numberOfDigitsInHigh = numberOfDigits(high);
        List<Integer> list = new ArrayList<>();
        String numbers = "123456789";
        for (int j = numberOfDigitsInLow; j <= numberOfDigitsInHigh; j++) {
            for (int i = 0; i <= numbers.length() - j; i++) {
                if (Integer.parseInt(numbers.substring(i, i + j)) >= low
                        && Integer.parseInt(numbers.substring(i, i + j)) <= high) {
                    list.add(Integer.parseInt(numbers.substring(i, i + j)));
                }
            }
        }
        return list;
    }

    public static int numberOfDigits(int number) {
        int divisor = number / 10;
        int count = 1;
        while (divisor != 0) {
            //divisor/=divisor
            divisor = divisor / 10;
            count++;
        }
        return count;
    }
}

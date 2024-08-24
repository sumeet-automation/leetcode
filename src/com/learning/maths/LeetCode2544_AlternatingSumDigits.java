package com.learning.maths;

public class LeetCode2544_AlternatingSumDigits {

    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
        System.out.println(alternateDigitSum(111));
        System.out.println(alternateDigitSum(886996));
    }
    public static int alternateDigitSum(int n) {
        int sumEven=0, sumOdd=0;
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            int i1 = (num.charAt(i)-'0');
            if (i %2==0) {
                sumEven+=i1;
            } else
                sumOdd+=i1;
        }
        return sumEven-sumOdd;
    }


}

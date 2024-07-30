package com.learning.strings;

public class LeetCode415_AddNumbers {

    public static void main(String[] args) {
    addStrings("234","34");
    }

    public static String addStrings(String num1, String num2) {
        //num1 = 234
        //num2 =  34
        int length = Math.min(num1.length(), num2.length());
        int carryForward = 0;
        int sum = 0;
        for (int i = length-1; i > 0; i--) {
            int tempSum = 0;
            tempSum = Integer.parseInt(String.valueOf(num1.charAt(i))) +Integer.parseInt(String.valueOf(num2.charAt(i)));
            //sum+= (i+1)*10+tempSum;
            System.out.println(tempSum);
        }
        System.out.println(sum);
        //4^4=16
        double y = Math.log(16)/Math.log(4);
        return null;
    }
}

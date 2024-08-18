package com.learning.maths;

public class LeetCode415_AddStrings {

    public static void main(String[] args) {
        System.out.println(new LeetCode415_AddStrings().addStrings("5032", "5411"));
    }

    public String addStrings(String num1, String num2) {
        int maxLength = Math.max(num1.length(), num2.length());
        if(num1.length()!=maxLength)
            num1="0".repeat(maxLength-num1.length())+num1;
        if(num2.length()!=maxLength)
            num2="0".repeat(maxLength-num2.length())+num2;
        System.out.println(num1);
        System.out.println(num2);
        String output = "";
        int carryForward = 0;
        for (int i = maxLength - 1; i >= 0; i--) {
            int sum = 0;
            sum = Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(i)));
            if (carryForward == 1) {
                sum += 1;
                carryForward = 0;
            }
            if (sum > 9) {
                carryForward = 1;
                output=String.valueOf(sum).charAt(1)+output;
            } else {
                output=String.valueOf(sum).charAt(0)+output;
            }
        }
        return carryForward==1?"1"+output:output;
    }
}

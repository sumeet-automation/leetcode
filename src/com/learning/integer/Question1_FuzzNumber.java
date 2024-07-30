package com.learning.integer;

public class Question1_FuzzNumber {

    /*
    Given an integer, return an array of string where:

arr[i] == "FizzBuzz" if i is divisible by 3 and 5.

arr[i] == "Fizz" if i is divisible by 3.

arr[i] == "Buzz" if i is divisible by 5.

arr[i] == i (as a string) if none of the above conditions are true.


     */
    public static void main(String[] args) {
     int input = 15;
        isFizzBuzzNumber(input);
    }

    private static String[] isFizzBuzzNumber(int input) {
        String[] array = new String[input];
        for (int x = 1; x <= input; x++) {
            if(x%3==0 && x%5==0) {
                array[x-1]="FizzBuzz";
            }
            else if(x%3==0){
                array[x-1]="Fizz";
            } else if(x%5==0){
                array[x-1]="Buzz";
            } else {
                array[x-1]=String.valueOf(x);
            }
        };
        return array;
    }
}

package com.learning.strings;
import java.util.Arrays;

public class Question10_ReverseCharacterArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseCharacterArray(new char[]{'a', 'b', 'c', 'd'})));
    }

    private static char[] reverseCharacterArray(char[] inputArray) {
        int left=0, right = inputArray.length-1;
        while (left < right) {
            char temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
            left++;
            right--;
        }
        return inputArray;
    }
}

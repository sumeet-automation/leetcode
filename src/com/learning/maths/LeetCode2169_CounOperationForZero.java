package com.learning.maths;

public class LeetCode2169_CounOperationForZero {

    public static void main(String[] args) {
        System.out.println(new LeetCode2169_CounOperationForZero()
                .countOperations(2, 3));
    }
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1!=0 && num2!=0){
            count++;
            if(num1>num2) num1-= num2;
            else num2-=num1;
        }
        return count;
    }
}

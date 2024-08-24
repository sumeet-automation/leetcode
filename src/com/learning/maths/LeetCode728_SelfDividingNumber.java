package com.learning.maths;

import java.util.List;
import java.util.stream.IntStream;

public class LeetCode728_SelfDividingNumber {

    public static void main(String[] args) {
        System.out.println(new LeetCode728_SelfDividingNumber()
                .selfDividingNumbers(1,22));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
     return    IntStream.rangeClosed(left,right)
                .filter(this::isSelfDividing)
                .boxed()
                .toList();
    }
    public boolean isSelfDividing(int num) {
        if(num%10==0)return false;
        int numCopy = num;
        while (num > 0) {
            int div = num % 10;
            if(div==0 || numCopy%div!=0) return false;
            num /= 10;
        }
        return true;
    }

    /*public boolean isSelfDividing(int num) {
        if(num%10==0)return false;
        int numCopy = num;
        int sum = 0;
        while (num > 0) {
            int div = num % 10;
            if(div==0) return false;
            num /= 10;
            sum += div;
        }
        return numCopy%sum==0;
    }*/

}

package com.learning.array;

import java.util.Arrays;

public class LeetCode3232_FindDigitsCanBeWon {

    public boolean canAliceWin(int[] nums) {
        int choose1=0, choose2=0;
        for (int num : nums) {
            if(num<10) choose1+=num;
            else choose2+=num;
        }
        return choose1!=choose2;
    }
}

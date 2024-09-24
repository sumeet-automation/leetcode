package com.learning.binarysearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode744_FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]) return letters[0];
        int start=0, end=letters.length-1;
        while (start <= end) {
            int mid = start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            } else if(letters[mid]<=target){
                start = mid + 1;
            }
        }
        return letters[start];
    }
}

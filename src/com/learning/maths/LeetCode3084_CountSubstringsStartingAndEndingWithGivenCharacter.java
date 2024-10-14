package com.learning.maths;

public class LeetCode3084_CountSubstringsStartingAndEndingWithGivenCharacter {

    public long countSubstrings(String s, char c) {
        long count=0l;
        for(char ch:s.toCharArray()){
            if(ch==c)
                count++;
        }
        return count*(count+1)/2;
    }
}

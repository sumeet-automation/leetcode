package com.learning.integer;

public class LeetCode2278_PercentageOfCharacter {

    public static int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                count++;
                System.out.println(count);
            }
        }
        return (int)((double)count/s.length())*100;
    }
}

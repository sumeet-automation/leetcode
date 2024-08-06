package com.learning.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LeetCode168_ExcelSheetNumber {

    public static void main(String[] args) {
        System.out.println(convertToTitle(820));
    }

    public static String convertToTitle(int columnNumber) {
        int temp = columnNumber;
        var letters = "abcdefghijklmnopqrstuvwxyz".toUpperCase().split("");
        Map<Integer, String> map = new HashMap<>();
        for(int i=0;i<letters.length;i++){
            map.put(i + 1, letters[i]);
        }
        int quotient = columnNumber / 26;
        String output = "";
        //do {
            //FXSHRXW
            //System.out.println("1");

        while (columnNumber >26){
            output += map.getOrDefault(quotient,"");
            //System.out.println(quotient+" ---- "+(columnNumber / 26));
            //columnNumber=quotient;
            System.out.println("1");
            columnNumber--;
            columnNumber = columnNumber / 26;
        }

        int remainder = temp % 26;
        return output+map.get(remainder);
    }
}

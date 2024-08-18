package com.learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode2109_AddSpacesToString {

    public static void main(String[] args) {
        System.out.println(addSpaces("LeetcodeHelpsMeLearn", new int[]{8,13,15}));
    }
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int count=0;
        for (int space : spaces) {
            sb = sb.insert(space+count,' ');
            count++;
        }
        return sb.toString();
    }
}

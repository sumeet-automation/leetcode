package com.learning.strings;

import java.sql.Array;
import java.util.*;

public class LeetCode1980_FindUniqueBinaryString {

    public static void main(String[] args) {
        LeetCode1980_FindUniqueBinaryString solution = new LeetCode1980_FindUniqueBinaryString();
        System.out.println(solution.findDifferentBinaryString(new String[]{"01", "10"}));
    }
    public String findDifferentBinaryString(String[] nums) {
        List<String> list = new ArrayList<>();
        generateBinarySequence("", nums[0].length(), list);
        for (String num : nums) {
            list.remove(num);
        }
        return list.getFirst();
    }

    private List<String> generateBinarySequence(String sequence, int length, List<String> result) {
        if (sequence.length() == length) {
            result.add(sequence);
            return result;
        }
        generateBinarySequence(sequence + "0", length, result);
        generateBinarySequence(sequence + "1", length, result);
        System.out.println("here");
        return result;
    }
}



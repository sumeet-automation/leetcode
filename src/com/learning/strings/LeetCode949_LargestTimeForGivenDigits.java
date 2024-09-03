package com.learning.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode949_LargestTimeForGivenDigits {

    public static void main(String[] args) {
        LeetCode949_LargestTimeForGivenDigits solution = new LeetCode949_LargestTimeForGivenDigits();
//        System.out.println(solution.largestTimeFromDigits(new int[]{0,4,0,0}));
        System.out.println(solution.largestTimeFromDigits(new int[]{2,0,6,6}));
    }
    public String largestTimeFromDigits(int[] arr) {
        List<String> list = new ArrayList<>();
        String input = "";
        for (int i : arr) {
            input += i;
        }
        perm(input,"",list);
        String output = list.stream().filter(this::isValid).max(Comparator.naturalOrder()).orElse("");
        return output.isEmpty()?"":output.substring(0, 2) + ":" + output.substring(2);
    }

    private boolean isValid(String time){
        if(Integer.parseInt(time.substring(0,2))>23) return false;
        if(Integer.parseInt(time.substring(2))>59) return false;
        return true;
    }
    public void perm(String input, String perm, List<String> list) {
        if(input.isEmpty()) list.add(perm);
        for (int i = 0; i < input.length(); i++) {
            String temp = input.substring(0,i)+input.substring(i+1);
            perm(temp, perm + input.charAt(i), list);
        }
    }
}

/*
      //23:59

        StringBuilder input = new StringBuilder();
        for (int i : arr) {
            input.append(i);
        }
        StringBuilder output = new StringBuilder();

        boolean minutes=false;
        for (int i = 5; i >=0 ; i--) {
            int index = input.indexOf(String.valueOf(i));
            if (index != -1) {
                output.append(i);
                input.deleteCharAt(index);
                minutes=true;
                break;
            }
        }
        if(!minutes) return "";

        boolean minutes1=false;
        for (int i = 9; i >=0 ; i--) {
            int index = input.indexOf(String.valueOf(i));
            if (index != -1) {
                output.append(i);
                input.deleteCharAt(index);
                minutes1=true;
                break;
            }
        }
        if(!minutes1) return "";

        boolean hours=false;
        for (int i = 2; i >=0 ; i--) {
            int index = input.indexOf(String.valueOf(i));
            if (index != -1) {
                output.append(i);
                input.deleteCharAt(index);
                hours=true;
                break;
            }
        }
        if(!hours) return "";

        boolean hours1=false;
        int j;
        if(output.charAt(0)=='2')
            j=3;
        else
            j=9;
        for (; j >=0 ; j--) {
            int index = input.indexOf(String.valueOf(j));
            if (index != -1) {
                output.append(j+":");
                input.deleteCharAt(index);
                hours1=true;
                break;
            }
        }
        if(!hours1) return "";

        return output.toString();
 */
package com.learning.strings;

import java.util.ArrayList;
import java.util.List;

public class LeetCode830_PositionsOfGroups {

    public static void main(String[] args) {
        LeetCode830_PositionsOfGroups solution = new LeetCode830_PositionsOfGroups();
        System.out.println(solution.largeGroupPositions("abbxxxxzzy"));
        System.out.println(solution.largeGroupPositions("abcdddeeeeaabbbcd"));
        System.out.println(solution.largeGroupPositions("aaa"));
    }

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int count = 1;
        //s += s.charAt(s.length() - 1);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if(i==s.length()-1 && (count >= 3))
                    result.add(new ArrayList<>(List.of(i - count+1, i)));
            }
            else {
                if (count >= 3)
                    result.add(new ArrayList<>(List.of(i - count, i-1)));
                count = 1;
            }

        }
        //System.out.println(count);
        return result;
    }
}

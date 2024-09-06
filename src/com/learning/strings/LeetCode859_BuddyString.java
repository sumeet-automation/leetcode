package com.learning.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode859_BuddyString {

    public static void main(String[] args) {
        LeetCode859_BuddyString solution = new LeetCode859_BuddyString();
        System.out.println(solution.buddyStrings("acb", "abc"));
    }
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        //ab ab aa aa --> first false, second true when characters are same, you can technically swap them..
        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (set.contains(c))
                    return true;
                set.add(c);
            }
            return false;
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)!=goal.charAt(i)){
                    list.add(i);
                }
            }
            return list.size() == 2
                    && s.charAt(list.get(0)) == goal.charAt(list.get(1))
                    && s.charAt(list.get(1)) == goal.charAt(list.get(0));
        }
    }
}

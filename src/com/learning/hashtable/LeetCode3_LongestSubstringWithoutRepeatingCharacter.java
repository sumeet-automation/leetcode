package com.learning.hashtable;

import java.util.*;

public class LeetCode3_LongestSubstringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        LeetCode3_LongestSubstringWithoutRepeatingCharacter solution = new LeetCode3_LongestSubstringWithoutRepeatingCharacter();
        System.out.println(solution.lengthOfLongestSubstringHashSet("au"));
    }
    public int lengthOfLongestSubstringHashSet(String s) {
        int maxLength=0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                if(set.contains(s.charAt(j))) {
                    //maxLength = Math.max(maxLength, set.size());
                    break;
                }
                else {
                    //22 fresh kedar patel
                    set.add(s.charAt(j));
                }
            }
            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }

}

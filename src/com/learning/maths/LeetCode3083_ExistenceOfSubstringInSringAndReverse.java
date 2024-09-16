package com.learning.maths;

import java.util.HashSet;
import java.util.Set;

public class LeetCode3083_ExistenceOfSubstringInSringAndReverse {


    public boolean isSubstringPresent(String s) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length()-1; i++) {
            set.add(s.substring(i, i + 2));
        }
        String rev = new StringBuilder(s).reverse().toString();
        for (int i = 0; i <rev.length()-1; i++) {
            if (set.contains(rev.substring(i, i + 2))) {
                return true;
            }
        }
        return false;
    }

}

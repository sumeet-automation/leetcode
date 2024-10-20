package com.learning.strings;

public class LeetCode1784_MoreThan1SegmentOf1 {

    public boolean checkOnesSegment(String s) {
        if (!s.contains("0")) return true;
        int idx = s.indexOf("1");
        int n = s.length();
        for (int i = idx + 1; i < n; i++) {
            if (s.charAt(i) == '0') {
                idx = i;
                break;
            }
        }
        if (idx == n - 1) return true;
        return !s.substring(idx).contains("1");
    }

}

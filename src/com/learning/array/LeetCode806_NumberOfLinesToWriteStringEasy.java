package com.learning.array;

public class LeetCode806_NumberOfLinesToWriteStringEasy {

    public int[] numberOfLines(int[] widths, String s) {
     int width = 0;
     int lines=1;
        for (char c : s.toCharArray()) {
            int currWidth = widths[c - 'a'];
            if (currWidth + width < 100) {
                lines++;
                width = 0;
            }
            width+=currWidth;
        }
        return new int[]{lines,width};
    }
}

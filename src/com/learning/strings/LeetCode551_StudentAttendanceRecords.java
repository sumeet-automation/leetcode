package com.learning.strings;

public class LeetCode551_StudentAttendanceRecords {
    public boolean checkRecord(String s) {
        return s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL");
    }
}

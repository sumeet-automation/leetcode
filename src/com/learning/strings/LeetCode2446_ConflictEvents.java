package com.learning.strings;

import java.time.LocalTime;

public class LeetCode2446_ConflictEvents {

    public static void main(String[] args) {
        LeetCode2446_ConflictEvents solution = new LeetCode2446_ConflictEvents();
        solution.haveConflict(new String[]{"01:15", "02:00"}, new String[]{"02:00", "03:00"});
    }

    public boolean haveConflict(String[] event1, String[] event2) {
        LocalTime event1Start = LocalTime.parse(event1[0]);
        LocalTime event1End = LocalTime.parse(event1[1]);
        LocalTime event2Start = LocalTime.parse(event2[0]);
        LocalTime event2End = LocalTime.parse(event2[1]);
        //!(end1.isBefore(start2) || end2.isBefore(start1))
        System.out.println(!event1End.isBefore(event2Start));
        System.out.println(event2End.isBefore(event1Start));
        return true;
    }

    public boolean haveConflictUsingMaths(String[] event1, String[] event2) {
        int startEvent1Time = convertToMinutes(event1[0]);
        int endEvent1Time = convertToMinutes(event1[1]);
        int startEvent2Time = convertToMinutes(event2[0]);
        int endEvent2Time = convertToMinutes(event2[1]);
        return endEvent1Time >= startEvent2Time && endEvent2Time >= startEvent1Time;
    }

    private int convertToMinutes(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));
    }
}

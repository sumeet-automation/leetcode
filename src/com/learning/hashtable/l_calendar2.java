package com.learning.hashtable;

import java.util.Map;
import java.util.TreeMap;

public class l_calendar2 {
}

class MyCalendarTwo {
    private final int maxAllowed;
    TreeMap<Integer, Integer> bookings;

    public MyCalendarTwo() {
        bookings = new TreeMap<>();
        maxAllowed = 2;
    }

    public boolean book(int start, int end) {
        bookings.put(start, bookings.getOrDefault(start,0) + 1);
        bookings.put(end, bookings.getOrDefault(end,0) - 1);
        int overlapCount = 0;
        for (Map.Entry<Integer, Integer> entry : bookings.entrySet()) {
            overlapCount += entry.getValue();
            if (overlapCount > maxAllowed) {
                bookings.put(start, bookings.get(start) - 1);
                bookings.put(end, bookings.get(end) + 1);
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */

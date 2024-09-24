package com.learning.twopointers;

public class LeetCode2540_MinimumCommonValue {

    public int getCommon(int[] nums1, int[] nums2) {
        int pt1 = 0, pt2 = 0;
        boolean found = false;
        while (pt1 < nums1.length && pt2 < nums2.length) {
            if (nums1[pt1] < nums2[pt2]) pt1++;
            else if (nums1[pt1] > nums2[pt2]) pt2++;
            else {
                found = true;
                break;
            }
        }
        return found ? nums2[pt2] : -1;
    }
}

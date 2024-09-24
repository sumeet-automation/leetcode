package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.ListNode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeeCode3217_RemoveElements {

    public static void main(String[] args) {
        LeeCode3217_RemoveElements solution = new LeeCode3217_RemoveElements();
    }


    public ListNode modifiedList(int[] nums, ListNode head) {
        var set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        curr.next=head;
        while (head != null) {
            if (set.contains(head.val)) {
                curr.next=head.next;
            } else {
                curr = curr.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}

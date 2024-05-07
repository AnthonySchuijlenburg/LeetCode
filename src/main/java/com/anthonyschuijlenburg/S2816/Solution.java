package com.anthonyschuijlenburg.S2816;

import com.anthonyschuijlenburg.Helpers.ListNode;

import java.util.ArrayList;

public class Solution {
    public ListNode doubleIt(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head.next != null) {
            list.add(head.val);
            head = head.next;
        }
        list.add(head.val);
        head = null;

        int remainder = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            int doubleValue = list.get(i) * 2;
            if (doubleValue + remainder < 10) {
                head = new ListNode(doubleValue + remainder, head);
                remainder = 0;
                continue;
            }
            head = new ListNode(doubleValue + remainder - 10, head);
            remainder = 1;
        }
        if (remainder > 0) {
            head = new ListNode(remainder, head);
        }

        return head;
    }
}

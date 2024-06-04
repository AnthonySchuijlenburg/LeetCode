package com.anthonyschuijlenburg.S0002;

import com.anthonyschuijlenburg.Helpers.ListNode;

import java.util.ArrayList;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = extractNumbers(l1);
        ArrayList<Integer> list2 = extractNumbers(l2);

        ArrayList<Integer> list = new ArrayList<>();

        int remainder = 0;
        int largestList = Math.max(list1.size(), list2.size());

        for (int i = 0; i < largestList; i++) {
            int valueA = i < list1.size() ? list1.get(i) : 0;
            int valueB = i < list2.size() ? list2.get(i) : 0;
            int total = valueA + valueB;

            if (total + remainder < 10) {
                list.add(total + remainder);
                remainder = 0;
                continue;
            }
            list.add(total + remainder - 10);
            remainder = 1;
        }
        if (remainder > 0) {
            list.add(remainder);
        }

        ListNode head = null;

        for (int i = list.size() - 1; i >= 0; i--) {
            head = new ListNode(list.get(i), head);
        }

        return head;
    }

    private static ArrayList<Integer> extractNumbers(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = head;

        while (current.next != null) {
            list.add(current.val);
            current = current.next;
        }

        list.add(current.val);

        return list;
    }
}

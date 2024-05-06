package com.anthonyschuijlenburg.S2487;

import com.anthonyschuijlenburg.Helpers.ListNode;

import java.util.ArrayList;

public class Solution {
    public ListNode removeNodes(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode current = head;

        while (current.next != null) {
            list.add(current);
            current = current.next;
        }

        list.add(current);

        int smallest = 0;
        ListNode last = null;

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).val >= smallest) {
                smallest = list.get(i).val;
                last = new ListNode(list.get(i).val, last);
            }
        }

        return last != null ? last : new ListNode();
    }
}

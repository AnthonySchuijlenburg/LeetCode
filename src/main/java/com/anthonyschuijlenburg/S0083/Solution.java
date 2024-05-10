package com.anthonyschuijlenburg.S0083;

import com.anthonyschuijlenburg.Helpers.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        if (head == null || head.next == null) {
            return head;
        }

        while (cur.next != null) {
            if(cur.val >= cur.next.val) {
                cur.next = cur.next.next;
                continue;
            }

            cur = cur.next;
        }

        return head;
    }
}

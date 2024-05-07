package com.anthonyschuijlenburg.S2816;

import com.anthonyschuijlenburg.Helpers.ListNode;

public class Solution {
    public ListNode doubleIt(ListNode head) {
        StringBuilder sb = new StringBuilder();

        while (head.next != null) {
            sb.append(head.val);
            head = head.next;
        }
        sb.append(head.val);

        String doubleStringValue = doubleStringValue(sb.toString());

        sb.delete(0, sb.length());

        sb.append(doubleStringValue);

        head = new ListNode(Integer.parseInt("" + sb.charAt(0)));
        ListNode current = head;

        for (int i = 1; i < sb.length(); i++) {
            current.next = new ListNode(Integer.parseInt("" + sb.charAt(i)));
            current = current.next;
        }

        return head;
    }

    private static String doubleStringValue(String string) {
        try {
            return "" + Long.parseLong(string) * 2;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            int remainder = 0;
            for (int i = string.length() - 1; i >= 0; i--) {
                int doubleValue = Integer.parseInt("" + string.charAt(i)) * 2;
                if (doubleValue + remainder < 10) {
                    sb.append(doubleValue + remainder);
                    remainder = 0;
                    continue;
                }
                sb.append(doubleValue + remainder - 10);
                remainder = 1;
            }
            if (remainder > 0) {
                sb.append(remainder);
            }

            return sb.reverse().toString();
        }
    }
}

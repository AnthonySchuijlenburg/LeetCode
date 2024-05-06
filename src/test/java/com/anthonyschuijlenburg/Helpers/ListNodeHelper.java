package com.anthonyschuijlenburg.Helpers;

import java.util.ArrayList;

public class ListNodeHelper extends ListNode {

    public static ArrayList<Integer> extractValues(ListNode list) {
        ArrayList<Integer> foundValues = new ArrayList<>();
        ListNode nextNode = list;

        while (nextNode != null) {
            foundValues.add(nextNode.val);
            nextNode = nextNode.next;
        }

        return foundValues;
    }

    public static ListNode createLinkedList(ArrayList<Integer> values) {
        ListNode head = new ListNode(values.getFirst());
        ListNode current = head;

        for (int i = 1; i < values.size(); i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
        }

        return head;
    }
}

package com.anthonyschuijlenburg.S0206;

import java.util.ArrayList;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ArrayList<Integer> numbers = extractValues(head);

        Integer[] foundValuesArray = numbers.toArray(new Integer[0]);

        ListNode newList = new ListNode(foundValuesArray[0]);

        for (int i = 1; i < foundValuesArray.length; i++) {
            newList = new ListNode(foundValuesArray[i], newList);
        }

        return newList;
    }

    public static ArrayList<Integer> extractValues(ListNode list) {
        ArrayList<Integer> foundValues = new ArrayList<>();
        ListNode nextNode = list;

        while (nextNode != null) {
            foundValues.add(nextNode.val);
            nextNode = nextNode.next;
        }

        return foundValues;
    }
}

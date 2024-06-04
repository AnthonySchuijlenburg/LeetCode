package com.anthonyschuijlenburg.S0021;

import com.anthonyschuijlenburg.Helpers.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        ArrayList<Integer> foundValues = new ArrayList<>();

        foundValues.addAll(extractValues(list1));
        foundValues.addAll(extractValues(list2));

        Integer[] foundValuesArray = foundValues.toArray(new Integer[0]);

        Arrays.sort(foundValuesArray, Collections.reverseOrder());

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

package com.anthonyschuijlenburg.S0141;

import com.anthonyschuijlenburg.Helpers.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<Integer> foundNodeHashes = new HashSet<>();
        ListNode nextNode = head;

        while (nextNode != null) {
            if (foundNodeHashes.contains(nextNode.hashCode())) {
                return true;
            }

            foundNodeHashes.add(nextNode.hashCode());
            nextNode = nextNode.next;
        }

        return false;
    }
}

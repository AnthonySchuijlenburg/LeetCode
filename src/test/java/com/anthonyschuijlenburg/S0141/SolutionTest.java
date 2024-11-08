package com.anthonyschuijlenburg.S0141;

import com.anthonyschuijlenburg.Helpers.ListNode;
import com.anthonyschuijlenburg.Helpers.ListNodeHelper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void addTwoNumbers_testCase0() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> list = new ArrayList<>(List.of(0));

        ListNode head = ListNodeHelper.createLinkedList(list);
        boolean result = solutionGenerator.hasCycle(head);

        assertFalse(result);
    }

    @Test
    void addTwoNumbers_testCase1() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        ListNode head = ListNodeHelper.createLinkedList(list);
        boolean result = solutionGenerator.hasCycle(head);

        assertFalse(result);
    }

    @Test
    void addTwoNumbers_testCase2() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        ListNode head = ListNodeHelper.createLinkedList(list);
        ListNode tail = new ListNode(4, head);
        head.next.next.next = tail;

        boolean result = solutionGenerator.hasCycle(tail);

        assertTrue(result);
    }
}
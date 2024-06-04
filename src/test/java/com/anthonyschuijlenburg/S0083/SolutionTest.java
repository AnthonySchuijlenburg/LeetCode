package com.anthonyschuijlenburg.S0083;

import com.anthonyschuijlenburg.Helpers.ListNode;
import com.anthonyschuijlenburg.Helpers.ListNodeHelper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void deleteDuplicates_testCase0() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(List.of(0));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.deleteDuplicates(head);

        assertEquals(
                nodes,
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void deleteDuplicates_testCase1() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(1,1,2));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.deleteDuplicates(head);

        assertEquals(
                new ArrayList<>(Arrays.asList(1,2)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void deleteDuplicates_testCase2() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(1, 1, 1));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.deleteDuplicates(head);

        assertEquals(
                new ArrayList<>(List.of(1)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void deleteDuplicates_testCase3() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3,3));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.deleteDuplicates(head);

        assertEquals(
                new ArrayList<>(Arrays.asList(1,2,3)),
                ListNodeHelper.extractValues(result)
        );
    }
}
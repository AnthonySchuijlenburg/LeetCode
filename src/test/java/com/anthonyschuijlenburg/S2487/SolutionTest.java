package com.anthonyschuijlenburg.S2487;

import com.anthonyschuijlenburg.Helpers.ListNode;
import com.anthonyschuijlenburg.Helpers.ListNodeHelper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void removeNodes_testCase0() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(List.of(0));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.removeNodes(head);

        assertEquals(
                nodes,
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void removeNodes_testCase1() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(5,2,13,3,8));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.removeNodes(head);

        assertEquals(
                new ArrayList<>(Arrays.asList(13, 8)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void removeNodes_testCase2() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(1, 1, 1));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.removeNodes(head);

        assertEquals(
                nodes,
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void removeNodes_testCase3() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(10, 5, 3));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.removeNodes(head);

        assertEquals(
                nodes,
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void removeNodes_testCase4() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(10, 12, 10, 11, 5, 3));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.removeNodes(head);

        assertEquals(
                new ArrayList<>(Arrays.asList(12, 11, 5, 3)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void removeNodes_testCase5() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(123,998,961,444,943,266,920,698));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.removeNodes(head);

        assertEquals(
                new ArrayList<>(Arrays.asList(998,961,943,920,698)),
                ListNodeHelper.extractValues(result)
        );
    }
}
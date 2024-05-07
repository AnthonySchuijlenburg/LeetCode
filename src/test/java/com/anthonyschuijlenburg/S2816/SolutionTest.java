package com.anthonyschuijlenburg.S2816;

import com.anthonyschuijlenburg.Helpers.ListNode;
import com.anthonyschuijlenburg.Helpers.ListNodeHelper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void doubleIt_testCase1() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(1, 2, 3));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.doubleIt(head);

        assertEquals(
                new ArrayList<>(Arrays.asList(2, 4, 6)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void doubleIt_testCase2() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(1, 8, 9));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.doubleIt(head);

        assertEquals(
                new ArrayList<>(Arrays.asList(3, 7, 8)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void doubleIt_testCase3() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(9, 9, 9));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.doubleIt(head);

        assertEquals(
                new ArrayList<>(Arrays.asList(1, 9, 9, 8)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void doubleIt_testCase4() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(3,4,5,4,2,5,5,9,9,9));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.doubleIt(head);

        assertEquals(
                new ArrayList<>(Arrays.asList(6, 9, 0, 8, 5, 1, 1, 9, 9, 8)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void doubleIt_testCase5() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> nodes = new ArrayList<>(Arrays.asList(9,1,9,5,0,5,1,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9));

        ListNode head = ListNodeHelper.createLinkedList(nodes);
        ListNode result = solutionGenerator.doubleIt(head);

        assertEquals(
                new ArrayList<>(Arrays.asList(1, 8, 3, 9, 0, 1, 0, 3, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 8)),
                ListNodeHelper.extractValues(result)
        );
    }
}
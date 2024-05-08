package com.anthonyschuijlenburg.S0002;

import com.anthonyschuijlenburg.Helpers.ListNode;
import com.anthonyschuijlenburg.Helpers.ListNodeHelper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void addTwoNumbers_testCase1() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        ListNode head1 = ListNodeHelper.createLinkedList(list1);
        ListNode head2 = ListNodeHelper.createLinkedList(list2);
        ListNode result = solutionGenerator.addTwoNumbers(head1, head2);

        assertEquals(
                new ArrayList<>(Arrays.asList(2, 4, 6)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void addTwoNumbers_testCase2() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 6, 4));

        ListNode head1 = ListNodeHelper.createLinkedList(list1);
        ListNode head2 = ListNodeHelper.createLinkedList(list2);
        ListNode result = solutionGenerator.addTwoNumbers(head1, head2);

        assertEquals(
                new ArrayList<>(Arrays.asList(7, 0, 8)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void addTwoNumbers_testCase3() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(9, 9, 9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 0, 1));

        ListNode head1 = ListNodeHelper.createLinkedList(list1);
        ListNode head2 = ListNodeHelper.createLinkedList(list2);
        ListNode result = solutionGenerator.addTwoNumbers(head1, head2);

        assertEquals(
                new ArrayList<>(Arrays.asList(0 ,0, 1, 1)),
                ListNodeHelper.extractValues(result)
        );
    }

    @Test
    void addTwoNumbers_testCase4() {
        Solution solutionGenerator = new Solution();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(9, 9, 9, 9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(9, 9));

        ListNode head1 = ListNodeHelper.createLinkedList(list1);
        ListNode head2 = ListNodeHelper.createLinkedList(list2);
        ListNode result = solutionGenerator.addTwoNumbers(head1, head2);

        assertEquals(
                new ArrayList<>(Arrays.asList(8, 9, 0, 0, 1)),
                ListNodeHelper.extractValues(result)
        );
    }
}
package com.anthonyschuijlenburg.S0021;

import com.anthonyschuijlenburg.Helpers.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void mergeTwoLists_simpleValidInput() {
        Solution solutionGenerator =  new Solution();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3)));

        ListNode result = solutionGenerator.mergeTwoLists(list1, list2);

        assertEquals(
                new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3)),
                Solution.extractValues(result)
        );
    }

    @Test
    void mergeTwoLists_complexValidInput() {
        Solution solutionGenerator =  new Solution();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode list2 = new ListNode(3, new ListNode(6, new ListNode(9)));

        ListNode result = solutionGenerator.mergeTwoLists(list1, list2);

        assertEquals(
                new ArrayList<>(Arrays.asList(1, 2, 3, 3, 6, 9)),
                Solution.extractValues(result)
        );
    }

    @Test
    void mergeTwoLists_emptyInput() {
        Solution solutionGenerator =  new Solution();

        ListNode list1 = null;
        ListNode list2 = null;

        ListNode result = solutionGenerator.mergeTwoLists(list1, list2);

        assertEquals(
                new ArrayList<>(),
                Solution.extractValues(result)
        );
    }

    @Test
    void mergeTwoLists_oneEmptyInput() {
        Solution solutionGenerator =  new Solution();

        ListNode list1 = null;
        ListNode list2 = new ListNode();

        ListNode result = solutionGenerator.mergeTwoLists(list1, list2);

        assertEquals(
                new ArrayList<>(List.of(0)),
                Solution.extractValues(result)
        );
    }
}

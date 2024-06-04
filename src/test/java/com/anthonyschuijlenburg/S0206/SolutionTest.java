package com.anthonyschuijlenburg.S0206;

import com.anthonyschuijlenburg.Helpers.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void reverseList_testCase1() {
        Solution solutionGenerator = new Solution();
        ListNode list = new ListNode(1);
        ListNode result = solutionGenerator.reverseList(list);

        assertEquals(
                new ArrayList<>(List.of(1)),
                Solution.extractValues(result)
        );
    }

    @Test
    void reverseList_testCase2() {
        Solution solutionGenerator = new Solution();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode result = solutionGenerator.reverseList(list);

        assertEquals(
                new ArrayList<>(Arrays.asList(3, 2, 1)),
                Solution.extractValues(result)
        );
    }

    @Test
    void reverseList_testCase3() {
        Solution solutionGenerator = new Solution();
        ListNode result = solutionGenerator.reverseList(null);

        assertEquals(new ArrayList<>(), Solution.extractValues(result));
    }
}
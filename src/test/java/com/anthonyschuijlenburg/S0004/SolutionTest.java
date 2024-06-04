package com.anthonyschuijlenburg.S0004;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void findMedianSortedArrays_testCase1() {
        Solution solutionGenerator = new Solution();

        double result = solutionGenerator.findMedianSortedArrays(
                new int[]{1, 2},
                new int[]{3}
        );

        assertEquals(2.0, result);
    }

    @Test
    void findMedianSortedArrays_testCase2() {
        Solution solutionGenerator = new Solution();

        double result = solutionGenerator.findMedianSortedArrays(
                new int[]{1,2},
                new int[]{3,4}
        );

        assertEquals(2.5, result);
    }
}
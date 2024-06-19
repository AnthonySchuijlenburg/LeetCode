package com.anthonyschuijlenburg.S0826;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfitAssignment_testCase0() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.maxProfitAssignment(
                new int[]{0},
                new int[]{0},
                new int[]{0}
        );
        assertEquals(0, result);
    }

    @Test
    void maxProfitAssignment_testCase1() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.maxProfitAssignment(
                new int[]{2,4,6,8,10},
                new int[]{10,20,30,40,50},
                new int[]{4,5,6,7}
        );
        assertEquals(100, result);
    }

    @Test
    void maxProfitAssignment_testCase2() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.maxProfitAssignment(
                new int[]{85,47,57},
                new int[]{24,66,99},
                new int[]{40,25,25}
        );
        assertEquals(0, result);
    }

    @Test
    void maxProfitAssignment_testCase3() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.maxProfitAssignment(
                new int[]{2,17,19,20,24,29,33,43,50,51,57,67,70,72,73,75,80,82,87,90},
                new int[]{6,7,10,17,18,29,30,31,34,39,40,42,48,54,57,78,78,78,83,88},
                new int[]{12,9,11,41,11,87,48,6,48,93,76,73,7,50,55,97,47,33,46,10}
        );
        assertEquals(693, result);
    }
}
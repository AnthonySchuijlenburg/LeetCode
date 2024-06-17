package com.anthonyschuijlenburg.S0633;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void judgeSquareSum_testCase0() {
        Solution solutionGenerator = new Solution();

        boolean result = solutionGenerator.judgeSquareSum(0);
        assertTrue(result);
    }

    @Test
    void judgeSquareSum_testCase1() {
        Solution solutionGenerator = new Solution();

        boolean result = solutionGenerator.judgeSquareSum(3);
        assertFalse(result);
    }

    @Test
    void judgeSquareSum_testCase2() {
        Solution solutionGenerator = new Solution();

        boolean result = solutionGenerator.judgeSquareSum(5);
        assertTrue(result);
    }

    @Test
    void judgeSquareSum_testCase3() {
        Solution solutionGenerator = new Solution();

        boolean result = solutionGenerator.judgeSquareSum(4);
        assertTrue(result);
    }

    @Test
    void judgeSquareSum_testCase5() {
        Solution solutionGenerator = new Solution();

        boolean result = solutionGenerator.judgeSquareSum(1);
        assertTrue(result);
    }

    @Test
    void judgeSquareSum_testCase6() {
        Solution solutionGenerator = new Solution();

        // Largest available number (constraints)
        boolean result = solutionGenerator.judgeSquareSum(Integer.MAX_VALUE - 1);
        assertFalse(result);
    }
}
package com.anthonyschuijlenburg.S0121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void maxProfit_testCase0() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.maxProfit(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void maxProfit_testCase1() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, result);
    }

    @Test
    void maxProfit_testCase2() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.maxProfit(new int[]{7, 6, 4, 3, 1});
        assertEquals(0, result);
    }

    @Test
    void maxProfit_testCase3() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.maxProfit(new int[]{1, 4, 2});
        assertEquals(3, result);
    }

    @Test
    void maxProfit_testCase4() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.maxProfit(new int[]{3, 2, 6, 5, 0, 3});
        assertEquals(4, result);
    }
}
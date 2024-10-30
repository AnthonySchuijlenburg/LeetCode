package com.anthonyschuijlenburg.S0136;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void singleNumber_testCase0() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.singleNumber(new int[]{1});
        assertEquals(1, result);
    }

    @Test
    void singleNumber_testCase1() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.singleNumber(new int[]{2, 2, 1});
        assertEquals(1, result);
    }

    @Test
    void singleNumber_testCase2() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.singleNumber(new int[]{4, 1, 2, 1, 2});
        assertEquals(4, result);
    }
}
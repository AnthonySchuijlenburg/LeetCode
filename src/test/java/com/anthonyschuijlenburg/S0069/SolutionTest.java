package com.anthonyschuijlenburg.S0069;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void mySqrt_testCase1() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.mySqrt(4);

        assertEquals(2, result);
    }

    @Test
    void mySqrt_testCase3() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.mySqrt(8);

        assertEquals(2, result);
    }
}
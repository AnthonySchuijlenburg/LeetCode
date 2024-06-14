package com.anthonyschuijlenburg.S0945;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void minIncrementForUnique_testCase0() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.minIncrementForUnique(new int[]{0});

        assertEquals(0, result);
    }

    @Test
    void minIncrementForUnique_testCase1() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.minIncrementForUnique(new int[]{1,2,2});

        assertEquals(1, result);
    }

    @Test
    void minIncrementForUnique_testCase2() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.minIncrementForUnique(new int[]{3,2,1,2,1,7});

        assertEquals(6, result);
    }
}
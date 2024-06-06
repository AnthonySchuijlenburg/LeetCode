package com.anthonyschuijlenburg.S1296;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void isPossibleDivide_testCase0() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isPossibleDivide(new int[]{1}, 1);

        assertTrue(result);
    }

    @Test
    void isPossibleDivide_testCase1() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isPossibleDivide(new int[]{1,2,3,3,4,4,5,6}, 4);

        assertTrue(result);
    }

    @Test
    void isPossibleDivide_testCase2() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isPossibleDivide(new int[]{3,2,1,2,3,4,3,4,5,9,10,11}, 3);

        assertTrue(result);
    }

    @Test
    void isPossibleDivide_testCase3() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isPossibleDivide(new int[]{1,2,3,4}, 3);

        assertFalse(result);
    }

    @Test
    void isPossibleDivide_testCase4() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isPossibleDivide(new int[]{8,10,12}, 3);

        assertFalse(result);
    }
}
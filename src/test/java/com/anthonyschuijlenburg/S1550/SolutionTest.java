package com.anthonyschuijlenburg.S1550;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void threeConsecutiveOdds_testCase0() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.threeConsecutiveOdds(new int[]{1});

        assertFalse(result);
    }

    @Test
    void threeConsecutiveOdds_testCase1() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.threeConsecutiveOdds(new int[]{2,6,4,1});

        assertFalse(result);
    }

    @Test
    void threeConsecutiveOdds_testCase2() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12});

        assertTrue(result);
    }

    @Test
    void threeConsecutiveOdds_testCase3() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.threeConsecutiveOdds(new int[]{1,2,1,1});

        assertFalse(result);
    }

}
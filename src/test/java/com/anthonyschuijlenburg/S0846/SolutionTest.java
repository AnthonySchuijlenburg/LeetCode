package com.anthonyschuijlenburg.S0846;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void isNStraightHand_testCase0() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isNStraightHand(new int[]{1}, 1);

        assertTrue(result);
    }

    @Test
    void isNStraightHand_testCase1() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3);

        assertTrue(result);
    }

    @Test
    void isNStraightHand_testCase2() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isNStraightHand(new int[]{1,2,3,4,5}, 4);

        assertFalse(result);
    }

    @Test
    void isNStraightHand_testCase3() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isNStraightHand(new int[]{8,10,12}, 3);

        assertFalse(result);
    }
}
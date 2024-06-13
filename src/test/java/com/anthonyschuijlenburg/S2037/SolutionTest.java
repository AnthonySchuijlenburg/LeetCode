package com.anthonyschuijlenburg.S2037;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void climbStairs_testCase1() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4});

        assertEquals(4, result);
    }

    @Test
    void climbStairs_testCase2() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.minMovesToSeat(new int[]{4, 1, 5, 9}, new int[]{1, 3, 2, 6});

        assertEquals(7, result);
    }

    @Test
    void climbStairs_testCase3() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.minMovesToSeat(new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6});

        assertEquals(4, result);
    }
}
package com.anthonyschuijlenburg.S2441;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void climbStairs_testCase1() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.findMaxK(new int[]{-1, 2, -3, 3});

        assertEquals(3, result);
    }

    @Test
    void findMaxK_testCase2() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.findMaxK(new int[]{-1,10,6,7,-7,1});

        assertEquals(7, result);
    }

    @Test
    void findMaxK_testCase3() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.findMaxK(new int[]{-10,8,6,7,-2,-3});

        assertEquals(-1, result);
    }

    @Test
    void findMaxK_testCase4() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.findMaxK(new int[]{});

        assertEquals(-1, result);
    }
}
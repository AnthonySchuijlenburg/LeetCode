package com.anthonyschuijlenburg.S0070;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void climbStairs_singleInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.climbStairs(1);

        assertEquals(1, result);
    }

    @Test
    void climbStairs_simpleInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.climbStairs(2);

        assertEquals(2, result);
    }

    @Test
    void climbStairs_complexInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.climbStairs(5);

        assertEquals(8, result);
    }

    @Test
    void climbStairs_complexLongInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.climbStairs(45);

        assertEquals(1836311903, result);
    }
}
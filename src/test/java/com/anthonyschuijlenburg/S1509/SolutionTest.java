package com.anthonyschuijlenburg.S1509;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minDifference_testCase0() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.minDifference(new int[]{0});
        assertEquals(0, result);
    }

    @Test
    void minDifference_testCase1() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.minDifference(new int[]{5,3,2,4});
        assertEquals(0, result);
    }

    @Test
    void minDifference_testCase2() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.minDifference(new int[]{3,100,20});
        assertEquals(0, result);
    }

    @Test
    void minDifference_testCase3() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.minDifference(new int[]{1,5,0,10,14});
        assertEquals(1, result);
    }

    @Test
    void minDifference_testCase4() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.minDifference(new int[]{9,48,92,48,81,31});
        assertEquals(17, result);
    }
}
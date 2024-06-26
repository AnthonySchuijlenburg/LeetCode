package com.anthonyschuijlenburg.S0066;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void plusOne_testCase1() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.plusOne(new int[] {1});

        assertArrayEquals(new int[] {2}, result);
    }

    @Test
    void plusOne_testCase2() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.plusOne(new int[] {1, 2, 3});

        assertArrayEquals(new int[] {1, 2, 4}, result);
    }

    @Test
    void plusOne_testCase3() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.plusOne(new int[] {9});

        assertArrayEquals(new int[] {1, 0}, result);
    }

    @Test
    void plusOne_testCase4() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.plusOne(new int[] {9, 9});

        assertArrayEquals(new int[] {1, 0, 0}, result);
    }

    @Test
    void plusOne_testCase5() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.plusOne(new int[] {1, 9, 9});

        assertArrayEquals(new int[] {2, 0, 0}, result);
    }
}
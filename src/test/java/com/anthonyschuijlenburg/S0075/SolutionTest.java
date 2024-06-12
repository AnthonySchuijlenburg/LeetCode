package com.anthonyschuijlenburg.S0075;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void climbStairs_testCase0() {
        Solution solutionGenerator = new Solution();
        int[] arr = new int[]{0};
        solutionGenerator.sortColors(arr);

        assertArrayEquals(new int[]{0}, arr);
    }

    @Test
    void climbStairs_testCase1() {
        Solution solutionGenerator = new Solution();
        int[] arr = new int[]{1};
        solutionGenerator.sortColors(arr);

        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void climbStairs_testCase2() {
        Solution solutionGenerator = new Solution();
        int[] arr = new int[]{0, 1, 2};
        solutionGenerator.sortColors(arr);

        assertArrayEquals(new int[]{0, 1, 2}, arr);
    }

    @Test
    void climbStairs_testCase3() {
        Solution solutionGenerator = new Solution();
        int[] arr = new int[]{2, 1, 0};
        solutionGenerator.sortColors(arr);

        assertArrayEquals(new int[]{0, 1, 2}, arr);
    }

    @Test
    void climbStairs_testCase4() {
        Solution solutionGenerator = new Solution();
        int[] arr = new int[]{2, 0, 2, 1, 1, 0};
        solutionGenerator.sortColors(arr);

        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, arr);
    }

    @Test
    void climbStairs_testCase5() {
        Solution solutionGenerator = new Solution();
        int[] arr = new int[]{2, 0, 1};
        solutionGenerator.sortColors(arr);

        assertArrayEquals(new int[]{0, 1, 2}, arr);
    }
}
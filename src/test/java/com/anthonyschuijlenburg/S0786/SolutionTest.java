package com.anthonyschuijlenburg.S0786;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void kthSmallestPrimeFraction_testCase0() {
        Solution solutionGenerator = new Solution();

        int[] result = solutionGenerator.kthSmallestPrimeFraction(new int[]{1, 2}, 1);
        assertArrayEquals(new int[]{1,2}, result);
    }

    @Test
    void kthSmallestPrimeFraction_testCase1() {
        Solution solutionGenerator = new Solution();

        int[] result = solutionGenerator.kthSmallestPrimeFraction(new int[]{1,2,3,5}, 3);
        assertArrayEquals(new int[]{2,5}, result);
    }

    @Test
    void kthSmallestPrimeFraction_testCase2() {
        Solution solutionGenerator = new Solution();

        int[] result = solutionGenerator.kthSmallestPrimeFraction(new int[]{1,7}, 1);
        assertArrayEquals(new int[]{1,7}, result);
    }

    @Test
    void kthSmallestPrimeFraction_testCase3() {
        Solution solutionGenerator = new Solution();

        int[] result = solutionGenerator.kthSmallestPrimeFraction(new int[]{1,2,4,6,10}, 1);
        assertArrayEquals(new int[]{1,10}, result);
    }

    @Test
    void kthSmallestPrimeFraction_testCase4() {
        Solution solutionGenerator = new Solution();

        int[] result = solutionGenerator.kthSmallestPrimeFraction(new int[]{1,2,4,6,10}, 3);
        assertArrayEquals(new int[]{2,10}, result);
    }
}
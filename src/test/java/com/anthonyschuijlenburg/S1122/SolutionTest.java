package com.anthonyschuijlenburg.S1122;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void climbStairs_testCase0() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.relativeSortArray(
                new int[]{0},
                new int[]{0}
        );

        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    void climbStairs_testCase1() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.relativeSortArray(
                new int[]{2,3,1,3,2,4,6,7,9,2,19},
                new int[]{2,1,4,3,9,6}
        );

        assertArrayEquals(new int[]{2,2,2,1,4,3,3,9,6,7,19}, result);
    }

    @Test
    void climbStairs_testCase2() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.relativeSortArray(
                new int[]{28,6,22,8,44,17},
                new int[]{22,28,8,6}
        );

        assertArrayEquals(new int[]{22,28,8,6,17,44}, result);
    }

    @Test
    void climbStairs_testCase3() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.relativeSortArray(
                new int[]{2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31},
                new int[]{2,42,38,0,43,21}
        );

        assertArrayEquals(new int[]{2,42,38,0,43,21,5,7,12,12,13,23,24,24,27,29,30,31,33,48}, result);
    }
}
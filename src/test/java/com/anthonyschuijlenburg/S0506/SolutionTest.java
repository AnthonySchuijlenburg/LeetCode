package com.anthonyschuijlenburg.S0506;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void findRelativeRanks_testCase1() {
        Solution solutionGenerator = new Solution();

        String[] result = solutionGenerator.findRelativeRanks(new int[]{5, 4, 3, 2, 1});
        assertArrayEquals(new String[]{"Gold Medal","Silver Medal","Bronze Medal","4","5"}, result);
    }

    @Test
    void findRelativeRanks_testCase2() {
        Solution solutionGenerator = new Solution();

        String[] result = solutionGenerator.findRelativeRanks(new int[]{10,3,8,9,4});
        assertArrayEquals(new String[]{"Gold Medal","5","Bronze Medal","Silver Medal","4"}, result);
    }

    @Test
    void findRelativeRanks_testCase3() {
        Solution solutionGenerator = new Solution();

        String[] result = solutionGenerator.findRelativeRanks(new int[]{1});
        assertArrayEquals(new String[]{"Gold Medal"}, result);
    }

    @Test
    void findRelativeRanks_testCase4() {
        Solution solutionGenerator = new Solution();

        String[] result = solutionGenerator.findRelativeRanks(new int[]{1, 2});
        assertArrayEquals(new String[]{"Silver Medal", "Gold Medal"}, result);
    }

    @Test
    void findRelativeRanks_testCase5() {
        Solution solutionGenerator = new Solution();

        String[] result = solutionGenerator.findRelativeRanks(new int[]{5, 4, 3, 2, 1, 6, 8});
        assertArrayEquals(new String[]{"Bronze Medal", "4", "5", "6", "7", "Silver Medal", "Gold Medal"}, result);
    }
}
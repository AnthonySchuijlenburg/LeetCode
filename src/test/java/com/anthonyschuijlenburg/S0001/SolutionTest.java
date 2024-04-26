package com.anthonyschuijlenburg.S0001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void twoSum_testCase1() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.twoSum(new int[]{2,7,11,15}, 9);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void twoSum_testCase2() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.twoSum(new int[]{3,2,4}, 6);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void twoSum_testCase3() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.twoSum(new int[]{3,3}, 6);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void twoSum_testCase4() {
        Solution solutionGenerator = new Solution();
        int[] result = solutionGenerator.twoSum(new int[]{}, 6);

        assertArrayEquals(new int[]{}, result);
    }
}
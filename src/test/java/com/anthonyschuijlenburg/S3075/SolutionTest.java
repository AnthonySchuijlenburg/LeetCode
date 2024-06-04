package com.anthonyschuijlenburg.S3075;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void maximumHappinessSum_testCase0() {
        Solution solutionGenerator = new Solution();

        long result = solutionGenerator.maximumHappinessSum(new int[]{1}, 1);
        assertEquals(1, result);
    }

    @Test
    void maximumHappinessSum_testCase1() {
        Solution solutionGenerator = new Solution();

        long result = solutionGenerator.maximumHappinessSum(new int[]{3, 2, 1}, 2);
        assertEquals(4, result);
    }

    @Test
    void maximumHappinessSum_testCase2() {
        Solution solutionGenerator = new Solution();

        long result = solutionGenerator.maximumHappinessSum(new int[]{1,1,1,1}, 3);
        assertEquals(1, result);
    }

    @Test
    void maximumHappinessSum_testCase3() {
        Solution solutionGenerator = new Solution();

        long result = solutionGenerator.maximumHappinessSum(new int[]{2,3,4,5}, 1);
        assertEquals(5, result);
    }
}
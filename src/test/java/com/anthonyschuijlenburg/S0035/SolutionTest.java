package com.anthonyschuijlenburg.S0035;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchInsert_singleInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.searchInsert(new int[]{1}, 1);

        assertEquals(result, 0);
    }

    @Test
    void searchInsert_simpleInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.searchInsert(new int[]{1, 3, 5, 6}, 5);

        assertEquals(2, result);
    }

    @Test
    void searchInsert_complexInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.searchInsert(new int[]{1, 3, 5, 6}, 2);

        assertEquals(1, result);
    }

    @Test
    void searchInsert_complexInputWithTargetBelowScope() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.searchInsert(new int[]{1, 3, 5, 6}, 0);

        assertEquals(0, result);
    }

    @Test
    void searchInsert_complexInputWithTargetOutOfScope() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.searchInsert(new int[]{1, 3, 5, 6}, 7);

        assertEquals(4, result);
    }
}
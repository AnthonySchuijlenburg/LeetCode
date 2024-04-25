package com.anthonyschuijlenburg.S0058;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void searchInsert_singleInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("Hello");

        assertEquals(result, 5);
    }

    @Test
    void searchInsert_simpleInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("Hello World");

        assertEquals(result, 5);
    }

    @Test
    void searchInsert_complexInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("Hello World  ");

        assertEquals(result, 5);
    }

    @Test
    void searchInsert_emptyInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("");

        assertEquals(result, 0);
    }
}
package com.anthonyschuijlenburg.S0058;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void lengthOfLastWord_singleInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("Hello");

        assertEquals(result, 5);
    }

    @Test
    void lengthOfLastWord_simpleInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("Hello World");

        assertEquals(result, 5);
    }

    @Test
    void lengthOfLastWord_complexInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("Hello World  ");

        assertEquals(result, 5);
    }

    @Test
    void lengthOfLastWord_emptyInput() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("");

        assertEquals(result, 0);
    }
}
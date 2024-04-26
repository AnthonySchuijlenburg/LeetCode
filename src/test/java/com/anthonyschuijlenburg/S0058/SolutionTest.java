package com.anthonyschuijlenburg.S0058;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void lengthOfLastWord_testCase1() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("Hello");

        assertEquals(result, 5);
    }

    @Test
    void lengthOfLastWord_testCase2() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("Hello World");

        assertEquals(result, 5);
    }

    @Test
    void lengthOfLastWord_testCase3() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("Hello World  ");

        assertEquals(result, 5);
    }

    @Test
    void lengthOfLastWord_testCase4() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.lengthOfLastWord("");

        assertEquals(result, 0);
    }
}
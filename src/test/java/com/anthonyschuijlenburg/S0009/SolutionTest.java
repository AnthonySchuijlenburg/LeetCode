package com.anthonyschuijlenburg.S0009;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void isPalindrome_testCase1() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isPalindrome(121);

        assertTrue(result);
    }

    @Test
    void isPalindrome_testCase2() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isPalindrome(-121);

        assertFalse(result);
    }

    @Test
    void isPalindrome_testCase3() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isPalindrome(10);

        assertFalse(result);
    }
}
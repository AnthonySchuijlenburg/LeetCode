package com.anthonyschuijlenburg.S0125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isPalindrome_testCase0() {
        Solution solutionGenerator = new Solution();

        boolean result = solutionGenerator.isPalindrome("");
        assertTrue(result);
    }

    @Test
    void isPalindrome_testCase1() {
        Solution solutionGenerator = new Solution();

        boolean result = solutionGenerator.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(result);
    }

    @Test
    void isPalindrome_testCase2() {
        Solution solutionGenerator = new Solution();

        boolean result = solutionGenerator.isPalindrome("racecar");
        assertTrue(result);
    }

    @Test
    void isPalindrome_testCase3() {
        Solution solutionGenerator = new Solution();

        boolean result = solutionGenerator.isPalindrome("race a car");
        assertFalse(result);
    }
}
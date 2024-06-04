package com.anthonyschuijlenburg.S0409;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void longestPalindrome_testCase0() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.longestPalindrome("a");

        assertEquals(1, result);
    }

    @Test
    void longestPalindrome_testCase1() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.longestPalindrome("abccccdd");

        assertEquals(7, result);
    }

    @Test
    void longestPalindrome_testCase2() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.longestPalindrome("abc");

        assertEquals(1, result);
    }

    @Test
    void longestPalindrome_testCase3() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.longestPalindrome("bb");

        assertEquals(2, result);
    }

    @Test
    void longestPalindrome_testCase4() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.longestPalindrome("bbb");

        assertEquals(3, result);
    }
}
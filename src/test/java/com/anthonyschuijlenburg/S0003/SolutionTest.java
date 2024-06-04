package com.anthonyschuijlenburg.S0003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring_testCase0() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.lengthOfLongestSubstring("");
        assertEquals(0, result);
    }

    @Test
    void lengthOfLongestSubstring_testCase1() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring_testCase2() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.lengthOfLongestSubstring("bbb");
        assertEquals(1, result);
    }

    @Test
    void lengthOfLongestSubstring_testCase3() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring_testCase4() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.lengthOfLongestSubstring(" ");
        assertEquals(1, result);
    }

    @Test
    void lengthOfLongestSubstring_testCase5() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.lengthOfLongestSubstring("dvdf");
        assertEquals(3, result);
    }
}
package com.anthonyschuijlenburg.S0028;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void otherStrStr_testCase1() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.otherStrStr("a", "a");

        assertEquals(0, result);
    }

    @Test
    void otherStrStr_testCase2() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.otherStrStr("HelloWorld", "lo");

        assertEquals(3, result);
    }

    @Test
    void otherStrStr_testCase3() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.otherStrStr("LoremIpsumDolorSitAmetConsecteturAdipiscingElit", "Elit");

        assertEquals(43, result);
    }

    @Test
    void otherStrStr_testCase4() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.otherStrStr("HelloWorld", "Needle");

        assertEquals(-1, result);
    }

    @Test
    void strStr_testCase1() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.strStr("a", "a");

        assertEquals(0, result);
    }

    @Test
    void strStr_testCase2() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.strStr("HelloWorld", "lo");

        assertEquals(3, result);
    }

    @Test
    void strStr_testCase3() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.strStr("LoremIpsumDolorSitAmetConsecteturAdipiscingElit", "Elit");

        assertEquals(43, result);
    }

    @Test
    void strStr_testCase4() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.strStr("HelloWorld", "Needle");

        assertEquals(-1, result);
    }
}
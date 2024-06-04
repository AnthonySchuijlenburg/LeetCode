package com.anthonyschuijlenburg.S2486;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void appendCharacters_testCase0() {
        Solution solutionGenerator = new Solution();

        int solution = solutionGenerator.appendCharacters("a", "a");
        assertEquals(0, solution);
    }

    @Test
    void appendCharacters_testCase1() {
        Solution solutionGenerator = new Solution();

        int solution = solutionGenerator.appendCharacters("coaching", "coding");
        assertEquals(4, solution);
    }

    @Test
    void appendCharacters_testCase2() {
        Solution solutionGenerator = new Solution();

        int solution = solutionGenerator.appendCharacters("abcde", "a");
        assertEquals(0, solution);
    }

    @Test
    void appendCharacters_testCase3() {
        Solution solutionGenerator = new Solution();

        int solution = solutionGenerator.appendCharacters("z", "abcde");
        assertEquals(5, solution);
    }
}
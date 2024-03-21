package com.anthonyschuijlenburg.S0020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid_simpleValidInput() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isValid("()");

        assertTrue(result);
    }

    @Test
    void isValid_longerValidInput() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isValid("()[]{}");

        assertTrue(result);
    }

    @Test
    void isValid_simpleInvalidInput() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isValid("(}");

        assertFalse(result);
    }

    @Test
    void isValid_complexInvalidInput() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isValid("}");

        assertFalse(result);
    }

    @Test
    void isValid_emptyInput() {
        Solution solutionGenerator = new Solution();
        boolean result = solutionGenerator.isValid("(}");

        assertFalse(result);
    }
}
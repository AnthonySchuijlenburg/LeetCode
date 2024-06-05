package com.anthonyschuijlenburg.S0344;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void reverseString_testCase0() {
        Solution solutionGenerator = new Solution();
        char[] array = new char[]{'a'};
        solutionGenerator.reverseString(array);

        assertArrayEquals(new char[]{'a'}, array);
    }

    @Test
    void reverseString_testCase1() {
        Solution solutionGenerator = new Solution();
        char[] array = new char[]{'h', 'e', 'l', 'l', 'o'};
        solutionGenerator.reverseString(array);

        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, array);
    }

    @Test
    void reverseString_testCase2() {
        Solution solutionGenerator = new Solution();
        char[] array = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        solutionGenerator.reverseString(array);

        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, array);
    }
}
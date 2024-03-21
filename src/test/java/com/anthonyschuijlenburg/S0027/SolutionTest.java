package com.anthonyschuijlenburg.S0027;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeElement_simpleInput() {
        Solution solutionGenerator = new Solution();
        int[] numbers = new int[]{3, 2, 2, 3};
        int result = solutionGenerator.removeElement(numbers, 3);

        assertEquals(2, result);
        assertArrayContentEquals(new int[]{2, 2}, numbers);
    }

    @Test
    void removeElement_complexInput() {
        Solution solutionGenerator = new Solution();
        int[] numbers = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int result = solutionGenerator.removeElement(numbers, 2);

        assertEquals(5, result);
        assertArrayContentEquals(new int[]{0, 1, 4, 0, 3}, numbers);
    }

    @Test
    void removeElement_emptyInput() {
        Solution solutionGenerator = new Solution();
        int[] numbers = new int[]{};
        int result = solutionGenerator.removeElement(numbers, 2);

        assertEquals(0, result);
    }

    private void assertArrayContentEquals(int[] expected, int[] actual) {
        Arrays.sort(expected);
        actual = Arrays.copyOf(actual, expected.length);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
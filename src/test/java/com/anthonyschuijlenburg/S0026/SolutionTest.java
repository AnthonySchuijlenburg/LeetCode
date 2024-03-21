package com.anthonyschuijlenburg.S0026;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void removeDuplicates_simpleInput() {
        Solution solutionGenerator = new Solution();
        int[] numbers = new int[]{1, 1, 2};
        int result = solutionGenerator.removeDuplicates(numbers);

        assertEquals(2, result);
        assertArrayContentEquals(new int[]{1, 2}, numbers);
    }

    @Test
    void removeDuplicates_complexInput() {
        Solution solutionGenerator = new Solution();
        int[] numbers = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = solutionGenerator.removeDuplicates(numbers);

        assertEquals(5, result);
        assertArrayContentEquals(new int[]{0, 1, 2, 3, 4}, numbers);
    }

    private void assertArrayContentEquals(int[] expected, int[] actual) {
        assertArrayEquals(expected, Arrays.copyOf(actual, expected.length));
    }
}
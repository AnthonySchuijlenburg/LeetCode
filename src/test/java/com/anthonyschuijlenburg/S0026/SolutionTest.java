package com.anthonyschuijlenburg.S0026;

import org.junit.jupiter.api.Test;

import static com.anthonyschuijlenburg.Helpers.Assertions.assertArrayStartsEqual;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void removeDuplicates_testCase1() {
        Solution solutionGenerator = new Solution();
        int[] numbers = new int[]{1, 1, 2};
        int result = solutionGenerator.removeDuplicates(numbers);

        assertEquals(2, result);
        assertArrayStartsEqual(new int[]{1, 2}, numbers);
    }

    @Test
    void removeDuplicates_testCase2() {
        Solution solutionGenerator = new Solution();
        int[] numbers = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = solutionGenerator.removeDuplicates(numbers);

        assertEquals(5, result);
        assertArrayStartsEqual(new int[]{0, 1, 2, 3, 4}, numbers);
    }


}
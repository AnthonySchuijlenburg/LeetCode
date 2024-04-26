package com.anthonyschuijlenburg.S0027;

import org.junit.jupiter.api.Test;

import static com.anthonyschuijlenburg.Helpers.Assertions.assertArrayContentsEqual;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void removeElement_testCase1() {
        Solution solutionGenerator = new Solution();
        int[] numbers = new int[]{3, 2, 2, 3};
        int result = solutionGenerator.removeElement(numbers, 3);

        assertEquals(2, result);
        assertArrayContentsEqual(new int[]{2, 2}, numbers);
    }

    @Test
    void removeElement_testCase2() {
        Solution solutionGenerator = new Solution();
        int[] numbers = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int result = solutionGenerator.removeElement(numbers, 2);

        assertEquals(5, result);
        assertArrayContentsEqual(new int[]{0, 1, 4, 0, 3}, numbers);
    }

    @Test
    void removeElement_testCase3() {
        Solution solutionGenerator = new Solution();
        int[] numbers = new int[]{};
        int result = solutionGenerator.removeElement(numbers, 2);

        assertEquals(0, result);
    }


}
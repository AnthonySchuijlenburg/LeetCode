package com.anthonyschuijlenburg.S1791;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findCenter_testCase1() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.findCenter(new int[][]{
                new int[]{1,2},
                new int[]{2,3},
                new int[]{4,2},
        });

        assertEquals(2, result);
    }

    @Test
    void findCenter_testCase2() {
        Solution solutionGenerator = new Solution();

        int result = solutionGenerator.findCenter(new int[][]{
                new int[]{1,2},
                new int[]{5,1},
                new int[]{1,3},
                new int[]{1,4},
        });

        assertEquals(1, result);
    }
}
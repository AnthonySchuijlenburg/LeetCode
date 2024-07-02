package com.anthonyschuijlenburg.S0350;

import com.anthonyschuijlenburg.Helpers.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void intersect_testCase0() {
        Solution solutionGenerator = new Solution();

        int[] result = solutionGenerator.intersect(
                new int[]{0},
                new int[]{0}
        );

        Assertions.assertArrayContentsEqual(
                new int[]{0},
                result
        );
    }

    @Test
    void intersect_testCase1() {
        Solution solutionGenerator = new Solution();

        int[] result = solutionGenerator.intersect(
                new int[]{1,2,2,1},
                new int[]{2,2}
        );

        Assertions.assertArrayContentsEqual(
                new int[]{2,2},
                result
        );
    }

    @Test
    void intersect_testCase2() {
        Solution solutionGenerator = new Solution();

        int[] result = solutionGenerator.intersect(
                new int[]{4,9,5},
                new int[]{9,4,9,8,4}
        );

        Assertions.assertArrayContentsEqual(
                new int[]{9,4},
                result
        );
    }
}
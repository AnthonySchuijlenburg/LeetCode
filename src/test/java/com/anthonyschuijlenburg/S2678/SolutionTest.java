package com.anthonyschuijlenburg.S2678;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countSeniors_testCase0() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.countSeniors(new String[]{
                "7868190130M7522"
        });

        assertEquals(1, result);
    }

    @Test
    void countSeniors_testCase1() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.countSeniors(new String[]{
                "7868190130M7522",
                "5303914400F9211",
                "9273338290F4010",
        });

        assertEquals(2, result);
    }

    @Test
    void countSeniors_testCase3() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.countSeniors(new String[]{
                "1313579440F2036",
                "2921522980M5644",
        });

        assertEquals(0, result);
    }
}
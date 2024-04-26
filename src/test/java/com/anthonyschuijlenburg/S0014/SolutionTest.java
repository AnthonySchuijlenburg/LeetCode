package com.anthonyschuijlenburg.S0014;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {
    @Test
    void solutionTest_testCase1() {
        Solution solutionGenerator = new Solution();
        String result = solutionGenerator.longestCommonPrefix(new String[]{
                "a"
        });

        assertEquals("a", result);
    }

    @Test
    void solutionTest_testCase2() {
        Solution solutionGenerator = new Solution();
        String result = solutionGenerator.longestCommonPrefix(new String[]{
                "ab",
                "a",
        });

        assertEquals("a", result);
    }

    @Test
    void solutionTest_testCase3() {
        Solution solutionGenerator = new Solution();
        String result = solutionGenerator.longestCommonPrefix(new String[]{
                "flower",
                "flow",
                "flight"
        });

        assertEquals("fl", result);
    }

    @Test
    void solutionTest_testCase4() {
        Solution solutionGenerator = new Solution();
        String result = solutionGenerator.longestCommonPrefix(new String[]{
                "",
                "",
        });

        assertEquals("", result);
    }

    @Test
    void solutionTest_testCase5() {
        Solution solutionGenerator = new Solution();
        String result = solutionGenerator.longestCommonPrefix(new String[]{});

        assertEquals("", result);
    }
}

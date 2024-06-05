package com.anthonyschuijlenburg.S1002;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void commonChars_testCase0() {
        Solution solutionGenerator = new Solution();
        List<String> result = solutionGenerator.commonChars(new String[]{"a"});

        assertArrayEquals(new String[]{"a"}, result.toArray());
    }

    @Test
    void commonChars_testCase1() {
        Solution solutionGenerator = new Solution();
        List<String> result = solutionGenerator.commonChars(new String[]{"bella","label","roller"});

        assertArrayEquals(new String[]{"e","l","l"}, result.toArray());
    }

    @Test
    void commonChars_testCase2() {
        Solution solutionGenerator = new Solution();
        List<String> result = solutionGenerator.commonChars(new String[]{"cool","lock","cook"});

        assertArrayEquals(new String[]{"c","o"}, result.toArray());
    }

    @Test
    void commonChars_testCase3() {
        Solution solutionGenerator = new Solution();
        List<String> result = solutionGenerator.commonChars(new String[]{"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"});

        assertArrayEquals(new String[]{}, result.toArray());
    }
}
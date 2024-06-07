package com.anthonyschuijlenburg.S0648;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void replaceWords_testCase0() {
        Solution solutionGenerator = new Solution();
        String result = solutionGenerator.replaceWords(
                List.of("a"),
                "apple"
        );

        assertEquals("a", result);
    }

    @Test
    void replaceWords_testCase1() {
        Solution solutionGenerator = new Solution();
        String result = solutionGenerator.replaceWords(
                Arrays.asList("cat","bat","rat"),
                "the cattle was rattled by the battery"
        );

        assertEquals("the cat was rat by the bat", result);
    }

    @Test
    void replaceWords_testCase2() {
        Solution solutionGenerator = new Solution();
        String result = solutionGenerator.replaceWords(
                Arrays.asList("a","b","c"),
                "aadsfasf absbs bbab cadsfafs"
        );

        assertEquals("a a b c", result);
    }

    @Test
    void replaceWords_testCase3() {
        Solution solutionGenerator = new Solution();
        String result = solutionGenerator.replaceWords(
                Arrays.asList("a", "aa", "aaa", "aaaa"),
                "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"
        );

        assertEquals("a a a a a a a a bbb baba a", result);
    }
}
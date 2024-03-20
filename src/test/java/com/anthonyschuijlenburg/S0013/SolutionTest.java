package com.anthonyschuijlenburg.S0013;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void romanToInt_SimpleNumber() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.romanToInt("I");

        assertEquals(1, result);
    }

    @Test
    void romanToInt_MultipleNumbers() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.romanToInt("III");

        assertEquals(3, result);
    }

    @Test
    void romanToInt_AllNumbers() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.romanToInt("MDCLXVI");

        assertEquals(1666, result);
    }

    @Test
    void romanToInt_ComplexNumber() {
        Solution solutionGenerator = new Solution();
        int result = solutionGenerator.romanToInt("IV");

        assertEquals(4, result);
    }

}

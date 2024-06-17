package com.anthonyschuijlenburg.S0633;

public class Solution {
    public boolean judgeSquareSum(int c) {
        double max = Math.sqrt(c);

        for (int i = 0; i <= max; i++) {
            double result = Math.sqrt(c - (i * i));

            // Check if result is a whole number
            if (result == (int) result) {
                return true;
            }
        }

        return false;
    }
}

package com.anthonyschuijlenburg.S0069;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        double guess;
        double squareRoot = (double) x / 2;

        do {
            guess = squareRoot;
            squareRoot = (guess + (x / guess)) / 2;
        } while ((guess - squareRoot) != 0);

        return (int) squareRoot;
    }
}
package com.anthonyschuijlenburg.S0070;

class Solution {
    public int climbStairs(int n) {
        int[] possibilities = new int[n + 1];
        possibilities[0] = 1;
        possibilities[1] = 1;

        for (int i = 2; i <= n; i++) {
            possibilities[i] = possibilities[i - 1] + possibilities[i - 2];
        }

        return possibilities[n];
    }
}
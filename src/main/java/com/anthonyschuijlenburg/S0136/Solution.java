package com.anthonyschuijlenburg.S0136;

public class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;

        for (int num: nums) {
            xor ^= num;
        }

        return xor;
    }
}

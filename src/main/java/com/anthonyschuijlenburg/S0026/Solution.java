package com.anthonyschuijlenburg.S0026;

class Solution {
    public int removeDuplicates(int[] numbers) {
        int j = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                numbers[j] = numbers[i];
                j++;
            }
        }

        return j;
    }
}
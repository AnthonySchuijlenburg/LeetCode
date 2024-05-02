package com.anthonyschuijlenburg.S2441;

import java.util.Arrays;

class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int pointerA = 0, pointerB = nums.length - 1;
        while (pointerA < pointerB) {
            if (nums[pointerA] + nums[pointerB] > 0) {
                pointerB --;
                continue;
            }
            if (nums[pointerA] + nums[pointerB] < 0) {
                pointerA ++;
                continue;
            }

            return nums[pointerB];
        }

        return -1;
    }
}
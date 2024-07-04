package com.anthonyschuijlenburg.S1509;

import java.util.Arrays;

public class Solution {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) {
            return 0;
        }

        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;

        for (int l = 0, r = nums.length - 4; l < 4; l++, r++) {
            minDiff = Math.min(minDiff, nums[r] - nums[l]);
        }


        return minDiff;
    }
}

package com.anthonyschuijlenburg.S0945;

import java.util.Arrays;

public class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int inc = 0;

        for (int i = 1; i < nums.length; i++) {
            // Check if the current number is equal to or smaller than the number before it
            if (nums[i] <= nums[i - 1]) {
                // Add the minimum amount of steps to make to this value one larger than the number before it
                inc += (nums[i - 1] - nums[i] ) + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }

        return inc;
    }
}

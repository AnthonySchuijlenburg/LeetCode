package com.anthonyschuijlenburg.S0035;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        if (target < nums[l]) {
            return 0;
        }

        if (target > nums[r]) {
            return nums.length;
        }

        while (l < r) {
            int nextPointer = l + (r - l) / 2;
            if (nums[nextPointer] == target) {
                return nextPointer;
            }

            if (nums[nextPointer] < target) {
                l = nextPointer + 1;
            } else {
                r = nextPointer;
            }
        }

        return l;
    }
}

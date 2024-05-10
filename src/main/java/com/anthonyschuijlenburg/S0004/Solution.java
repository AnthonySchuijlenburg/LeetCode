package com.anthonyschuijlenburg.S0004;

public class Solution {
    private int p1 = 0, p2 = 0;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;

        // Combined array has an even length, so median is an average
        boolean isEvenLength = (m + n) % 2 == 0;
        int loopSize = isEvenLength ? (m + n) / 2 - 1 : (m + n) / 2;

        for (int i = 0; i < loopSize; i++) {
            getMinimum(nums1, nums2);
        }

        if (isEvenLength) {
            return (double) (getMinimum(nums1, nums2) + getMinimum(nums1, nums2)) / 2;
        }

        return getMinimum(nums1, nums2);
    }

    private int getMinimum(int[] nums1, int[] nums2) {
        if (p1 < nums1.length && p2 < nums2.length) {
            return nums1[p1] <= nums2[p2] ? nums1[p1++] : nums2[p2++];
        }

        if (p1 < nums1.length) {
            return nums1[p1++];
        }

        if (p2 < nums2.length) {
            return nums2[p2++];
        }

        // This shouldn't happen
        return -1;
    }
}

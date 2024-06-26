package com.anthonyschuijlenburg.S0088;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p3 = nums1.length - 1;

        while(p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p3--] = nums1[p1--];
                continue;
            }

            nums1[p3--] = nums2[p2--];
        }
    }
}

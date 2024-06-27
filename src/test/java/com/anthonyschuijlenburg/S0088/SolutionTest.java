package com.anthonyschuijlenburg.S0088;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void merge_testCase0() {
        Solution solutionGenerator = new Solution();

        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{};

        solutionGenerator.merge(
                nums1,
                0,
                nums2,
                nums2.length
        );

        assertArrayEquals(
                new int[]{},
                nums1
        );
    }

    @Test
    void merge_testCase1() {
        Solution solutionGenerator = new Solution();

        int[] nums1 = new int[]{1, 2, 3, 0, 0};
        int[] nums2 = new int[]{4, 5};

        solutionGenerator.merge(
                nums1,
                nums1.length - nums2.length,
                nums2,
                nums2.length
        );

        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5},
                nums1
        );
    }

    @Test
    void merge_testCase2() {
        Solution solutionGenerator = new Solution();

        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};

        solutionGenerator.merge(
                nums1,
                nums1.length - nums2.length,
                nums2,
                nums2.length
        );

        assertArrayEquals(
                new int[]{1,2,2,3,5,6},
                nums1
        );
    }

    @Test
    void merge_testCase3() {
        Solution solutionGenerator = new Solution();

        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};

        solutionGenerator.merge(
                nums1,
                nums1.length - nums2.length,
                nums2,
                nums2.length
        );

        assertArrayEquals(
                new int[]{1},
                nums1
        );
    }

    @Test
    void merge_testCase4() {
        Solution solutionGenerator = new Solution();

        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};

        solutionGenerator.merge(
                nums1,
                0,
                nums2,
                nums2.length
        );

        assertArrayEquals(
                new int[]{1},
                nums1
        );
    }

    @Test
    void merge_testCase5() {
        Solution solutionGenerator = new Solution();

        int[] nums1 = new int[]{-1,0,0,3,3,3,0,0,0};
        int[] nums2 = new int[]{1,2,2};

        solutionGenerator.merge(
                nums1,
                nums1.length - nums2.length,
                nums2,
                nums2.length
        );

        assertArrayEquals(
                new int[]{-1,0,0,1,2,2,3,3,3},
                nums1
        );
    }
}
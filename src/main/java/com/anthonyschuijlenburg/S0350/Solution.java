package com.anthonyschuijlenburg.S0350;

import java.util.*;

class Solution {
    Set<Integer> numsFound = new HashSet<>();

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> counts1 = getCountsMap(nums1);
        HashMap<Integer, Integer> counts2 = getCountsMap(nums2);

        ArrayList<Integer> intersect = new ArrayList<>();

        for(int num: numsFound) {
            int addition = Math.min(
                    counts1.getOrDefault(num, 0),
                    counts2.getOrDefault(num, 0)
            );

            for (int i = 0; i < addition; i++) {
                intersect.add(num);
            }
        }

        int[] nums = new int[intersect.size()];

        for (int i = 0; i < intersect.size(); i++) {
            nums[i] = intersect.get(i);
        }

        return nums;
    }

    public HashMap<Integer, Integer> getCountsMap(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int num: nums) {
            numsFound.add(num);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        return counts;
    }
}
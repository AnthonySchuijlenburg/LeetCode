package com.anthonyschuijlenburg.S0075;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int counter = 0;
        for (int key : map.keySet()) {
            Arrays.fill(nums, counter, counter + map.get(key), key);
            counter += map.get(key);
        }
    }
}

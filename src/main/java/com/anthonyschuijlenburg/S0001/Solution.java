package com.anthonyschuijlenburg.S0001;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (hashMap.containsKey(complement)) {
                return new int[]{hashMap.get(complement), i};
            }

            hashMap.put(numbers[i], i);
        }

        return new int[]{};
    }
}

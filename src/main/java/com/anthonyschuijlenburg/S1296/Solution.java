package com.anthonyschuijlenburg.S1296;

import java.util.TreeMap;

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0) {
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        while(!map.isEmpty()) {
            int currentCard = map.entrySet().iterator().next().getKey();

            for (int i = 0; i < k; i++) {
                if(!map.containsKey(currentCard + i)) {
                    return false;
                }

                if(map.get(currentCard + i) == 1) {
                    map.remove(currentCard + i);
                    continue;
                }

                map.put(currentCard + i, map.get(currentCard + i) - 1);
            }
        }

        return true;
    }
}
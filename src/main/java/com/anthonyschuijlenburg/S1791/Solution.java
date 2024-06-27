package com.anthonyschuijlenburg.S1791;

import java.util.HashMap;

class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int[] edge : edges) {
            for(int value : edge) {
                if(map.containsKey(value)) {
                    return value;
                }

                map.put(value, 1);
            }
        }

        return 0;
    }
}

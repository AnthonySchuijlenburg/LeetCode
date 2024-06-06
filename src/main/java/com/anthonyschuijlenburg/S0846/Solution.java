package com.anthonyschuijlenburg.S0846;

import java.util.TreeMap;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i: hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        while(!map.isEmpty()) {
            int currentCard = map.entrySet().iterator().next().getKey();

            for (int i = 0; i < groupSize; i++) {
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

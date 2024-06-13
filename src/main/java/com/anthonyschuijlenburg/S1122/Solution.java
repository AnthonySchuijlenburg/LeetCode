package com.anthonyschuijlenburg.S1122;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        for(int num : arr2) {
            int count = map.get(num);

            for (int i = 0; i < count; i++) {
                arr1[index++] = num;
            }

            map.remove(num);
        }

        PriorityQueue<Integer> keys = new PriorityQueue<>(map.keySet());

        while (!keys.isEmpty()) {
            int key = keys.poll();
            int count = map.get(key);
            for (int i = 0; i < count; i++) {
                arr1[index++] = key;
            }
        }

        return arr1;
    }
}

package com.anthonyschuijlenburg.S0786;

import java.util.*;

public class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) ->
                (a[0] * b[1]) - (a[1] * b[0]));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                minHeap.offer(new int[]{arr[i], arr[j]});
            }
        }

        while (k > 1) {
            minHeap.poll();
            k --;
        }

        return minHeap.poll();
    }
}

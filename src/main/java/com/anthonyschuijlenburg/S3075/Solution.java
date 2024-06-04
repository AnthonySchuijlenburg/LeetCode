package com.anthonyschuijlenburg.S3075;

import java.util.Arrays;

public class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0;
        Arrays.sort(happiness);

        for (int i = 0; i < k; i++) {
            sum += Math.max(happiness[happiness.length - i - 1] - i, 0);
        }

        return sum;
    }
}

package com.anthonyschuijlenburg.S0121;

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;

        for (int price : prices) {
            // Replace the minPrice if the current price is lower than it
            minPrice = Math.min(price, minPrice);

            // Replace the maxProfit if the current price - minPrice is higher than the current maxProfit
            maxProfit = Math.max(price - minPrice, maxProfit);
        }

        return maxProfit;
    }
}

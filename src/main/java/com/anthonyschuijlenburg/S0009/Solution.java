package com.anthonyschuijlenburg.S0009;

class Solution {
    public boolean isPalindrome(int x) {
        String input = "" + x;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

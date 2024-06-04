package com.anthonyschuijlenburg.S0409;

import java.util.HashSet;

public class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;

        for (char c : s.toCharArray()) {
            if(set.contains(c)) {
                set.remove(c);
                res += 2;
                continue;
            }

            set.add(c);
        }

        return set.isEmpty() ? res : res + 1;
    }
}

package com.anthonyschuijlenburg.S0003;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        Set<Character> characterSet = new HashSet<>();

        int left = 0;

        for (int right = 0; right < n; right++) {
            char nextChar = s.charAt(right);

            if (!characterSet.contains(nextChar)) {
                characterSet.add(nextChar);
                maxLength = Math.max(maxLength, characterSet.size());
                continue;
            }

            while (characterSet.contains(nextChar)) {
                characterSet.remove(s.charAt(left));
                left ++;
            }

            characterSet.add(nextChar);
        }

        return maxLength;
    }
}

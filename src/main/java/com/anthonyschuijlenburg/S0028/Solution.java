package com.anthonyschuijlenburg.S0028;

class Solution {
    // This worked too well and was a bit unsatisfying...
    public int otherStrStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) {
            return 0;
        }

        int len = needle.length();

        for (int i = 0; i <= haystack.length() - len; i++) {
            if (haystack.substring(i, i + len).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
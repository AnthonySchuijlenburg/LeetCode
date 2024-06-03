package com.anthonyschuijlenburg.S2486;

class Solution {
    public int appendCharacters(String s, String t) {
        if (s.equals(t)) {
            return 0;
        }

        char[] sLetters = s.toCharArray();
        char[] tLetters = t.toCharArray();

        int x = 0, y = 0;

        while (x < sLetters.length && y < tLetters.length) {
            if (sLetters[x] == tLetters[y]) {
                y++;
            }

            x++;
        }

        return t.length() - y;
    }
}

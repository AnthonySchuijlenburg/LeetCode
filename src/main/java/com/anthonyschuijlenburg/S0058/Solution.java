package com.anthonyschuijlenburg.S0058;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        String lastword = words[words.length - 1];

        return lastword.length();
    }
}
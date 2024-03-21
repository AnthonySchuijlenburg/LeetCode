package com.anthonyschuijlenburg.S0020;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        for (Character character : s.toCharArray()) {
            if (character == '(') {
                chars.add(')');
            } else if (character == '{') {
                chars.add('}');
            } else if (character == '[') {
                chars.add(']');
            } else if (chars.isEmpty() || character != chars.pop()) {
                return false;
            }
        }

        return chars.isEmpty();
    }
}

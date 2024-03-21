package com.anthonyschuijlenburg.S0014;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String longestCommonPrefix(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length));

        if (strings.length == 0) {
            return "";
        }

        if (strings.length == 1) {
            return strings[0];
        }

        for (int i = 0; i < strings[0].length(); i++) {

            for (String string : strings) {
                if (strings[0].charAt(i) != string.charAt(i)) {
                    return strings[0].substring(0, i);
                }
            }
        }

        return strings[0];
    }
}

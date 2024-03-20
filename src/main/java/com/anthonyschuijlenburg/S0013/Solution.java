package com.anthonyschuijlenburg.S0013;

import java.util.ArrayList;
import java.util.HashMap;


class Solution {

    private static final HashMap<String, Integer> numerals = new HashMap<>();

    static {
        numerals.put("I", 1);
        numerals.put("V", 5);
        numerals.put("X", 10);
        numerals.put("L", 50);
        numerals.put("C", 100);
        numerals.put("D", 500);
        numerals.put("M", 1000);
    }

    public int romanToInt(String s) {
        ArrayList<Integer> foundNumerals = new ArrayList<>();
        int total = 0;

        for (String character : s.split("")) {
            foundNumerals.add(numerals.get(character));
        }

        for (int i = 0; i < s.length() - 1; i++) {
            boolean isAddition = (foundNumerals.get(i) - foundNumerals.get(i + 1)) >= 0;
            total += isAddition ? foundNumerals.get(i) : foundNumerals.get(i) * -1;
        }

        total += foundNumerals.getLast();

        return total;
    }
}

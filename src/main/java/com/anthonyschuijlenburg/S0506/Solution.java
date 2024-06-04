package com.anthonyschuijlenburg.S0506;

import java.util.Arrays;

public class Solution {
    private final String[] places = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};

    public String[] findRelativeRanks(int[] score) {
        String[] strings = convertToStrings(score);
        int[] sortedScores = score.clone();
        Arrays.sort(sortedScores);

        for (int i = 0; i < sortedScores.length; i++) {
            int place = sortedScores[sortedScores.length - i - 1];
            String replace = "" + (i + 1);

            if (i < places.length) {
                replace = places[i];
            }

            strings[findIndex(place, score)] = replace;
        }

        return strings;
    }

    private String[] convertToStrings(int[] score) {
        String[] strings = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            strings[i] = String.valueOf(score[i]);
        }

        return strings;
    }

    private static int findIndex(int target, int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == target) {
                return i;
            }
        }

        return -1;
    }
}

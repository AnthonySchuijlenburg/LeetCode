package com.anthonyschuijlenburg.Helpers;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Assertions {
    public static void assertArrayStartsEqual(int[] expected, int[] actual) {
        assertArrayEquals(expected, Arrays.copyOf(actual, expected.length));
    }

    public static void assertArrayContentsEqual(int[] expected, int[] actual) {
        Arrays.sort(expected);
        actual = Arrays.copyOf(actual, expected.length);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}

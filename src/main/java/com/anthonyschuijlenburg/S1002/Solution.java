package com.anthonyschuijlenburg.S1002;

import java.util.*;

public class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = makeWordFrequencyMap(words[0]);

        for (String word : words) {
            HashMap<Character, Integer> compareMap = makeWordFrequencyMap(word);

            Set<Character> keysToRemove = new HashSet<>();
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                if (!compareMap.containsKey(entry.getKey())) {
                    keysToRemove.add(entry.getKey());
                    continue;
                }

                map.put(entry.getKey(), Math.min(entry.getValue(), compareMap.get(entry.getKey())));
            }

            for (Character key : keysToRemove) {
                map.remove(key);
            }
        }

        ArrayList<String> result = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.add(entry.getKey().toString());
            }
        }

        return result;
    }

    private HashMap<Character, Integer> makeWordFrequencyMap(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}

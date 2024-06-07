package com.anthonyschuijlenburg.S0648;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private Set<String> wordSet;

    public String replaceWords(List<String> dictionary, String sentence) {

        String[] wordArray = sentence.split(" ");
        wordSet = new HashSet<>(dictionary);

        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = shortestRoot(wordArray[i]);
        }

        return String.join(" ", wordArray);
    }

    private String shortestRoot(String word) {
        for (int i = 0; i < word.length(); i++) {
            String root = word.substring(0, i);
            if (wordSet.contains(root)) {
                return root;
            }
        }

        return word;
    }
}

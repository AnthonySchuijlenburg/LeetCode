package com.anthonyschuijlenburg.S2678;

public class Solution {
    public int countSeniors(String[] details) {
        int seniors = 0;

        for(String passenger : details) {
            int firstDigit = passenger.charAt(11) - '0';
            int secondDigit = passenger.charAt(12) - '0';

            int age = (firstDigit * 10) + secondDigit;

            if(age > 60) {
                seniors++;
            }
        }

        return seniors;
    }
}

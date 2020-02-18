package LabsMaven.Lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

/**
 * scrapLab4
 */
public class scrapLab4 {

    public static void main(String[] args) {
        // System.out.println(shuffleChecker("abc", "Def", "dabecf"));
        // System.out.println(shuffleChecker("abc", "Def", "zabcde"));
        // System.out.println(shuffleChecker("abc", "Def", "AAAAAA"));
        // System.out.println(shuffleChecker("abc", "Def", "zzzzzz"));
        // System.out.println(shuffleChecker("abc", "Def", "abc"));
        int[][] counts = 
        {
           { 0, 0, 1 },
           { 0, 1, 1, 2 },
           { 0, 0, 1, 4, 5 },
           { 0, 2 }
        };
        System.out.println(counts[2].length);


    }

    public static boolean shuffleChecker(String input1, String input2, String input3) {
        
        // Initialize values to check given contraints ignoring case
        String combined = input1.toLowerCase() + input2.toLowerCase();
        String thirdInput = input3.toLowerCase();

        // Check if comparisons have equal length
        if (combined.length() != thirdInput.length()) {
            return false;
        }
        
        // For each character in thirdInput, check if it exists in combined (input1 + input2)
        for (int i = 0; i < thirdInput.length(); i++) {
            boolean inputInCombinedTest = false;
            
            // Check if current letter of input3 is contained anywhere in input1 & 2
            for (int j = 0; j < thirdInput.length(); j++) {
                if (thirdInput.charAt(i) == combined.charAt(j)) {
                    inputInCombinedTest = true;
                }
            }

            // Check if there were no matches when comparing chars
            if (inputInCombinedTest == false) {
                return false;
            }

        }
        return true;
    }

    
}
////////////////////////////////////////////////////////////////////////////////////
// C212
//
// Released: 4/9/20
//
// Lab 10
// @Author Tony Dattolo, tdattolo
// Last Edited: 4/15/2020
//
//
// Directions: Part 1 - Reverse a string iteratively and recursively
//
////////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab10;

/**
 * Part1: Handles 
 */
public class Part1 {

    public static void main(String[] args) {

        String testWord0 = "1234567";
        String testWord1 = "1234567";

        System.out.println(reverseStringIterative(testWord0));
        System.out.println(reverseStringRecursive(testWord1));

    }

    /**
     * Takes in a string and reverses it, recursively
     * @param word a string
     * @return reversed string
     */
    public static String reverseStringRecursive(String word) {

        if (word.length() == 1) {
            return word;
        } else {
            return word.charAt(word.length() - 1)
                    + reverseStringRecursive(word.substring(0, word.length() - 1));

        }


    }

    /**
     * Takes in a string and reverses it, iteratively
     * @param word a string
     * @return reversed string
     */
    public static String reverseStringIterative(String word) {

        String wordReversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            wordReversed += word.charAt(i);
        }

        return wordReversed;
    }
}

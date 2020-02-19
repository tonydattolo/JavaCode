////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/13/20
//
//  Lab 5
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/18/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab5.pdf
//              Problems 1 & 2 located here. Problem 3 unit testing done here
//              Matrix class source code for problem 3 located in Matrix.java
//              JUnit Testing located in Lab5Tester.java
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Lab5Exercises class. Holds functionality for Lab5 requirements pset 1 & 2.
 */
public class Lab5Exercises {

    public static void main(String[] args) {

        // //TEST: longestRun method
        // final int DIE_TOSSES = 20;
        // Random rollGenerator = new Random();
        // int[] rollEm = new int[DIE_TOSSES];
        // for (int i = 0; i < rollEm.length; i++) {
        //     rollEm[i] = rollGenerator.nextInt(6) + 1;
        // }
        // System.out.println("longestRun test: \n\n" + longestRun(rollEm));

        // // TEST: bulgarianSolitaire
        // ArrayList<Integer> testBulSol = new ArrayList<Integer>(Arrays.asList(20,5,1,9,10)); 
        // System.out.println("\nbulgarianSolitaire test: \n");
        // bulgarianSolitaire(testBulSol);

        // TEST: Matrix class
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter number of rows in matrix: ");
        // int mRows = in.nextInt();
        // System.out.println("Enter number of cols in matrix: ");
        // int mCols = in.nextInt();

        int mRows = 4;
        int mCols = 4;

        boolean[][] test = new boolean[mRows][mCols];
        // System.out.println("Change values in matrix to true as needed. Enter any non-int value to");
        // while (in.hasNextInt()) {
        //     System.out.println("Enter index row location to change to true: ");
        //     int changeRows = in.nextInt();
        //     System.out.println("Enter index row location to change to true: ");
        //     int changeCols = in.nextInt();
        //     test[changeRows][changeCols] = true;
        // }

        test[1][1] = true;
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }

        Matrix testMatrix = new Matrix(test);
        
        System.out.println("Test .toString(): \n" + testMatrix.toString());

        // TEST: .transposeMatrix method
        boolean[][] testTrans = {
            {true,true,true,true},
            {false,true,false,true},
            {false,true,true,true},
            {true,true,false,true}
        };

        Matrix testTransMatrix = new Matrix(testTrans);
        System.out.println("Test .transposeMatrix(): \n" 
                            + testTransMatrix.transposeMatrix().toString());

        // TEST: .rotateClockwise method
        boolean[][] testRotateClockwise = {
            {true,true,true,true},
            {true,true,false,false},
            {true,true,true,true}
        };

        Matrix testRotClock = new Matrix(testRotateClockwise);
        System.out.println("Test .rotateClockwise(): \n" 
                            + testRotClock.rotateClockwise().toString());

        // TEST: .rotateCounterClockwise method
        boolean[][] testCounterClockwise = {
            {true,true,true},
            {true,true,true},
            {true,false,true},
            {true,false,true}
        };

        Matrix testRotCountClock = new Matrix(testCounterClockwise);

        System.out.println("Test: .rotateCounterClockwise: \n" 
                            + testRotCountClock.rotateCounterClockwise().toString());

        // TEST: .percentageTrue method
        boolean[][] percentTrueTest = {
            {true,true,true,true},
            {false,false,false,false},
            {false,false,false,false},
            {true,true,true,true}
        };

        Matrix testPerTrue = new Matrix(percentTrueTest);
        System.out.println("Test: .percentTrue: \n" 
                            + testPerTrue.percentageTrue());

        // TEST: isEqual method
        
    }

    /**
     * Determines the longest sequence of numbers of an array.
     * Puts them in the form xxx(yyyyyy)xxx as space separated string.
     * @param numbers int[] array of randomly generated numbers
     * @return string denoting the first longest sequence of same numbers
     */
    public static String longestRun(int[] numbers) {
        
        // Set variables to keep track of longest run and position
        int longRunCount = 0;
        int longRunValue = 0;
        int lowerLongBound = 0;
        int upperLongBound = 0;
        
        // Set variables to track current run
        int currentCount = 1;
        int currentValue = numbers[0];
        int currentLowerBound = 0;
        int currentUpperBound = 0;

        for (int i = 1; i < numbers.length; i++) {
            
            // Check if iteration is the same value as previous
            if (numbers[i] == currentValue) {
                currentCount++;
                currentUpperBound = i;

            // If different value than previous, check if current run > longest
            // If yes, update longest run values
            // If not, reset current value and count and keep going
            } else {
                if (currentCount > longRunCount) {
                    longRunCount = currentCount;
                    longRunValue = currentValue;
                    lowerLongBound = currentLowerBound;
                    upperLongBound = currentUpperBound;
                }
                currentValue = numbers[i];
                currentCount = 1;
                currentLowerBound = i;
                currentUpperBound = i;
            }
        }

        // Set variable to show longest run with parentheses and space separated
        String longRun = "";
        
        for (int i = 0; i < numbers.length; i++) {
            
            // Check if there are no long runs. If not, return original space separated array
            // If there are, add parentheses based on bounds of longest run
            if (longRunCount == 1) {
                longRun += numbers[i] + " ";
            } else {
                if (i == lowerLongBound) {
                    longRun += "(" + numbers[i] + " ";
                } else if (i == upperLongBound) {
                    longRun += numbers[i] + ") ";
                } else {
                    longRun += numbers[i] + " ";
                }
            }
        }
        return longRun;
    }

    /**
     * Takes in an ArrayList of Integers (piles) that equals 45.
     * Takes a card from each pile and adds it to a new pile at the end of the list.
     * Ending state is any sequence containing: 1,2,3,4,5,6,7,8,9.
     * Prints out state of piles at each iteration. 
     * @param cards Assortment of values that add up to 45
     */
    public static void bulgarianSolitaire(ArrayList<Integer> cards) {

        // Set complete game state
        ArrayList<Integer> complete = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));


        // Check is state is not complete
        while (!(cards.containsAll(complete))) {
            
            // Decrement each pile by 1, and create new pile with value of decrements
            int pile = 0;

            for (int i = 0; i < cards.size(); i++) {
                Integer test = cards.get(i) - 1;
                cards.set(i, test);
                pile++;
            }
            cards.add(pile);

            // Remove all 0's
            while (cards.contains(0)) {
                cards.remove(cards.indexOf(0));
            }

            // Show current state of piles
            System.out.println(cards);
        }
    }
}
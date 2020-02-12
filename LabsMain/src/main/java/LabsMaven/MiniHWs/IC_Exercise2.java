////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/10/20
//
//  IC_Exercise2
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/12/2020
//
//
//  Directions: Write a program that reads double values from user (or file) until
//              -1 is entered and then finds the second largest or second smallest
//              elements in the sequence and prints those along with their respective
//              positions (or order) in the input list. 
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.MiniHWs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IC_Exercise2 {

    public static void main(String[] args) {

        showMeTheNumbers();

    }

    /**
     * Takes in number inputs from the user. Entering -1 stops input.
     * Prints 2nd largest and 2nd smallest values and
     * the respective positions they were entered originally.
     */
    public static void showMeTheNumbers() {

        // Declare variable to track user input and ArrayList to store dynamic range of inputs
        double numberInput = 0;
        Scanner in = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<>();

        // Set condition to stop accepting user input to -1
        while (numberInput != -1) {
            System.out.print("Enter numbers, -1 to finish: ");
            numberInput = in.nextDouble();
            if (numberInput != -1) {
                numberList.add(numberInput); 
            }
        }

        // Create copy and sort inputs to easily get 2nd largest/smallest value
        ArrayList<Double> sortedNumberList = new ArrayList<>(numberList);
        Collections.sort(sortedNumberList);
        
        // Store 2nd largest/smallest in a variable for readability when printing
        Double secondLargest = sortedNumberList.get(1);
        Double secondSmallest = sortedNumberList.get(sortedNumberList.size()-2);

        // Determine original index of input values for 2nd largest/smallest
        int secondLargestPosition = 0;
        int secondSmallestPosition = 0;
        
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) == secondLargest) {
                secondLargestPosition = i;
            }
            if (numberList.get(i) == secondSmallest) {
                secondSmallestPosition = i;
            }
        }

        // Display values to the user
        System.out.println("Second Largest Number Entered: " + secondLargest
                            + ", at position " + secondLargestPosition);
        System.out.println("Second Smallest Number Entered: " + secondSmallest
                            + ", at position " + secondSmallestPosition);

    }
}
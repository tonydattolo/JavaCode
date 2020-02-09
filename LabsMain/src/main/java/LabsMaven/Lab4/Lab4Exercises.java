////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/6/20
//
//  Lab 4
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/6/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab4.pdf
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab4;

import java.util.Scanner;

public class Lab4Exercises {

    public static void main(String[] args) {
        // TEST: romanNumeralToInt method
        // System.out.println(romanNumeralToInt("X"));
        // System.out.println(romanNumeralToInt("LII"));
        // System.out.println(romanNumeralToInt("III"));
        // System.out.println(romanNumeralToInt("MMMDCCXXIV"));
        // System.out.println("=========================");


        patternMenu();

    }
    
    /**
     * Take in a roman numeral string, and convert it to 
     * Roman numeral value key:
     * I = 1
     * V = 5
     * X = 10
     * L = 50
     * C = 100
     * D = 500
     * M = 1000
     * @param roman Roman numeral string
     * @return total int value of roman number
     * Pseudocode:
     *      Assign int values to each roman numeral (without hashmap)
     *      initialize accumulator variable for total
     *      while index < len of str
     *          check values of each character in string
     *              if char at index - 1 is less than index
     *                  subtract index - 1 * 2 from total
     *                  add index val to total
     *              else
     *                  add index val to total
     */
    public static int romanNumeralToInt(String roman) {
        if (roman == "") {
            return 0;
        }

        int total = 0;
        
        for (int i = 0; i < roman.length(); i++){
            if (i == 0) {
                total += charVal(roman.charAt(i));
            } else {
                if (charVal(roman.charAt(i)) > charVal(roman.charAt(i-1))) {
                    total -= charVal(roman.charAt(i-1)) * 2;
                    total += charVal(roman.charAt(i));
                } else {
                    total += charVal(roman.charAt(i));
                }
            }
        }

        return total;
    }
    /**
     * Helper function for romanNumeralToInt method
     * Takes in a char r and returns an assigned int value
     * @param r roman numeral value
     * @return int value of roman numeral
     */
    public static int charVal(char r) {
        int value = 0;
        switch (r) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                break;
        }
        return value;
    }
    
    /**
     * Takes an input option from the user: A,B,C,E
     * E exits the menu
     * Anything other than these values will prompt user to enter again
     * 
     */
    public static void patternMenu() {
        
        char input;
        boolean playing = true;
        Scanner option = new Scanner(System.in);
        
        while (playing == true) {
            System.out.println("Welcome to the Game.\nMenu Options: A or B or C");
            System.out.print("To exit: E\nEnter Menu: ");
        
            input = option.next().charAt(0);

            switch (input) {
                case 'A':
                    System.out.print("Enter a number greater than 1: ");
                    int numA = option.nextInt();

                    break;
                case 'B':
                    System.out.print("Enter a number greater than 1: ");
                    int numB = option.nextInt();
                    shape2B(numB);
                    break;
                case 'C':
                    System.out.print("Enter a number greater than 1: ");
                    int numC = option.nextInt();
                    shape2C(numC);
                    break;
                case 'E':
                    System.out.print("Exiting game...");
                    playing = false;
                    break;
                default:
                    System.out.print("Invalid menu option, let's try again =]");
                    break;
            }
        }
    }

    /**
     * Helper function for patternMenu
     * Takes in number of rows n
     * prints pyramid pattern
     * @param n number of rows in shape
     */
    public static void shape2B(int n) {

        int leftSpace = n-1;
        int midSpace = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(" ".repeat(leftSpace) + "*");
                leftSpace--;
            } else if (i < n-1) {
                System.out.println(" ".repeat(leftSpace) + "*" + " ".repeat(midSpace) + "*");
                leftSpace--;
                midSpace+=2;
            } else {
                System.out.println("*".repeat(n*2-1));
            }
        }
    }

    /**
     * Helper function for patternMenu
     * Takes in number of rows n
     * prints diamond pattern
     * @param n number of rows in shape
     */
    public static void shape2C(int n){

        int firstHalf = n;
        int secondHalf = n - 1;
        int leftSpace = n-1;
        int midSpace = 1;

        for (int i = 0; i < firstHalf+secondHalf; i++) {
            
            if (i == 0) {
                System.out.println(" ".repeat(leftSpace) + "*");
                leftSpace--;
            }
            if (i != 0 && i < firstHalf-1) {
                System.out.println(" ".repeat(leftSpace) + "*" + " ".repeat(midSpace) + "*");
                midSpace+=2;
                leftSpace--;

            }
            if (i >= firstHalf && i < (firstHalf + secondHalf)) {
                System.out.println(" ".repeat(leftSpace) + "*" + " ".repeat(midSpace) + "*");
                midSpace-=2;
                leftSpace++;
                
            }
            if (i == (firstHalf + secondHalf - 1)) {
                System.out.println(" ".repeat(leftSpace) + "*");
            }
        }
    }


    public static boolean shuffleChecker(String input) {

        return true;
    }

    public static void drawAudiLogo() {

    }

}
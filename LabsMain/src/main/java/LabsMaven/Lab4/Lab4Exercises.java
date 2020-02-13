////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/6/20
//
//  Lab 4
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/12/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab4.pdf
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab4;

import java.util.Random;
import java.util.Scanner;

public class Lab4Exercises {

    public static void main(String[] args) {

        //JUnit tests for romanNumeralToInt and charsInStringsChecker located in Lab4Tester.java

        // SCANNER TESTS: romanNumeralToInt method 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to check romanNumeralToInt method: ");
        String testRoman = sc.next();
        System.out.println(romanNumeralToInt(testRoman) + "\n\n");

        // STATIC TESTS: romanNumeralToInt method
        // System.out.println(romanNumeralToInt("X"));
        // System.out.println(romanNumeralToInt("LII"));
        // System.out.println(romanNumeralToInt("III"));
        // System.out.println(romanNumeralToInt("MMMDCCXXIV"));
        // System.out.println("=========================");

        // TEST: patternMenu method
        // patternMenu();

        // TEST: randomNumMaxFreqRemover method
        randomNumMaxFreqRemover();

        // SCANNER TEST: charsInStringsChecker method
        System.out.println("Test for charsInStringsChecker method");
        System.out.println("Enter string 1: ");
        String testStr1 = sc.next();
        System.out.println("Enter string 2: ");
        String testStr2 = sc.next();
        System.out.println("Enter string 3: ");
        String testStr3 = sc.next();
        System.out.println(charsInStringsChecker(testStr1, testStr2, testStr3) + "\n\n");
        
        // STATIC TESTS: charsInStringsChecker method
        // System.out.println(charsInStringsChecker("abc", "Def", "dabecf"));
        // System.out.println(charsInStringsChecker("abc", "Def", "zabcde"));
        // System.out.println(charsInStringsChecker("abc", "Def", "AAAAAA"));
        // System.out.println(charsInStringsChecker("abc", "Def", "zzzzzz"));
        // System.out.println(charsInStringsChecker("abc", "Def", "abc"));

        sc.close();
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
        
        // Base case, if input is empty, return 0
        if (roman == "") {
            return 0;
        }

        // Accumulator variable for total value of roman numeral given
        int total = 0;
        
        // Add first value to total. For subsequent, check if curr value > prev value
        // If yes, subtract previous value twice, and add curr value to running total
        // If no, add current value to running total
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
     * Helper methods listed below: shape2A, shape2B, shape2C
     */
    public static void patternMenu() {
        
        char input;
        boolean playing = true;
        Scanner option = new Scanner(System.in);
        
        while (playing == true) {
            System.out.println("Select a Menu Option:\n" +
                                "A. Pattern 1\n" +
                                "B. Pattern 2\n" +
                                "C. Pattern 3\n" +
                                "E. Exit Menu");
        
            input = option.next().charAt(0);

            switch (input) {
                case 'A':
                    System.out.print("Enter a number greater than 1: ");
                    int numA = option.nextInt();
                    shape2A(numA);
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
                    System.out.print("Exiting menu...\n\n");
                    playing = false;
                    break;
                default:
                    System.out.print("Invalid menu option, let's try again =]\n");
                    break;
            }
        }
    }

    /**
     * Helper function for patternMenu, pattern A
     * Takes in number of rows n
     * prints inverted number pyramid and its mirror
     * @param n set size of pattern
     */
    public static void shape2A(int n) {

        int spaceCount = 0;

        for (int i = 1; i < n; i++) {
            System.out.print(" ".repeat(spaceCount));
            spaceCount++;
            for (int j = 1; j <= n; j++) {
                if (!(j < i)) {
                    System.out.print(" "+ j);    
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.print(" ".repeat(spaceCount));
            spaceCount--;
            for (int j = 0; j <= n; j++) {
                if (j > i) {
                    System.out.print(" "+ j);    
                }
            }
            System.out.println();
        }
    }

    /**
     * Helper function for patternMenu, pattern B
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
     * Helper function for patternMenu, pattern C
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

    /**
     * Generates 10 random numbers between 1-10 and prints them comma separated
     * Displays frequency of values
     * Deletes most frequent value
     * Displays new list of values without most frequent
     */
    public static void randomNumMaxFreqRemover() {

        String numbers = "";
        String randomNumbers = "";
        
        Random randomNums = new Random();

        // Generate 10 random numbers between 1-10
        for (int i = 0; i < 10; i++) {
            int num = randomNums.nextInt(9)+1;
            numbers += Integer.toString(num);
            if (!(i == 9)) {
                randomNumbers += Integer.toString(num) + ',';
            } else {
                randomNumbers += Integer.toString(num);
            }
            
        }
        System.out.println("Random Numbers = " + randomNumbers + "\nFrequency:");

        
        char removeMostFrequent = '0';
        int frequencyCounter = 0;

        // Count frequency values of each number
        for (int i = 1; i <= 10; i++) {
            int counter = 0;
            char num0 = Character.forDigit(i,10);
            // char num0 = (char)(i + '0');
            for (int j = 0; j < numbers.length(); j++) {
                char num1 = numbers.charAt(j);
                if (num0 == num1) {
                    counter++;
                }
            }
            
            //print out frequency of each num
            if (counter > 0) {
                System.out.println(i + " -> " + counter);
            }

            //check to see if number is most frequent
            //if it is, update new value to remove
            if (counter > frequencyCounter) {
                frequencyCounter = counter;
                removeMostFrequent = num0;
            }
        }

        // Remove most frequent number, and print comma separated string of values
        System.out.println("Deleting the Numbers with Max Frequency...");
        String randomNumbersRemoved = "";
        for (int i = 0; i < numbers.length(); i++) {
            if (!(numbers.charAt(i) == removeMostFrequent)) {
                if (i == numbers.length()-1) {
                    randomNumbersRemoved += numbers.charAt(i);
                } else {
                    randomNumbersRemoved += numbers.charAt(i) + ",";
                }
                
            }
        }
        System.out.println("Random Numbers = " + randomNumbersRemoved + "\n");
    }

    /**
     * Takes in 3 strings. The third will be compared to the concatenation of the first two.
     * Constraints are:
     * 1.) the length of 3rd string must equal length of 1st and 2nd string combined.
     * 2.) 3rd string should consist of letters only from 1st and 2nd string.
     * 
     * @param input1 First String
     * @param input2 Second String
     * @param input3 String to compare to (input1 + input2)
     * @return True if satisfies constraints, False if not
     */
    public static boolean charsInStringsChecker(String input1, String input2, String input3) {
        
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
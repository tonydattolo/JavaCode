////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  1/27/20
//
//  Lab 3
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/5/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab3.pdf
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3Exercises {

    public static void main(String[] args) {
        // TEST: my1089puzzle method
        System.out.println("TEST: my1089puzzle method");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int testPuzzle = sc.nextInt();
        System.out.println(my1089puzzle(testPuzzle));
        System.out.println("===================");

        // TEST: formatPhoneNumber method
        System.out.println("TEST: formatPhoneNumber method");
        System.out.print("Enter a phone number in format 5556667777: ");
        String telephoneNumber = sc.next();
        System.out.println(formatPhoneNumber(telephoneNumber, true));
        System.out.println(formatPhoneNumber(telephoneNumber, false));
        System.out.println("===================");

        // TEST: numbersList method
        System.out.println("TEST: numbersList method");
        System.out.println(numbersList());
        System.out.println("===================");

        // TEST: grade method
        System.out.println("TEST: grade method");
        System.out.print("Please enter a letter grade between A-F: ");
        // Scanner sc2 = new Scanner(System.in);
        String gradeInput = sc.next();
        char gradeLetter = gradeInput.charAt(0);
        System.out.println(grade(gradeLetter));

        // TEST: intToHex method
        System.out.println("TEST: intToHex method");
        System.out.print("Enter a number: ");
        int hexInput = sc.nextInt();
        System.out.println(intToHex(hexInput));
        
        // Not sure if you want scanner for this one, but here are hard coded values if not.
        // System.out.println(intToHex(543));
        // System.out.println(intToHex(123));
        // System.out.println(intToHex(17));
        // System.out.println(intToHex(16));
        // System.out.println(intToHex(15));
        System.out.println("===================");

        // // TEST: Question 3, part B
        // // i.
        // // double t = 9.0;
        // // while (Math.abs(t-9.0/t) > .001) {
        // //     t = (9.0/t + t) / 2.0;
        // // }
        // // System.out.println(t);
        // // ii.
        // // System.out.printf("%03d",7);
        // // // iii.
        // // String s = "Bye Bye Bye";
        // // s = s.replace('y', 'e');
        // // System.out.println(s);

    }
    /**
     * Discard all but last 3 digits
     * reverse the digits
     * subtract the original input from the reversed (discarding the minus sign)
     * reverse the digits of the difference
     * add the difference and reversed difference
     * Example:
     *      Input: 371
     *      Reversed: 173
     *      Difference: 198
     *      Reversed: 891
     *      Sum: 1089
     * 
     * @param myInput integer from user
     * @return the sum
     */
    public static int my1089puzzle(int myInput) {
        
        // Account for negative numbers input edge case
        int userInput;
        if (myInput >= 0){
            userInput = myInput;
        } else {
            userInput = myInput * -1;
        }
        
        // Get last 3 digits. Precede numbers smaller than 3 digits with zeroes
        String last3Digits = Integer.toString(userInput);
        // for (int i = 0; i < last3Digits.length(); i++){
        //     System.out.println("index: " + i);
        //     userInput
        // }
        if (last3Digits.length() > 3){
            last3Digits = last3Digits.substring(last3Digits.length()-3, last3Digits.length());
        } else {
            while (last3Digits.length() < 3) {
                last3Digits = "0" + last3Digits;
            }
        }

        // Reverse last 3 digits
        String reversedUserInput = "";
        for (int i = last3Digits.length()-1; i >= 0; i--) {
            reversedUserInput += last3Digits.charAt(i);
        }

        // Take difference of last 3 digits and its reverse, accounting for negative edge cases
        int difference = Integer.parseInt(last3Digits) - Integer.parseInt(reversedUserInput);
        if (difference < 0) {
            difference *= -1;
        }
        // Account for reverse cases that lead to a zero as first or second number.
        // Example: 300 becomes 3 and not 003
        String differenceString = Integer.toString(difference);
        if (differenceString.length() < 3) {
            while (differenceString.length() < 3) {
                differenceString = "0" + differenceString;
            }
        }
        // Reverse the difference
        String reversedDifference = "";
        for (int i = differenceString.length()-1; i >= 0; i--) {
            reversedDifference += differenceString.charAt(i);
        }
        // Convert reverse difference to an integer, and sum with difference
        int newReversedDifference = Integer.parseInt(reversedDifference);
        int sum = difference + newReversedDifference;
        
        return sum;

    }

    /**
     * Takes in a telephone number as a string
     * Formats it based on boolean value parameter given from user
     * @param myNumber Reads telephone number
     * @param option Determines format of number.
     *      true = (xxx) xxx-xxxx
     *      false = xxx-xxx-xxxx
     * @return formatted telephone number
     * Pseudocode:
     *      Initialize strings
     *      Check if option is true
     *          if yes, apply formatting (xxx) xxx-xxxx
     *      Check if option is false
     *          if yes, apply formatting xxx-xxx-xxxx
     *      return formatted String
     */
    public static String formatPhoneNumber(String myNumber, boolean option){
        String formattedNumber = "";
        String areaCode = "";
        String middleDigits = "";
        String endDigits = "";

        if (option == true) {
            areaCode = "(" + myNumber.substring(0, 3) + ")";
            middleDigits = myNumber.substring(3, 6);
            endDigits = myNumber.substring(6, myNumber.length());
            
            formattedNumber = areaCode + " " + middleDigits + "-" + endDigits;
        } else {
            areaCode = myNumber.substring(0, 3);
            middleDigits = myNumber.substring(3, 6);
            endDigits = myNumber.substring(6, myNumber.length());
            
            formattedNumber = areaCode + "-" + middleDigits + "-" + endDigits;
        }
        return formattedNumber; 
    }

    /**
     * Take an int from the user between 5-19
     * Store values
     * If outside the range 5-19, prompt for another number
     * If already entered previously, do not include
     * anything other than an int exits method
     * @return string of comma separated values
     */
    public static String numbersList() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> commaSepNumbers = new ArrayList<>();
        //HashSet would be better. HashSet.contains has constant time complexity
        System.out.println("Please enter a number between 5-19: ");
        while (in.hasNextInt()) {
            System.out.println("Please enter a number between 5-19: ");
            int userInput = in.nextInt();
            
            // Check for additional constraints
            if (!(userInput < 5 || userInput > 19) && 
                !(commaSepNumbers.contains(Integer.toString(userInput)))) {
                commaSepNumbers.add(Integer.toString(userInput));
            }
        }

            //DOWHILE version
            // do {
            // System.out.println("Please enter a number between 5-19: ");
            // int userInput = in.nextInt();
            
            // // Check for additional constraints
            // if (!(userInput < 5 || userInput > 19) && 
            //     !(commaSepNumbers.contains(Integer.toString(userInput)))) {
            //     commaSepNumbers.add(Integer.toString(userInput));
            // }

            // } while (in.hasNextInt());
            // !A and !B == !(A or B)
            // if (!((userInput < 5 || userInput > 19) || 
            //     (commaSepNumbers.contains(Integer.toString(userInput))))) {
            //     commaSepNumbers.add(Integer.toString(userInput));
            // }

            // if (userInput < 5 || userInput > 19) {
            //     continue;
            // } else if (commaSepNumbers.contains(Integer.toString(userInput))) {
            //     continue;
            // } else {
            //     commaSepNumbers.add(Integer.toString(userInput));
            // }
        
        // in.close();

        // Convert ArrayList to string and add commas
        String totalNumbers = "";
        for (int i = 0; i < commaSepNumbers.size(); i++) {
            if (i == 0){
                totalNumbers += commaSepNumbers.get(i);
            } else {
                totalNumbers += "," + commaSepNumbers.get(i);
            }
        }
        
        return totalNumbers;
    }

    /**
     * Takes an input as char between A-F
     * Determines your number grade range based on letter grade
     * @param letterGrade char between A-F
     * @return String with message saying your grade value range
     */
    public static String grade(char letterGrade) {
        String gradeReport = "";
        if (letterGrade == 'A') {
            gradeReport = "Your grade is between a 93.0 and 100";
        } else if (letterGrade == 'B') {
            gradeReport = "Your grade is between a 83.0 and 92.9";
        } else if (letterGrade == 'C') {
            gradeReport = "Your grade is between a 73.0 and 82.9";
        } else if (letterGrade == 'D') {
            gradeReport = "Your grade is between a 63.0 and 72.9";
        } else if (letterGrade == 'F') {
            gradeReport = "Your grade is less than a 63.0";
        }

        // switch (letterGrade) {
        //     case 'A': gradeReport = "Your grade is between a 93.0 and 100";
        //         break;
        //     case 'B': gradeReport = "Your grade is between a 83.0 and 92.9";
        //         break;
        //     case 'C': gradeReport = "Your grade is between a 73.0 and 82.9";
        //         break;
        //     case 'D': gradeReport = "Your grade is between a 63.0 and 72.9";
        //         break;
        //     case 'F': gradeReport = "Your grade is less than a 63.0";
        //         break;
        //     default: gradeReport = "Invalid input: please enter a letter between A-F";
        //         break;
        // }

        return gradeReport;
    }
    /**
     * Converts an integer value in base 10 to its hexidecimal value in base 16
     * Each hexidecimal value is preceded by 0x notation
     * Numbers <
     * @param n int value (base 10)
     * @return hexidecimal representation of int value n
     */
    public static String intToHex(int n) {
        String hexidecimal = "0x";
        if (n < 16) {
            hexidecimal += ("0" + String.format("%H", n));
        } else {
            hexidecimal += (String.format("%H", n));
        }
        return hexidecimal;
    }

}

// Question 3:
// Part a.
//      i.      boolean, false
//      ii.     Integer, 65
//      iii.    double, 15.1
//      iv.     String, 524
// Part b.
//      i.      .001, incorrect. it was 3.00009155413138.
//      ii.     007, correct, it was 007. 03d means place 0's before placing the int in the 3rd position
//      iii.    Bee Bee Bee,  correct. Replacing every char y with char e
// 
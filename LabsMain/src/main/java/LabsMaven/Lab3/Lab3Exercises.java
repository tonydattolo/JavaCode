/**
 * Lab3Exercises
 */

package LabsMaven.Lab3;

import java.io.SequenceInputStream;

public class Lab3Exercises {

    public static void main(String[] args) {
        // System.out.println(my1089puzzle(371));
        // System.out.println(my1089puzzle(2));
        // System.out.println(my1089puzzle(5236435));
        // System.out.println(my1089puzzle(-2));
        // System.out.println(my1089puzzle(-23523));


        System.out.println(22/10);
        System.out.println(22.0/7);
        System.out.println(22/7.0);

    }
    /**
     * Discard all but last 3 digits
     * reverse the digits
     * subtract the original input from the reversed (discarding
     * and minus sign)
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
        System.out.println("===========");
        int userInput;
        if (myInput >= 0){
            userInput = myInput;
        } else {
            userInput = myInput * -1;
        }
        System.out.println(userInput);//1

        String last3Digits = Integer.toString(userInput);
        System.out.println("last3: " + last3Digits);
        System.out.println("len of last 3: " + last3Digits.length());
        for (int i = 0; i < last3Digits.length(); i++){
            System.out.println("index: " + i);
        }
        if (last3Digits.length() > 3){
            last3Digits = last3Digits.substring(last3Digits.length()-3, last3Digits.length());
        } else {
            while (last3Digits.length() < 3) {
                last3Digits = "0" + last3Digits;
            }
        }
        System.out.println("last3 "+ last3Digits);//2
        String reversedUserInput = "";
        for (int i = last3Digits.length()-1; i >= 0; i--) {
            reversedUserInput += last3Digits.charAt(i);
        }
        System.out.println("reversedUserInput" + reversedUserInput);//3
        int difference = Integer.parseInt(last3Digits) - Integer.parseInt(reversedUserInput);
        if (difference < 0) {
            difference *= -1;
        }
        System.out.println("difference: "+difference);//4
        String tmp = Integer.toString(difference);
        String reversedDifference = "";
        for (int i = tmp.length()-1; i >= 0; i--) {
            reversedDifference += tmp.charAt(i);
        }
        if (reversedDifference.length() < 3) {
            last3Digits = "0" + last3Digits;
        }
        System.out.println("reversedDifference"+reversedDifference);//5
        int newReversedDifference = Integer.parseInt(reversedDifference);
        int sum = difference + newReversedDifference;
        System.out.println("Sum: "+sum);//6
        return sum;

    }
}
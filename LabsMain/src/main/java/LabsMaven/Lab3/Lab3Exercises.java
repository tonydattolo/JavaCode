/**
 * Lab3Exercises
 */

package LabsMaven.Lab3;

/**
 * 
 */
public class Lab3Exercises {

    public static void main(String[] args) {
        my1089puzzle(371);
        
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
        
        String last3Digits = Integer.toString(myInput);
        if (last3Digits.length() > 3){
            last3Digits = last3Digits.substring(last3Digits.length()-4, last3Digits.length()-1);
        }
        System.out.println(last3Digits);
        System.out.println(last3Digits.length());

        String reversedUserInput = "";
        for (int i = last3Digits.length()-1; i >= 0; i--) {
            reversedUserInput += last3Digits.charAt(i);
        }
        System.out.println(reversedUserInput);
        int difference;
        int reversedDifference;
        int sum;


        
        
        return 1;

    }
}
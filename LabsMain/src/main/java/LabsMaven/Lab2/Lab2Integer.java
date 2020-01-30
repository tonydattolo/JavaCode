/**
 * Lab2Integer class for Lab2 Assignment
 * Pseudocode:
 *      Create class
 *      Create main method
 *          call method that contained wanted functionality 
*       Create class to handle functionality
 *          define string of values wanted
 *          iterate over string values
 *              print out unicode value of each char within string
 */

package LabsMaven.Lab2;

public class Lab2Integer {

    public static void main(String[] args) {
        Lab2Integer.printIntRep();
    }

    // INPUT: Takes char
    // OUT: returns int value of char
    public static int getIntValueOfChar(char c) {
        return (int) c;
    }

    // Static print method to test functionality
    public static void printIntRep() {
        String givenVals = "ABCZXabcyu092$*>-|\\ \t";
        for (int i = 0; i < givenVals.length(); i++) {
            System.out.printf("The char \'%s\' has the integer value %d\n",givenVals.charAt(i),
                                                                (int) givenVals.charAt(i));
        }
    
        
    }
}
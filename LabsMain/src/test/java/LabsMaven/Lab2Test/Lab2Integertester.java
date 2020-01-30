/**
 * Lab2Integertester class.
 * JUnit testing for Lab2Integer.java
 */

package LabsMaven.Lab2Test;

import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.*;
import static LabsMaven.Lab2.Lab2Integer.getIntValueOfChar;

public class Lab2Integertester {

    @Test
    public void testLab2Integer() {
        Scanner test = new Scanner(System.in);
        System.out.print("Enter test char: ");
        String givenChar = test.next(); test.close();
        assertEquals(givenChar.chars(), getIntValueOfChar(givenChar.charAt(0)));
        
        // char test0 = 'A';
        // assertEquals((int) test0, getIntValueOfChar(test0));
    }
}
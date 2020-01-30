/**
 * Lab2Integertester class.
 * JUnit testing for Lab2Integer.java
 */

package LabsMaven.Lab2Test;

import static org.junit.Assert.*;
// import java.util.Scanner;
import org.junit.*;
import static LabsMaven.Lab2.Lab2Integer.getIntValueOfChar;

public class Lab2Integertester {

    @Test
    public void testLab2Integer() {
        
        String givenVals = "ABCZXabcyu092$*>-|\\ \t";
        for (int i = 0; i < givenVals.length(); i++) {
            assertEquals((int) givenVals.charAt(i), getIntValueOfChar(givenVals.charAt(i)));

        }
    }
}
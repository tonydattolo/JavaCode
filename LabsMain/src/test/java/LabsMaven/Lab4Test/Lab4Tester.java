/**
 * JUnit Tester class for Lab4Exercises.java
 */

package LabsMaven.Lab4Test;

import LabsMaven.Lab4.Lab4Exercises;
import static org.junit.Assert.*;
import org.junit.*;

public class Lab4Tester {

    @Test
    public void romanToIntTest() {
        assertEquals(3724, Lab4Exercises.romanNumeralToInt("MMMDCCXXIV"));
        assertEquals(1978, Lab4Exercises.romanNumeralToInt("MCMLXXVIII"));
    }

    @Test
    public void charsInStringsCheckerTest() {
        assertEquals(true, Lab4Exercises.charsInStringsChecker("abc", "Def", "dabecf"));
        assertEquals(false, Lab4Exercises.charsInStringsChecker("abc", "Def", "zabcde"));
        assertEquals(true, Lab4Exercises.charsInStringsChecker("abc", "Def", "AAAAAA"));
        assertEquals(false, Lab4Exercises.charsInStringsChecker("abc", "Def", "zzzzzz"));
        assertEquals(false, Lab4Exercises.charsInStringsChecker("abc", "Def", "abcDe"));
    }
    
}
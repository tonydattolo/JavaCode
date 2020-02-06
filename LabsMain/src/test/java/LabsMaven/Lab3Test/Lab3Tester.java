/**
 * Lab3Tester
 * JUnit Tests for Lab3 Classes
 */

package LabsMaven.Lab3Test;

import LabsMaven.Lab3.Lab3Exercises;
import static org.junit.Assert.*;
import org.junit.*;

public class Lab3Tester {

    @Test
    public void testPuzzle() {
        assertEquals(1089, Lab3Exercises.my1089puzzle(371));
        assertEquals(1089, Lab3Exercises.my1089puzzle(2));
        assertEquals(1089, Lab3Exercises.my1089puzzle(543534));
        assertEquals(1089, Lab3Exercises.my1089puzzle(-27123));
        assertEquals(1089, Lab3Exercises.my1089puzzle(-5));
    }

    @Test
    public void testFormatNumber() {
        assertEquals("(555) 666-7777",Lab3Exercises.formatPhoneNumber("5556667777", true));
        assertEquals("555-666-7777",Lab3Exercises.formatPhoneNumber("5556667777", false));
    }

    @Test
    public void testGrade() {
        assertEquals("Your grade is between a 93.0 and 100", Lab3Exercises.grade('A'));
        assertEquals("Your grade is less than 63.0", Lab3Exercises.grade('F'));
    }

    @Test
    public void testIntToHex() {
        assertEquals("0x01", Lab3Exercises.intToHex(1));
        assertEquals("0x0A", Lab3Exercises.intToHex(10));
        assertEquals("0x162", Lab3Exercises.intToHex(354));
        assertEquals("0x395", Lab3Exercises.intToHex(917));
    }
}
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
}
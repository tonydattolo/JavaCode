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

    public void shuffleCheckerTest() {
        // assertEquals(expected, actual);
    }
    
}
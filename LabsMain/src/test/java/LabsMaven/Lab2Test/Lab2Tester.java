// package LabsMaven.Lab2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import LabsMaven.Lab2.Lab2Exercises;


/**
 * Lab2Tester
 */
public class Lab2Tester {

    // public static void main(String[] args) {

    //     final double testCase = 2.0;


    //     Lab2Exercises.areaOfSquare(sideLength);
    //     Lab2Exercises.lineFunction(x1, y1, x2, y2);
    //     Lab2Exercises.perimeterOfSquare(sideLength);
    //     Lab2Exercises.volumeOfCube(sideLength);
    //     Lab2Exercises.printMeasurements(value);
    //     Lab2Exercises.addCommas(num);
    // }

    // Test case for areaOfSquare method
    @Test
    public void areaTest() {
        final int areaOf2 = 2*2;
        assertEquals(areaOf2, Lab2Exercises.areaOfSquare(2));
    }
    // Test case for perimeterOfSquare method
    @Test
    public void lineTest() {
        final int perimeterOf2 = 2*4;
        assertEquals(perimeterOf2, Lab2Exercises.perimeterOfSquare(2)); 
    }

    //Test case for volumeOfCube method
    @Test
    public void volumeTest() {
        final double volumeOf2 = Math.pow(2, 3);
        assertEquals(volumeOf2, Lab2Exercises.volumeOfCube(2),.1);
        
    } 
    
    //Test case for printMeasurements method
    @Test
    public void printMeasureTest() {
        if Lab2Exercises.printMeasurements(2)
        
        assertTrue(true);
    }
}
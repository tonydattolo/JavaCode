////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/13/20
//
//  Lab 5
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/19/2020
//
//
//  Directions: JUnit Testing for Lab5
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab5Test;

import LabsMaven.Lab5.Lab5Exercises;
import LabsMaven.Lab5.Matrix;
import static org.junit.Assert.*;
import org.junit.*;

public class Lab5Tester {

    @Test
    public void longRunTest() {

        int[] longRunTest0 = {1,1,1,2,2,3,2,5,6,4,1,2,3,1,2,3,1,2,3,1};
        int[] longRunTest1 = {5,6,4,2,2,2,2,3,2,3,1,2,3,1,2,3,1,2,3,1};
        int[] longRunTest2 = {1,5,2,4,6,3,2,5,1,2,1,2,3,1,2,3,1,2,3,1};

        assertEquals("(1 1 1) 2 2 3 2 5 6 4 1 2 3 1 2 3 1 2 3 1 ", Lab5Exercises.longestRun(longRunTest0));
        assertEquals("5 6 4 (2 2 2 2) 3 2 3 1 2 3 1 2 3 1 2 3 1 ", Lab5Exercises.longestRun(longRunTest1));
        assertEquals("1 5 2 4 6 3 2 5 1 2 1 2 3 1 2 3 1 2 3 1 ", Lab5Exercises.longestRun(longRunTest2));
    }

    @Test
    public void toStringTest() {

        boolean[][] testToString = {
            {true,true,true,true},
            {false,true,false,true},
            {false,true,true,true},
            {true,true,false,true}
        };
        Matrix test0 = new Matrix(testToString);
        assertEquals("[1, 1, 1, 1\n 0, 1, 0, 1\n 0, 1, 1, 1\n 1, 1, 0, 1]", test0.toString());
    }

    @Test
    public void transposeTest() {

        boolean[][] testTrans = {
            {true,true,true,true},
            {false,true,false,true},
            {false,true,true,true},
            {true,true,false,true}
        };
        Matrix test1 = new Matrix(testTrans);
        assertEquals("[1, 0, 0, 1\n 1, 1, 1, 1\n 1, 0, 1, 0\n 1, 1, 1, 1]", test1.transposeMatrix().toString());
    }

    @Test
    public void clockwiseTest() {

        boolean[][] testRotateClockwise = {
            {true,true,true,true},
            {true,true,false,false},
            {true,true,true,true}
        };
        Matrix test2 = new Matrix(testRotateClockwise);
        assertEquals("[1, 1, 1\n 1, 1, 1\n 1, 0, 1\n 1, 0, 1]",
                        test2.rotateClockwise().toString());

    }

    @Test
    public void CounterClockwiseTest() {

        boolean[][] testCounterClockwise = {
            {true,true,true},
            {true,true,true},
            {true,false,true},
            {true,false,true}
        };

        Matrix test3 = new Matrix(testCounterClockwise);
        assertEquals("[1, 1, 1, 1\n 1, 1, 0, 0\n 1, 1, 1, 1]",
                        test3.rotateCounterClockwise().toString());

    }

    @Test
    public void percentTrueTest() {
    
        boolean[][] percentTrueTest0 = {
            {true,true,true,true},
            {false,false,false,false},
            {false,false,false,false},
            {true,true,true,true}
        };
        boolean[][] percentTrueTest1 = {
            {true,true,true,true},
            {true,true,true,true},
            {false,false,false,false},
            {true,true,true,true}
        };

        Matrix test4 = new Matrix(percentTrueTest0);
        Matrix test5 = new Matrix(percentTrueTest1);
        assertEquals("50%", test4.percentageTrue());
        assertEquals("75%", test5.percentageTrue());
    
    }

    @Test
    public void isEqualTest() {

        boolean[][] testEqualA = {
            {true,true,true,true},
            {true,true,false,false},
            {true,true,true,true}
        };
        boolean[][] testEqualB = {
            {true,true,true,true},
            {true,true,false,false},
            {true,true,true,true}
        };
        boolean[][] testEqualC = {
            {false,true,true,true},
            {true,true,false,false},
            {false,true,true,true}
        };
        boolean[][] testEqualD = {
            {true,true,true},
            {true,true,false},
            {true,true,true},
            {true,true,true}
        };

        Matrix testEqual0 = new Matrix(testEqualA);
        Matrix testEqual1 = new Matrix(testEqualB);
        Matrix testEqual2 = new Matrix(testEqualC);
        Matrix testEqual3 = new Matrix(testEqualD);

        assertEquals(true, testEqual0.isEqual(testEqual1));
        assertEquals(false, testEqual0.isEqual(testEqual2));
        assertEquals(false, testEqual0.isEqual(testEqual3));



    }
    
}
////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/13/20
//
//  Lab 5
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/15/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab5.pdf
//              Problems 3 located here. Problem 1 & 2 located in Lab5Exercises.java
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab5;

import java.util.Arrays;

/**
 * Contains functionality for Matrix class as outlined in Lab5.pdf
 */
public class Matrix {

    private boolean[][] matrix;
    private final int NUMROW;
    private final int NUMCOL;


    public Matrix(boolean[][] m) {
        NUMCOL = m;
        NUMROW = m;
    }

    @Override
    public String toString() {
        return "Matrix [matrix=" + Arrays.toString(matrix) + "]";
    }
    
    
}
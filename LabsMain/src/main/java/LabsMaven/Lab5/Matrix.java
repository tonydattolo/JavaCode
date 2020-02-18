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
        this.matrix = m;
        this.NUMROW = m.length;
        this.NUMCOL = m[0].length;
        
    }

    @Override
    public String toString() {

        // Change boolean values to 1s and 0s
        int[][] onesAndZeros = new int[this.NUMROW][this.NUMCOL];
        
        for (int i = 0; i < this.NUMROW; i ++) {
            for (int j = 0; j < this.NUMCOL; j++) {
                if (matrix[i][j] == true) {
                    onesAndZeros[i][j] = 1;
                } else {
                    onesAndZeros[i][j] = 0;
                }
            }
        }

        String matrixPrinter = "[";

        for (int i = 0; i < this.NUMROW; i ++) {
            for (int j = 0; j < this.NUMCOL; j++) {
                if (j == this.NUMCOL - 1) {
                    matrixPrinter += onesAndZeros[i][j];
                } else {
                    matrixPrinter += onesAndZeros[i][j] + ", ";    
                }
                
            }
            matrixPrinter += "\n";
        }
        return matrixPrinter;
        // return "Matrix [matrix=" + Arrays.toString(matrix) + "]";
    }
    
    public Matrix transposeMatrix() {

    }
    
    public boolean isSquareMatrix() {

    }

    public Matrix rotateClockwise() {

    }

    public Matrix rotateCounterClockwise() {

    }

    public String percentageTrue() {

    }

    public boolean isEqual(Matrix m) {

    }




}
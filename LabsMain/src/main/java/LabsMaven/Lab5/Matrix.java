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


    /**
     * Constructor method for Matrix class
     * @param m 2D boolean[][] array
     */
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
            if (i != 0) {
                matrixPrinter += " ";
            }
            for (int j = 0; j < this.NUMCOL; j++) {
                if (j == this.NUMCOL - 1) {
                    matrixPrinter += onesAndZeros[i][j];
                } else {
                    matrixPrinter += onesAndZeros[i][j] + ", ";    
                }
                
            }
            if (i != this.NUMROW - 1) {
                matrixPrinter += "\n";    
            }
            
        }
        matrixPrinter += "]";
        return matrixPrinter;
    }
    
    /**
     * Transpose operation of a matrix. Rows and columns are swapped
     * in a transposed matrix. Initialized by class constructor method.
     * @return transposed matrix
     */
    public Matrix transposeMatrix() {
        
        // Initialize new 2D arr using swapped cols/rows
        boolean[][] test = new boolean[this.NUMCOL][this.NUMROW];

        // Swap col and row vals with original
        for (int i = 0; i < this.NUMCOL; i++) {
            for (int j = 0; j < this.NUMROW; j++) {
                test[i][j] = this.matrix[j][i];
            }
        }

        // Convert to matrix class to use operations
        Matrix transposedMatrix = new Matrix(test);

        return transposedMatrix;

    }
    
    /**
     * Checks to see if matrix is square by comparing number of rows to columns.
     * Square matrix is defined as having equal rows and columns.
     * @return true for square matrix, false for non-square matrix
     */
    public boolean isSquareMatrix() {

        // Check if number of columns matches number of rows
        if (this.NUMCOL == this.NUMROW) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Takes a matrix and rotates it 90 degrees.
     * Rotated matrix will have the i'th column of every row be the i'th row of thhe new matrix 
     * As such, new matrix will be initialized with original number of cols and rows swapped
     * @return matrix rotated counter clockwise -90 degrees
     */
    public Matrix rotateClockwise() {

        boolean[][] rotate = new boolean[this.NUMCOL][this.NUMROW];

        for (int i = 0; i < this.NUMCOL; i++) {
            for (int j = 0; j < this.NUMROW; j++) {
                rotate[i][j] = matrix[j][i];
            }
        }

        Matrix rotatedClockwise = new Matrix(rotate);
        
        return rotatedClockwise;

    }

    public Matrix rotateCounterClockwise() {
        boolean[][] rotate = new boolean[this.NUMCOL][this.NUMROW];
        
        for (int i = this.NUMCOL - 1; i >= 0; i--) {
            for (int j = this.NUMROW - 1; j >= 0; j--) {
                rotate[i][j] = matrix[j][i];
            }
        }

        Matrix rotatedCounterClockwise = new Matrix(rotate);
        
        return rotatedCounterClockwise;
    }

    public String percentageTrue() {

        double totalVals = 0;
        double totalTrue = 0;

        for (int i = 0; i < this.NUMROW; i++) {
            for (int j = 0; j < this.NUMCOL; j++) {
                totalVals++;
                if (matrix[i][j] == true) {
                    totalTrue++;
                }
            }
        }
        // Calculate percentage value
        double test = totalTrue / totalVals;

        // Convert from decimal to integer, then to string with percentage
        test *= 100;
        int test3 = (int) test;
        String perTrueString = test3 +"%";

        return perTrueString;

    }

    /**
     * Checks to see if another matrix passed as an arg is equal to this matrix.
     * Conditions for equality are: same number of columns, same number of rows,
     * same value are each index location within the 2D matrix.
     * @param m Matrix to be compared to original matrix
     * @return true if equal, false if not
     */
    public boolean isEqual(Matrix m) {

        // Check if number of rows and columns match for matrix compared
        if (this.NUMROW != m.NUMROW) {
            return false;
        } 
        if (this.NUMCOL != m.NUMCOL) {
            return false;
        }

        // Check if values at each index in the matrix match
        for (int i = 0; i < this.NUMROW; i++) {
            for (int j = 0; j < this.NUMCOL; j++) {
                if (matrix[i][j] != m.matrix[i][j]) {
                    return false;
                }
            }
        }
        
        return true;

    }




}
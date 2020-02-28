////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/21/20
//
//  Lab 6
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/27/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab6.pdf
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab6;

/**
 * GameOfLifeTester class for GameOfLife.java functionality.
 * Uses Still Life and Oscillator examples from Lab6.pdf
 */
public class GameOfLifeTester {

    public static void main(String[] args) {
        
        // Still Life board initializations
        boolean[][] stillLife1 = {
            {false,false,false,false},
            {false,true,true,false},
            {false,true,true,false},
            {false,false,false,false}
        };
        boolean[][] stillLife2 = {
            {false,false,false,false,false},
            {false,true,true,false,false},
            {false,true,false,true,false},
            {false,false,true,false,false},
            {false,false,false,false,false}
        };
        boolean[][] stillLife3 = {
            {false,false,false,false,false,false},
            {false,false,true,true,false,false},
            {false,true,false,false,true,false},
            {false,false,true,false,true,false},
            {false,false,false,true,false,false},
            {false,false,false,false,false,false}
        };
        boolean[][] stillLife4 = {
            {false,false,false,false,false,false},
            {false,false,true,true,false,false},
            {false,true,false,false,true,false},
            {false,false,true,true,false,false},
            {false,false,false,false,false,false}
        };

        //Oscillator board initializations
        boolean[][] oscillator1 = {
            {false,false,false,false,false},
            {false,false,false,false,false},
            {false,true,true,true,false},
            {false,false,false,false,false},
            {false,false,false,false,false}
        };
        boolean[][] oscillator2 = {
            {false,false,false,false,false,false},
            {false,true,true,false,false,false},
            {false,true,false,false,false,false},
            {false,false,false,false,true,false},
            {false,false,false,true,true,false},
            {false,false,false,false,false,false}
        };
        boolean[][] oscillator3 = {
            {false,false,false,false,false,false},
            {false,true,true,false,false,false},
            {false,true,false,false,false,false},
            {false,false,false,false,true,false},
            {false,false,false,true,true,false},
            {false,false,false,false,false,false}
        };

        // Still Life testing
        System.out.println("Still Life 1 test");
        GameOfLife g1 = new GameOfLife(stillLife1);
        g1.grow(100, 20);

        System.out.println("Still Life 2 test");
        GameOfLife g2 = new GameOfLife(stillLife2);
        g2.grow(100, 20);

        System.out.println("Still Life 3 test");
        GameOfLife g3 = new GameOfLife(stillLife3);
        g3.grow(100, 20);

        System.out.println("Still Life 4 test");
        GameOfLife g4 = new GameOfLife(stillLife4);
        g4.grow(100, 20);

        // Oscillator testing
        System.out.println("Oscillator 1 test");
        GameOfLife g5 = new GameOfLife(oscillator1);
        g5.grow(20, 1);

        System.out.println("Oscillator 2 test");
        GameOfLife g6 = new GameOfLife(oscillator2);
        g6.grow(20, 1);

        System.out.println("Oscillator 3 test");
        GameOfLife g7 = new GameOfLife(oscillator3);
        g7.grow(20, 1);
    }
}
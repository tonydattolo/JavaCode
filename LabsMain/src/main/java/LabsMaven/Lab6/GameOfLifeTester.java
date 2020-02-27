////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/21/20
//
//  Lab 6
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/21/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab6.pdf
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab6;

/**
 * GameOfLifeTester class for GameOfLife.java functionality
 */
public class GameOfLifeTester {

    public static void main(String[] args) {
        boolean[][] test0 = {
            {false,false,false,false},
            {false,true,true,false},
            {false,true,true,false},
            {false,false,false,false},
        };

        GameOfLife g1 = new GameOfLife(test0);
        System.out.println(g1.toString());
        g1.grow(100, 5);
    }
}
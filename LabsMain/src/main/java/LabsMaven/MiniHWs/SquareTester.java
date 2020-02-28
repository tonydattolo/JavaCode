////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/27/20
//
//  IC_Exercise2
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/27/2020
//
//
//  Directions: Test Square class
// 
////////////////////////////////////////////////////////////////////////////////////

package LabsMaven.MiniHWs;

import java.util.ArrayList;
import java.util.Random;

/**
 * SquareTester class to test functionality of Square class
 */
public class SquareTester {

    public static void main(String[] args) {

        // ArrayList of Squares
        ArrayList<Square> testSquare = new ArrayList<Square>();
        
        Random rn = new Random();

        // Generate 5 new squares, each with a random x,y coordinate value and random side length
        for (int i = 0; i < 5; i++) {
            Square addOne = new Square(rn.nextInt(10), rn.nextInt(10), rn.nextInt(25));
            testSquare.add(addOne);
        }

        // Print the center point, side length, and area of each Square
        for (int i = 0; i < testSquare.size(); i++) {
            System.out.println(testSquare.get(i).toString());
        }

    }
}
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
//  Directions: Create subclass Square that extends the Rectangle class
// 
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.MiniHWs;

import java.awt.Point;
import java.awt.Rectangle;

/**
 * Square class that extends the superclass Rectangle
 */
public class Square extends Rectangle {

    private int x;
    private int y;
    private int sideLength;


    /**
     * Constructor method for Square class.
     * @param x x coordniate value
     * @param y y coordinate value
     * @param sideLength length of square sides
     */
    public Square(int x, int y, int sideLength) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
        super.setLocation(x, y);
    }

    /**
     * Computes and returns the area of the square.
     * @return the area of the square
     */
    public int getArea() {
        int area;
        area = this.sideLength * this.sideLength;
        
        return area;
    }

    /**
     * Generates a string depicting the Center, Side Length, and Area of the Square
     * @return center, length, area
     */
    @Override
    public String toString() {
        String centerLengthArea = "[Center: " + getLocation() + ", Side Length: " + this.sideLength
                                    + ", Area: " + getArea() + "]";
        return centerLengthArea;
    }

    @Override
    public Point getLocation() {
        // TODO Auto-generated method stub
        return super.getLocation();
        
    }

    @Override
    public void setLocation(int x, int y) {
        // TODO Auto-generated method stub
        super.setLocation(x, y);
    }
    

}
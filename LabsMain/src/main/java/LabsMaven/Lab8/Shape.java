////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  3/4/20
//
//  Lab 8
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  3/6/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab8.pdf
//               
////////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab8;

import java.awt.*;

/**
 * Shape class for use in subclasses as described in Lab8.pdf
 */
abstract class Shape {

    private Color fillColor;
    private Color borderColor;
    private Boolean isFilled;
    private Point location;

    // The three constructors initialize the instance fileds
    public Shape(Color fillColor, int x, int y) {

    }

    //set borderColor to Black since not provided
    public Shape(Color fillColor, int x, int y) {

    }

    // set fillColor to white and border color to black
    public Shape(int x, int y) {

    }

    // will fill the shape with some random image. You can select any image for larger shapes
    public void setFillColor(Color c) {

    }

    public Color getFillColor() {

    }

    public void setBorderColor(Color c) {

    }

    public Color getBorderColor() {

    }

    public void setLocation(Point pt) {

    }

    public Point getLocation() {

    }

    // Note: subclasses of Shape do not inherent private members, so we need methods the subclasses
    // can use to get the x and y values from the private Point instance field
    public int getX() {

    }

    public void setX(int x) {

    }

    public int getY() {

    }

    public int setY(int y) {

    }

    // if fillColor is white, returns true, else returns false
    public boolean isFilled() {

    }

    // moves location by dx and dy
    private void moveLocation(int dx, int dy) {

    }

    abstract double getArea();
    abstract double getPerimeter();

    // You have to update other methods as described above

}
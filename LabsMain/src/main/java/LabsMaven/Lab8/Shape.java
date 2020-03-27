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
    private Point location = new Point(0,0);

    /**
     * Constructor method for Shape class and subclasses.
     * Sets the location to place the shape, its color, and its border.
     * @param fillColor the color to fill the shape with
     * @param borderColor the color to set the border to
     * @param x x coordinate value
     * @param y y coordinate value
     */
    public Shape(Color fillColor, Color borderColor, int x, int y) {
        this.fillColor = fillColor;
        this.location = new Point(x, y);
        //this.location.setLocation(x, y);
        this.borderColor = borderColor;
    }

    //set borderColor to Black since not provided
    /**
     * Constructor method for Shape class and subclasses, with default Black border color
     * Sets the location to place the shape and its fill color
     * @param fillColor the color to fill the shape with
     * @param x x coordinate value
     * @param y y coordniate value
     */
    public Shape(Color fillColor, int x, int y) {
        this.fillColor = fillColor;
        this.location.setLocation(x, y);
        this.borderColor = Color.BLACK;
    }

    /**
     * Constuctor method for Shape class and subclasses.
     * Fill color defaulted to white, border color defaulted to black
     * @param x x coordinate value
     * @param y y coordniate value
     */
    public Shape(int x, int y) {
        this.fillColor = Color.WHITE;
        this.borderColor = Color.BLACK;
        this.location.setLocation(x, y);
    }

    abstract void draw(Graphics g);

    // will fill the shape with some random image. You can select any image for larger shapes
    public void setFillColor(Color c) {
        this.fillColor = c;
    }

    public Color getFillColor() {
        return this.borderColor;
    }

    public void setBorderColor(Color c) {
        this.borderColor = c;
    }

    public Color getBorderColor() {
        return this.borderColor;
    }

    public void setLocation(Point pt) {
        this.location.setLocation(pt);
    }

    public Point getLocation() {
        return this.location;
    }

    // Note: subclasses of Shape do not inherent private members, so we need methods the subclasses
    // can use to get the x and y values from the private Point instance field


    public int getX() {
        return this.location.x;
    }

    public void setX(int x) {
        this.location.x = x;

    }

    public int getY() {
        return this.location.y;
    }

    public void setY(int y) {
        this.location.y = y;
    }

//IGNORE TIL LAB 9

    // // if fillColor is white, returns true, else returns false
    // public boolean isFilled() {

    // }

    // // moves location by dx and dy
    // private void moveLocation(int dx, int dy) {

    // }

    // abstract double getArea();
    // abstract double getPerimeter();

    // You have to update other methods as described above

}
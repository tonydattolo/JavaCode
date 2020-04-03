package LabsMaven.Lab9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.util.Random;
import static java.lang.Math.*;


/**
 * Square
 */
public class Square extends Rectangle {

    private int sideLength;

    public Square(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        this.sideLength = rn.nextInt(40);
    }

    public Square(Color fillColor, int x, int y) {
        super(fillColor, x, y);
    }

    public Square(int x, int y) {
        super(x, y);
    }

    @Override
    void draw(Graphics g) {
        g.setColor(this.getFillColor());
        g.drawRect(super.getX(), super.getY(), this.sideLength, this.sideLength);
        g.setColor(this.getBorderColor());
        g.fillRect(super.getX(), super.getY(), this.sideLength, this.sideLength);
    }

    @Override
    public String toString() {
        return "Shape Type: Square @ " + "X: " + super.getX() + ", Y: " + super.getY()
                + ", FillColor: " + super.getFillColor();
    }

    @Override
    public boolean equals(Object obj) {
        Square other = (Square) obj;
        if (this.getFillColor() == other.getFillColor()) {
            return true;
        } else {
            return false;
        }
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }


    @Override
    double getArea() {
        return pow(this.getSideLength(), 2);
    }

}

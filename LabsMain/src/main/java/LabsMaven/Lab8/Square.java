package LabsMaven.Lab8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.util.Random;

/**
 * Square
 */
public class Square extends Rectangle {

    int sideLength = rn.nextInt(40);

    public Square(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
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
        return "Shape Type: Square @ " + "X: " + super.getX() + "Y: " + super.getY();
    }
    
}
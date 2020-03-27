package LabsMaven.Lab8;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Oval class. Generates random sized and colored oval shapes
 */
public class Oval extends Shape {

    private int minorRadius; // height
    private int majorRadius; // width
    Random rn = new Random(50);

    public Oval(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        this.minorRadius = rn.nextInt(30);
        this.majorRadius = rn.nextInt(30);
    }
    
    public Oval(Color fillColor, int x, int y) {
        super(fillColor, x, y);
        this.minorRadius = rn.nextInt(30);
        this.majorRadius = rn.nextInt(30);
    }

    public Oval(int x, int y) {
        super(x, y);
        this.minorRadius = rn.nextInt(30);
        this.majorRadius = rn.nextInt(30);
    }


    @Override
    void draw(Graphics g) {
        g.setColor(this.getFillColor()); //access fill color use getter
        g.fillOval(this.getX(), this.getY(), this.majorRadius, this.minorRadius);
        g.setColor(this.getBorderColor()); //access border color getter
        g.drawOval(this.getX(), this.getY(), this.majorRadius, this.minorRadius);
    }

    public int getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(int minorRadius) {
        this.minorRadius = minorRadius;
    }

    public int getMajorRadius() {
        return majorRadius;
    }

    public void setMajorRadius(int majorRadius) {
        this.majorRadius = majorRadius;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "X: " + this.getX() + ", Y: " + this.getY() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    
}
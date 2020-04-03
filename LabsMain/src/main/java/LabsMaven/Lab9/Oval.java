package LabsMaven.Lab9;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import static java.lang.Math.*;

/**
 * Oval class. Generates random sized and colored oval shapes
 */
public class Oval extends Shape {

    private int radius; // height
    private int radius2; // width
    Random rn = new Random();

    public Oval(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        this.radius = rn.nextInt(30);
        this.radius2 = rn.nextInt(30);
    }

    public Oval(Color fillColor, int x, int y) {
        super(fillColor, x, y);
        this.radius = rn.nextInt(30);
        this.radius2 = rn.nextInt(30);
    }

    public Oval(int x, int y) {
        super(x, y);
        this.radius = rn.nextInt(30);
        this.radius2 = rn.nextInt(30);
    }

    @Override
    void draw(Graphics g) {
        g.setColor(this.getFillColor()); // access fill color use getter
        g.fillOval(this.getX(), this.getY(), this.getradius2(), this.getradius());
        g.setColor(this.getBorderColor()); // access border color getter
        g.drawOval(this.getX(), this.getY(), this.getradius2(), this.getradius());
    }

    @Override
    public String toString() {
        return "Shape Type: Oval @ " + "X: " + super.getX() + ", Y: " + super.getY()
                + ", FillColor: " + super.getFillColor();
    }

    @Override
    public boolean equals(Object obj) {
        Oval other = (Oval) obj;
        if (this.getFillColor() == other.getFillColor()) {
            return true;
        } else {
            return false;
        }

    }

    public int getradius() {
        return radius;
    }

    public void setradius(int radius) {
        this.radius = radius;
    }

    public int getradius2() {
        return radius2;
    }

    public void setradius2(int radius2) {
        this.radius2 = radius2;
    }

    @Override
    double getArea() {
        return PI * (pow(this.getradius(),2));
    }

}

package LabsMaven.Lab9;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.*;


/**
 * Circle
 */
public class Circle extends Oval {

    private int radius; // height


    public Circle(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
    }

    public Circle(Color fillColor, int x, int y) {
        super(fillColor, x, y);
    }

    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Shape Type: Circle @ " + "X: " + super.getX() + ", Y: " + super.getY()
                + ", FillColor: " + super.getFillColor();
    }

    @Override
    void draw(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(getBorderColor());
        g.drawOval(this.getX(), this.getY(), super.getradius(), super.getradius());
        g.setColor(getFillColor());
        g.fillOval(this.getX(), this.getY(), super.getradius(), super.getradius());
    }

    @Override
    public boolean equals(Object obj) {
        Circle other = (Circle) obj;
        if (this.getFillColor() == other.getFillColor()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    double getArea() {
        return super.getArea();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

  

}

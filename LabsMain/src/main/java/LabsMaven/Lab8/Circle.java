package LabsMaven.Lab8;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Circle
 */
public class Circle extends Oval {


    public Circle(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        // TODO Auto-generated constructor stub
    }

    public Circle(Color fillColor, int x, int y) {
        super(fillColor, x, y);
    }

    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
    // TODO Auto-generated method stub
    
        return "Shape Type: Circle @ " + "X: " + super.getX() + ", Y: " + super.getY();
    }

    @Override
    void draw(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(getBorderColor());
        g.drawOval(this.getX(), this.getY(), super.getMajorRadius(), super.getMajorRadius());
        g.setColor(getFillColor());
        g.fillOval(this.getX(), this.getY(), super.getMajorRadius(), super.getMajorRadius());
    }

    
}
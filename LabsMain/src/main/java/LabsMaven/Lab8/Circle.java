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
    void draw(Graphics g) {
        // TODO Auto-generated method stub
        // super.draw(g);
        g.setColor(this.getFillColor());
        g.drawOval(this.getX(), this.getY(), this.getMinorRadius(), this.getMinorRadius());
    }

    
}
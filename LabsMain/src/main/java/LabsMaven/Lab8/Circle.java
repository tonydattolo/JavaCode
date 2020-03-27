package LabsMaven.Lab8;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Circle
 */
public class Circle extends Oval {

    int x, y;
    Color fill, border;

    public Circle(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        this.x = x;
        this.y = y;
        this.fill = fillColor;
        this.border = borderColor;
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
        g.setColor(getBorderColor());
        g.drawOval(this.getX(), this.getY(), 20, 20);
        g.setColor(getFillColor());
        g.fillOval(this.getX(), this.getY(), 20, 20);
    }

    
}
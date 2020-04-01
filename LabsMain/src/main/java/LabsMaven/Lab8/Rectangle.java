package LabsMaven.Lab8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.util.Random;

/**
 * Rectangle
 */
public class Rectangle extends Quadrilateral {

    Random rn = new Random();

    private int[] xPoints = new int[4]; 
    private int[] yPoints = new int[4];
    private int nPoints;
    
    int length = rn.nextInt(50);
    int width = rn.nextInt(50);
    // int length = 30;
    // int width = 30;

    public Rectangle(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        this.xPoints[0] = x;
        this.xPoints[1] = x + width;
        this.xPoints[2] = x;
        this.xPoints[3] = x + width;
        this.yPoints[0] = y;
        this.yPoints[1] = y;
        this.yPoints[2] = y + length;
        this.yPoints[3] = y + length;
        this.nPoints = 4;
    }

    public Rectangle(Color fillColor, int x, int y) {
        super(fillColor, x, y);
        this.xPoints[0] = x;
        this.xPoints[1] = x + width;
        this.xPoints[2] = x;
        this.xPoints[3] = x + width;
        this.yPoints[0] = y;
        this.yPoints[1] = y;
        this.yPoints[2] = y + length;
        this.yPoints[3] = y + length;
        this.nPoints = 4;
    }

    public Rectangle(int x, int y) {
        super(x, y);
        this.xPoints[0] = x;
        this.xPoints[1] = x + width;
        this.xPoints[2] = x;
        this.xPoints[3] = x + width;
        this.yPoints[0] = y;
        this.yPoints[1] = y;
        this.yPoints[2] = y + length;
        this.yPoints[3] = y + length;
        this.nPoints = 4;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(this.getFillColor());
        g.drawRect(super.getX(), super.getY(), this.width, this.length);
        g.setColor(this.getBorderColor());
        g.fillRect(super.getX(), super.getY(), this.width, this.length);
    }

    @Override
    public String toString() {
        return "Shape Type: Rectangle @ " + "X: " + super.getX() + ", Y: " + super.getY();

    }
    
}
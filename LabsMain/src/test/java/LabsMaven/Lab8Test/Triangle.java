package LabsMaven.Lab8;

import java.awt.*;
import java.util.*;

/**
 * Triangle
 */
public class Triangle extends Shape {

    Random rn = new Random();
    private int[] xPoints = new int[3];
    private int[] yPoints = new int[3];
    private int nPoints = 3;
    int base = 5 + rn.nextInt(25);
    int height = 5 + rn.nextInt(25);

    public Triangle(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        this.xPoints[0] = x;
        this.yPoints[0] = y;
        this.xPoints[1] = x + (base / 2);
        this.yPoints[1] = y + height;
        this.xPoints[2] = x - (base / 2);
        this.yPoints[2] = y + height;

    }

    public Triangle(Color fillColor, int x, int y) {
        super(fillColor, x, y);
        this.xPoints[0] = x;
        this.yPoints[0] = y;
        this.xPoints[1] = x + (base / 2);
        this.yPoints[1] = y + height;
        this.xPoints[2] = x - (base / 2);
        this.yPoints[2] = y + height;
    }

    public Triangle(int x, int y) {
        super(x, y);
        this.xPoints[0] = x;
        this.yPoints[0] = y;
        this.xPoints[1] = x + (base / 2);
        this.yPoints[1] = y + height;
        this.xPoints[2] = x - (base / 2);
        this.yPoints[2] = y + height;
    }

    @Override
    void draw(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(getBorderColor());
        g.drawPolygon(xPoints, yPoints, nPoints);
        g.setColor(getFillColor());
        g.fillPolygon(xPoints, yPoints, nPoints);

    }

    @Override
    public String toString() {
        return "Shape Type: Triangle @ " + "X: " + super.getX() + ", Y: " + super.getY()
                + ", FillColor: " + super.getFillColor();
    }

    @Override
    public boolean equals(Object obj) {
        Triangle other = (Triangle) obj;
        if (this.getFillColor() == other.getFillColor()) {
            return true;
        } else {
            return false;
        }

    }

}

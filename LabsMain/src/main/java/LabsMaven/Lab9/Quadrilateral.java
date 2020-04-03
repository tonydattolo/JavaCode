package LabsMaven.Lab9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.util.Random;

/**
 * Quadrilateral
 */
public class Quadrilateral extends Shape {

    Random rn = new Random();

    private int[] xPoints = new int[4];
    private int[] yPoints = new int[4];
    private int nPoints;

    public Quadrilateral(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        this.xPoints[0] = x - rn.nextInt(20);
        this.xPoints[1] = x + rn.nextInt(20);
        this.xPoints[2] = x - rn.nextInt(20);
        this.xPoints[3] = x + rn.nextInt(20);
        this.yPoints[0] = y - rn.nextInt(20);
        this.yPoints[1] = y - rn.nextInt(20);
        this.yPoints[2] = y + rn.nextInt(20);
        this.yPoints[3] = y + rn.nextInt(20);
        this.nPoints = 4;
    }

    public Quadrilateral(Color fillColor, int x, int y) {
        super(fillColor, x, y);
        this.xPoints[0] = x - rn.nextInt(20);
        this.xPoints[1] = x + rn.nextInt(20);
        this.xPoints[2] = x - rn.nextInt(20);
        this.xPoints[3] = x + rn.nextInt(20);
        this.yPoints[0] = y - rn.nextInt(20);
        this.yPoints[1] = y - rn.nextInt(20);
        this.yPoints[2] = y + rn.nextInt(20);
        this.yPoints[3] = y + rn.nextInt(20);
        this.nPoints = 4;
    }

    public Quadrilateral(int x, int y) {
        super(x, y);
        this.xPoints[0] = x - rn.nextInt(20);
        this.xPoints[1] = x + rn.nextInt(20);
        this.xPoints[2] = x - rn.nextInt(20);
        this.xPoints[3] = x + rn.nextInt(20);
        this.yPoints[0] = y - rn.nextInt(20);
        this.yPoints[1] = y - rn.nextInt(20);
        this.yPoints[2] = y + rn.nextInt(20);
        this.yPoints[3] = y + rn.nextInt(20);
        this.nPoints = 4;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(this.getFillColor());
        g.fillPolygon(xPoints, yPoints, nPoints);
        g.setColor(this.getBorderColor());
        g.drawPolygon(xPoints, yPoints, nPoints);
    }

    @Override
    public String toString() {
        return "Shape Type: Quadrilateral @ " + "X: " + super.getX() + ", Y: " + super.getY()
                + ", FillColor: " + super.getFillColor();
    }

    @Override
    public boolean equals(Object obj) {
        Quadrilateral other = (Quadrilateral) obj;
        if (this.getFillColor() == other.getFillColor()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void moveLocation(int dx, int dy) {
        
        this.setX(super.getX() + dx);
        this.setY(super.getY() + dy);

        this.xPoints[0] = super.getX();
        this.yPoints[0] = super.getY();
        for (int i = 1; i < this.nPoints; i++) {
            this.xPoints[i] += dx;
            this.yPoints[i] += dy;
        }
    }

    @Override
    double getArea() {
        return 0;
    }
}

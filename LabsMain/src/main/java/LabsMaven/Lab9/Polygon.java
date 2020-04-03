package LabsMaven.Lab9;

import java.awt.*;
import java.util.*;

/**
 * Polygon
 */
public class Polygon extends Shape {

    Random rn = new Random();
    private int nPoints = 3 + rn.nextInt(8);
    private int[] xPoints = new int[nPoints];
    private int[] yPoints = new int[nPoints];

    public Polygon(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        this.xPoints[0] = x;
        this.yPoints[0] = y;
        for (int i = 1; i < this.nPoints; i++) {
            this.xPoints[i] = x + rn.nextInt(25);
            this.yPoints[i] = y + rn.nextInt(25);
        }
    }

    public Polygon(Color fillColor, int x, int y) {
        super(fillColor, x, y);
        this.xPoints[0] = x;
        this.yPoints[0] = y;
        for (int i = 1; i < this.nPoints; i++) {
            this.xPoints[i] = x + rn.nextInt(25);
            this.yPoints[i] = y + rn.nextInt(25);
        }
    }

    public Polygon(int x, int y) {
        super(x, y);
        this.xPoints[0] = x;
        this.yPoints[0] = y;
        for (int i = 1; i < this.nPoints; i++) {
            this.xPoints[i] = x + rn.nextInt(25);
            this.yPoints[i] = y + rn.nextInt(25);
        }
    }

    @Override
    void draw(Graphics g) {
        g.setColor(super.getBorderColor());
        g.drawPolygon(this.getxPoints(), this.getyPoints(), this.getnPoints());
        g.setColor(super.getFillColor());
        g.fillPolygon(this.getxPoints(), this.getyPoints(), this.getnPoints());

        // int width = 20;
        // int height = 20;
        // g.setColor(super.getBorderColor());
        // g.drawRect(super.getX(), super.getY(), width, height);
        // g.setColor(super.getFillColor());
        // g.fillRect(super.getX(), super.getY(), width, height);
    }

    @Override
    public String toString() {
        return "Shape Type: Polygon(" + this.nPoints + " sides) @ " + "X: " + super.getX() + ", Y: "
                + super.getY() + ", FillColor: " + super.getFillColor();
    }

    // Two Polygons are the same if they have the same color.
    @Override
    public boolean equals(Object obj) {
        Polygon other = (Polygon) obj;
        if (this.getFillColor() == other.getFillColor()) {
            return true;
        } else {
            return false;
        }
    }

    public int getnPoints() {
        return nPoints;
    }

    public void setnPoints(int nPoints) {
        this.nPoints = nPoints;
    }

    public int[] getxPoints() {
        return xPoints;
    }

    public void setxPoints(int[] xPoints) {
        this.xPoints = xPoints;
    }

    public int[] getyPoints() {
        return yPoints;
    }

    public void setyPoints(int[] yPoints) {
        this.yPoints = yPoints;
    }

    @Override
    double getArea() {
        return 0;
    }
    
    @Override
    public void moveLocation(int dx, int dy) {
        super.setX(super.getX() + dx);
        super.setY(super.getY() + dy);

        this.xPoints[0] = super.getX();
        this.yPoints[0] = super.getY();
        for (int i = 1; i < this.nPoints; i++) {
            this.xPoints[i] += dx;
            this.yPoints[i] += dy;
        }

    }

}

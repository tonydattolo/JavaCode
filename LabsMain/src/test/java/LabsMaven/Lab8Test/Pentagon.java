package LabsMaven.Lab8;

import java.awt.*;
import java.util.*;
import static java.lang.Math.*;

/**
 * Pentagon
 */
public class Pentagon extends Polygon {

    private int nPoints = 5;
    private int[] xPoints = new int[nPoints];
    private int[] yPoints = new int[nPoints];
    private int radius = 5 + rn.nextInt(25);

    public Pentagon(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);

    }

    public Pentagon(Color fillColor, int x, int y) {
        super(fillColor, x, y);
    }

    public Pentagon(int x, int y) {
        super(x, y);

    }

    @Override
    void draw(Graphics g) {
        g.setColor(super.getBorderColor());
        g.drawPolygon(super.getxPoints(), super.getyPoints(), super.getnPoints());
        g.setColor(super.getFillColor());
        g.fillPolygon(super.getxPoints(), super.getyPoints(), super.getnPoints());
    }

    @Override
    public String toString() {
        return "Shape Type: Pentagon @ X: " + super.getX() + ", Y: " + super.getY() + ", FillColor: "
                + super.getFillColor();
    }

    @Override
    public boolean equals(Object obj) {
        Pentagon other = (Pentagon) obj;
        if (this.getFillColor() == other.getFillColor()) {
            return true;
        } else {
            return false;
        }

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

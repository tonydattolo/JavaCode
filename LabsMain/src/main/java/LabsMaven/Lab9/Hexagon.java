package LabsMaven.Lab9;

import java.awt.*;
import java.util.*;
import static java.lang.Math.*;

/**
 * Hexagon
 */
public class Hexagon extends Polygon {

    private int nPoints = 6;
    private int[] xPoints = new int[nPoints];
    private int[] yPoints = new int[nPoints];
    private int radius = 5 + rn.nextInt(25);

    public Hexagon(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        // a
        this.xPoints[3] = x + radius;
        this.yPoints[3] = y;
        // b
        this.xPoints[2] = (int) (x + (radius / 2));
        this.yPoints[2] = (int) (y + ((sqrt(3) * radius) / 2));
        // c
        this.xPoints[1] = (int) x - (radius / 2);
        this.yPoints[1] = (int) (y + ((sqrt(3) * radius) / 2));
        // d
        this.xPoints[0] = x - radius;
        this.yPoints[0] = y;
        // e
        this.xPoints[5] = (int) (x - (radius / 2));
        this.yPoints[5] = (int) (y - ((sqrt(3) * radius) / 2));
        // f
        this.xPoints[4] = (int) (x + (radius / 2));
        this.yPoints[4] = (int) (y - ((sqrt(3) * radius) / 2));
    }

    public Hexagon(Color fillColor, int x, int y) {
        super(fillColor, x, y);
    }

    public Hexagon(int x, int y) {
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
        return "Shape Type: Hexagon @ X: " + super.getX() + ", Y: " + super.getY()
                + ", FillColor: " + super.getFillColor();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void moveLocation(int dx, int dy) {
        super.moveLocation(dx, dy);
    }


}

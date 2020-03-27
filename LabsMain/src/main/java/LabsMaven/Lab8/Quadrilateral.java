package LabsMaven.Lab8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.util.Random;

/**
 * Quadrilateral
 */
public class Quadrilateral extends Shape {

    Random rn = new Random();

    private int[] xPoints; 
    private int[] yPoints;
    private int nPoints;

    public Quadrilateral(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
        this.xPoints = {this.getX(),this.getX(),this.getX()+rn.nextInt(30),this.getX()+rn.nextInt(30)};
        this.yPoints = {this.getY(),this.getY()+rn.nextInt(30),this.getY(),this.getY()+rn.nextInt(30)};
        this.nPoints = 4; 
    }

    public Quadrilateral(Color fillColor, int x, int y) {
        super(fillColor, x, y);
    }

    public Quadrilateral(int x, int y) {
        super(x, y);
    }
    
    @Override
    void draw(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(this.getFillColor());
        g.fillPolygon(xPoints, yPoints, nPoints);
        g.setColor(this.getBorderColor());
        g.drawPolygon(xPoints, yPoints, nPoints);
    }

}
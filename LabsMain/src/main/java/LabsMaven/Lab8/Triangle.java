package LabsMaven.Lab8;

import java.awt.*;
import java.util.*;

/**
 * Triangle
 */
public class Triangle extends Shape {

    public Triangle(Color fillColor, Color borderColor, int x, int y) {
        super(fillColor, borderColor, x, y);
    }

    public Triangle(Color fillColor, int x, int y) {
        super(fillColor, x, y);
    }

    public Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    void draw(Graphics g) {
    // TODO Auto-generated method stub
    
    }

    @Override
    public String toString() {
        return "Shape Type: Triangle @ " + "X: " + super.getX() + "Y: " + super.getY();
    }
    
}
////////////////////////////////////////////////////////////////////////////////////
// C212
//
// Released: 3/13/20
//
// Lab 5
// @Author Tony Dattolo, tdattolo
// Last Edited: 4/1/2020
//
//
// Directions: JUnit Testing for Lab8
//
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab8Test;

import LabsMaven.Lab8.Circle;
import LabsMaven.Lab8.Hexagon;
import LabsMaven.Lab8.Oval;
import LabsMaven.Lab8.Pentagon;
import LabsMaven.Lab8.Polygon;
import LabsMaven.Lab8.Quadrilateral;
import LabsMaven.Lab8.Rectangle;
import LabsMaven.Lab8.Square;
import LabsMaven.Lab8.Triangle;
import static org.junit.Assert.*;
import java.awt.Color;
import org.junit.*;

/**
 * Lab8Tester
 */
public class Lab8Tester {

    // Colors for testing equivalency
    Color testColor1 = Color.BLUE;
    Color testColor2 = Color.BLACK;

    @Test
    public void triangleTester() {

        Triangle triangle1 = new Triangle(testColor1, testColor1, 50, 50);
        Triangle triangle2 = new Triangle(50, 50);

        assertEquals(false, triangle1.equals(triangle2));
        assertEquals(
                "Shape Type: Triangle @ X: 50, Y: 50, FillColor: java.awt.Color[r=0,g=0,b=255]",
                triangle1.toString());
    }

    @Test
    public void ovalTester() {
        Oval oval1 = new Oval(testColor1, testColor1, 50, 50);
        Oval oval2 = new Oval(50, 50);

        assertEquals(false, oval1.equals(oval2));
        assertEquals("Shape Type: Oval @ X: 50, Y: 50, FillColor: java.awt.Color[r=0,g=0,b=255]",
                oval1.toString());

    }

    @Test
    public void circleTester() {
        Circle circle1 = new Circle(testColor2, testColor2, 50, 50);
        Circle circle2 = new Circle(50, 50);

        assertEquals(true, circle1.equals(circle2));
        assertEquals("Shape Type: Circle @ X: 50, Y: 50, FillColor: java.awt.Color[r=0,g=0,b=0]",
                circle1.toString());
    }

    @Test
    public void quadTester() {
        Quadrilateral quad1 = new Quadrilateral(testColor1, testColor1, 50, 50);
        Quadrilateral quad2 = new Quadrilateral(50, 50);

        assertEquals(false, quad1.equals(quad2));
        assertEquals("Shape Type: Quadrilateral @ X: 50, Y: 50, FillColor: java.awt.Color[r=0,g=0,b=255]",
                quad1.toString());
    }

    @Test
    public void rectTester() {
        Rectangle rect1 = new Rectangle(testColor1, testColor1, 50, 50);
        Rectangle rect2 = new Rectangle(50, 50);

        assertEquals(false, rect1.equals(rect2));
        assertEquals("Shape Type: Rectangle @ X: 50, Y: 50, FillColor: java.awt.Color[r=0,g=0,b=255]",
                rect1.toString());
    }

    @Test
    public void squareTester() {
        Square sq1 = new Square(testColor2, testColor2, 50, 50);
        Square sq2 = new Square(50, 50);

        assertEquals(true, sq1.equals(sq2));
        assertEquals("Shape Type: Square @ X: 50, Y: 50, FillColor: java.awt.Color[r=0,g=0,b=0]",
                sq1.toString());
    }

    @Test
    public void polyTester() {
        Polygon poly1 = new Polygon(testColor1, testColor1, 50, 50);
        Polygon poly2 = new Polygon(50, 50);
        poly1.setnPoints(7);
        poly2.setnPoints(7);

        assertEquals(false, poly1.equals(poly2));
        assertEquals("Shape Type: Polygon(7 sides) @ X: 50, Y: 50, FillColor: java.awt.Color[r=0,g=0,b=255]",
                poly1.toString());
    }

    @Test
    public void pentaTester() {
        Pentagon penta1 = new Pentagon(testColor2, testColor2, 50, 50);
        Pentagon penta2 = new Pentagon(50, 50);

        
        assertEquals(true, penta1.equals(penta2));
        assertEquals("Shape Type: Pentagon @ X: 50, Y: 50, FillColor: java.awt.Color[r=0,g=0,b=0]",
                penta1.toString());
    }

    @Test
    public void hexaTester() {
        Hexagon hex1 = new Hexagon(testColor1, testColor1, 50, 50);
        Hexagon hex2 = new Hexagon(50, 50);

        
        assertEquals(false, hex1.equals(hex2));
        assertEquals("Shape Type: Hexagon @ X: 50, Y: 50, FillColor: java.awt.Color[r=0,g=0,b=255]",
                hex1.toString());
    }

}

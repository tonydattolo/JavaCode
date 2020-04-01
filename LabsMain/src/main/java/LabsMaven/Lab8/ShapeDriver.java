////////////////////////////////////////////////////////////////////////////////////
//
// C212
//
// Lab8
// @Author
// Explain: What does this class do?
///////////////////////////////////////////////////////////////////////////////////
package LabsMaven.Lab8;


import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;


/*
 * Driver program for random shape generator app NOTE: You are encouraged to experiment and try out
 * various approaches The comments given here are just guidelines to get you started Possibly, this
 * problem can be finished in many ways.
 */
public class ShapeDriver extends JPanel implements ActionListener {

  // Panel constants
  public final int FRAME_WIDTH = 600;
  public final int FRAME_HEIGHT = 600;

  public Random rn = new Random();

  // Need some data structure here to store all Shapes to be drawn
  // in the paintComponent
  ArrayList<Shape> randomShapesDynamic;
  // You can also keep other instance variables here as you deem fit
  int ovalCount = 0;
  int circleCount = 0;
  int quadCount = 0;
  int rectCount = 0;
  int squareCount = 0;
  int triangleCount = 0;
  int polygonCount = 0;
  int pentagonCount = 0;
  int hexagonCount = 0;

  public ShapeDriver() {

    super();
    /*
     * TO-DO: - set up this JPanel - initialize any other fields you've declared - You could also
     * setBackground here
     */
    this.setBackground(new Color(rn.nextInt(256),rn.nextInt(256),rn.nextInt(256)));
    this.randomShapesDynamic = new ArrayList<>();
    this.setVisible(true);
    this.setSize(600, 600);
  }

  @Override
  public void paintComponent(Graphics g) {
    // calling super class paintComponent method
    // background will not be colored otherwise
    super.paintComponent(g);

    for (Shape s : randomShapesDynamic) {
      s.draw(g);
    }

    // for (int i = 0; i < this.randomShapesDynamic.size(); i++) {
    // this.randomShapesDynamic.get(i).draw(g);
    // }
    /*
     * Invoke the .draw() of the different Shapes here. It should take the Graphics g object as a
     * parameter. Iterate over your data structure holding all the various Shape objects and call
     * their draw() method.
     */

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    /*
     * This method gets invoked automatically whenever Timer runs out. Purpose of this method should
     * be to do all the randomization such as picking random colors, (x,y) coords, sizes and also
     * deciding which type of shape to draw. Call this.repaint() at the end, so that
     * paintComponent() is invoked.
     * 
     * Remember, a specific type of shape (Square, Oval etc) can be repeated only 10 times max.
     */
    
    
    // System.out.println("in actionPerformed"); // debugging
    Color randomFillColor = new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256));
    Color randomBorderColor = new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256));
    int randomX = rn.nextInt(this.FRAME_WIDTH - 50) + 20;
    int randomY = rn.nextInt(this.FRAME_HEIGHT - 50) + 20;



    int randomShape = rn.nextInt(9);
    switch (randomShape) {
      case 0:
        if (ovalCount < 10) {
          Oval randomOval = new Oval(randomFillColor, randomBorderColor, randomX, randomY);
          this.randomShapesDynamic.add(randomOval);
          System.out.println(randomOval);
          ovalCount++;
          break;
        } else {
          break;
        }
      case 1:
        if (circleCount < 10) {
          Circle randomCircle = new Circle(randomFillColor, randomBorderColor, randomX, randomY);
          this.randomShapesDynamic.add(randomCircle);
          System.out.println(randomCircle);
          circleCount++;
          break;
        } else {
          break;
        }
      case 2:
        if (quadCount < 10) {
          Quadrilateral randomQuad =
              new Quadrilateral(randomFillColor, randomBorderColor, randomX, randomY);
          this.randomShapesDynamic.add(randomQuad);
          System.out.println(randomQuad);
          quadCount++;
          break;
        } else {
          break;
        }
      case 3:
        if (rectCount < 10) {
          Rectangle randomRect = new Rectangle(randomFillColor, randomBorderColor, randomX, randomY);
          this.randomShapesDynamic.add(randomRect);
          System.out.println(randomRect);
          rectCount++;
          break;
        } else {
          break;          
        }
      case 4:
        if (squareCount < 10) {
          Square randomSquare = new Square(randomFillColor, randomBorderColor, randomX, randomY);
          this.randomShapesDynamic.add(randomSquare);
          System.out.println(randomSquare);
          squareCount++;
          break;
        } else {
          break;
        }
      case 5:
        if (triangleCount < 10) {
          Triangle randomTriangle = new Triangle(randomFillColor, randomBorderColor, randomX, randomY);
          this.randomShapesDynamic.add(randomTriangle);
          System.out.println(randomTriangle);
          triangleCount++;
          break;
        } else {
          break;
        }
      case 6:
        if (polygonCount < 10) {
          Polygon randomPolygon = new Polygon(randomFillColor, randomBorderColor, randomX, randomY);
          this.randomShapesDynamic.add(randomPolygon);
          System.out.println(randomPolygon);
          polygonCount++;
          break;
        } else {
          break;
        }
      case 7:
        if (pentagonCount < 10) {
          Pentagon randomPentagon = new Pentagon(randomFillColor, randomBorderColor, randomX, randomY);
          this.randomShapesDynamic.add(randomPentagon);
          System.out.println(randomPentagon);
          pentagonCount++;
          break;
        } else {
          break;
        }
      case 8:
        if (hexagonCount < 10) {
          Hexagon randomHexagon = new Hexagon(randomFillColor, randomBorderColor, randomX, randomY);
          this.randomShapesDynamic.add(randomHexagon);
          System.out.println(randomHexagon);
          hexagonCount++;
          break;
        } else {
          break;
        }
      
      default:
        break;
    }
    this.repaint();

  }

  // test client
  public static void main(String[] args) {

  }

  @Override
  public int getHeight() {
    // TODO Auto-generated method stub
    // return super.getHeight();
    return this.FRAME_HEIGHT;
  }

  @Override
  public int getWidth() {
    // TODO Auto-generated method stub
    // return super.getWidth();
    return this.FRAME_WIDTH;
  }
}

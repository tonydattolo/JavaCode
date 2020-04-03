package LabsMaven.Lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import LabsMaven.Lab9.*;
import static java.lang.Math.*;

public class ShapeDriver extends JPanel implements ActionListener, KeyListener {

	private Timer timer;
	public Random rn = new Random();
	public final int FRAME_WIDTH = 600;
	public final int FRAME_HEIGHT = 600;

	ArrayList<Shape> randomShapeHolder;
	ArrayList<Shape> tempShapesHolder;
	

	public ShapeDriver() {
		// the second argument to the Timer Constructor takes an ActionListener
		// the this key word informs the JVM to look inside this class for
		// the actionPerformed method that must be overridden when
		// ActionListener is implemented
		// Every tick of the clock will now run the actionPerformed method
		timer = new Timer(1000 / 60, this);
		timer.start();

		this.setBackground(new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256)));
		this.randomShapeHolder = new ArrayList<>();
		this.tempShapesHolder= new ArrayList<>();
		this.setVisible(true);
		this.setSize(600, 600);

		this.setFocusable(true);
		this.requestFocus();
	}

	// Method that must be implemented since the class implements ActionListener
	public void actionPerformed(ActionEvent e) {
		// move each Shape
		// check if each Shape is in bounds, and delete if it touches the borders

		// check if Shape is Circle or Square
		// if it is a Circle or Square, check if it collides with Shape of same type
		// if it collides with Shape of same type but different color,
		// delete the shape with smaller Area
		// if the Shapes have the same area, delete one or the other but not both

		// if the Shape collides with a Shape of same color,
		// create a new Shape with twice the area of the larger Shape and direction of smaller Shape
		// if the Shapes have the same area, then the area should still be doubled
		// and select direction of one of the Shapes for the new Shape

		// call repaint

		// Move Shapes in random directions
	
		for (int i = 0; i < randomShapeHolder.size(); i++) {
			int dx = 0;
			int dy = 0;
			int randomDirection = rn.nextInt(4);
			switch (randomDirection) {
				case 0:
					dx = -1; dy = -1;	
					break;
				case 1:
					dx = 1; dy = -1;
					break;
				case 2:
					dx = -1; dy = 1;
					break;
				case 3:
					dx = 1; dy = 1;
				default:
					break;
			}
			randomShapeHolder.get(i).moveLocation(dx, dy);

		}

		// Check if shapes are hitting boundaries
		for (int i = 0; i < randomShapeHolder.size(); i++) {
			if (randomShapeHolder.get(i).getX() >= this.FRAME_WIDTH || randomShapeHolder.get(i).getX() <= 0) {
				randomShapeHolder.remove(i);
			} else if (randomShapeHolder.get(i).getY() >= this.FRAME_HEIGHT || randomShapeHolder.get(i).getY() <= 0) {
				randomShapeHolder.remove(i);
			}

		}

		// Check if not square or circle to add to new list
		for (int i = 0; i < randomShapeHolder.size(); i++) {
			if (!(randomShapeHolder.get(i) instanceof Square) || !(randomShapeHolder.get(i) instanceof Circle)) {
				tempShapesHolder.add(randomShapeHolder.get(i));
			}
		}


		// Check for collisions between sqaures and circles
		for (int i = 0; i < randomShapeHolder.size(); i++) {
			for (int j = 0; j < randomShapeHolder.size(); j++) {
				if (i != j) {
					//SQUARE
					if ((randomShapeHolder.get(i) instanceof Square) && (randomShapeHolder.get(j) instanceof Square)) {
						int sideLengthSum = (((Square) randomShapeHolder.get(i)).getSideLength() / 2) + (((Square) randomShapeHolder.get(j)).getSideLength() / 2);

						int distance = (int) sqrt(pow((randomShapeHolder.get(j).getX() - randomShapeHolder.get(i).getX()),2) + pow((randomShapeHolder.get(j).getY() - randomShapeHolder.get(i).getY()), 2));

						if (sideLengthSum > distance) {
							// COLLISION

							// check if not same color. if so, delete smaller of the two
							// if (randomShapeHolder.get(i).getFillColor() != randomShapeHolder.get(j).getFillColor()) {
							// 	if (randomShapeHolder.get(i).getArea() <= randomShapeHolder.get(j).getArea()) {
							// 		tempShapesHolder.add(randomShapeHolder.get(j));
							// 	} else {
							// 		tempShapesHolder.add(randomShapeHolder.get(i));
							// 	}
							// } else {
								if (((Square) randomShapeHolder.get(i)).getSideLength() <= ((Square) randomShapeHolder.get(j)).getSideLength()) {
									int test = (((Square) randomShapeHolder.get(j)).getSideLength()) * 2;
									((Square) randomShapeHolder.get(j)).setSideLength(test);
									tempShapesHolder.add(randomShapeHolder.get(j));
								} else {
									int test = (((Square) randomShapeHolder.get(i)).getSideLength()) * 2;
									((Square) randomShapeHolder.get(i)).setSideLength(test);
									tempShapesHolder.add(randomShapeHolder.get(i));
									
								// }
							}
						}
					}
					//CIRCLE
					if ((randomShapeHolder.get(i) instanceof Circle) && (randomShapeHolder.get(j) instanceof Circle)) {
						int sideLengthSum = (((Circle) randomShapeHolder.get(i)).getradius() / 2) + (((Circle) randomShapeHolder.get(j)).getradius() / 2);

						int distance = (int) sqrt(pow((randomShapeHolder.get(j).getX() - randomShapeHolder.get(i).getX()),2) + pow((randomShapeHolder.get(j).getY() - randomShapeHolder.get(i).getY()), 2));

						if (sideLengthSum > distance) {
							// COLLISION

							// check if not same color. if so, delete smaller of the two
							// if (randomShapeHolder.get(i).getFillColor() != randomShapeHolder.get(j).getFillColor()) {
							// 	if (randomShapeHolder.get(i).getArea() <= randomShapeHolder.get(j).getArea()) {
							// 		tempShapesHolder.add(randomShapeHolder.get(j));
							// 	} else {
							// 		tempShapesHolder.add(randomShapeHolder.get(i));
							// 	}
							// } else {
								if (((Circle) randomShapeHolder.get(i)).getradius() <= ((Circle) randomShapeHolder.get(j)).getradius()) {
									int test = (((Circle) randomShapeHolder.get(j)).getradius()) * 2;
									((Circle) randomShapeHolder.get(j)).setRadius(test);

									tempShapesHolder.add(randomShapeHolder.get(j));

								} else {
									int test = (((Circle) randomShapeHolder.get(j)).getradius()) * 2;
									((Circle) randomShapeHolder.get(i)).setRadius(test);

									tempShapesHolder.add(randomShapeHolder.get(i));
								// }
							}
						}
					}
				}
			}
		}

		randomShapeHolder.clear();
		for (int i = 0; i < tempShapesHolder.size(); i++) {
			randomShapeHolder.add(tempShapesHolder.get(i));
		}
		tempShapesHolder.clear();
		

		this.repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		// calling super class paintComponent method
		// background will not be colored otherwise
		super.paintComponent(g);
		/*
		 * Invoke the .draw() of the different Shapes here. It should take the Graphics g object as a
		 * parameter. Iterate over your data structure holding all the various Shape objects and call their
		 * draw() method.
		 */

		// for (int i = 0; i < randomShapeHolder.size(); i++) {


		// }

		for (Shape s : randomShapeHolder) {
			s.draw(g);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		/*
		 * This method will be invoked whenever a key is pressed. For this method, you will need to
		 * determine if the H key is pressed, and if it is, create a new random Shape and add it to your
		 * data structure that holds all the Shapes.
		 */
		Color randomFillColor = new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256));
		Color randomBorderColor = new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256));
		int randomX = rn.nextInt(this.FRAME_WIDTH - 50) + 20;
		int randomY = rn.nextInt(this.FRAME_HEIGHT - 50) + 20;

		if (e.getKeyCode() == KeyEvent.VK_H) {

			// Square randomSquare = new Square(randomFillColor, randomBorderColor, randomX, randomY);
			// this.randomShapeHolder.add(randomSquare);

			int randomShape = rn.nextInt(9);
			switch (randomShape) {
				case 0:
					Oval randomOval = new Oval(randomFillColor, randomBorderColor, randomX, randomY);
					this.randomShapeHolder.add(randomOval);
					break;
				case 1:
					Circle randomCircle = new Circle(randomFillColor, randomBorderColor, randomX, randomY);
					this.randomShapeHolder.add(randomCircle);
					break;
				case 2:
					Quadrilateral randomQuad = new Quadrilateral(randomFillColor, randomBorderColor, randomX, randomY);
					this.randomShapeHolder.add(randomQuad);
					break;
				case 3:
					Rectangle randomRect = new Rectangle(randomFillColor, randomBorderColor, randomX, randomY);
					this.randomShapeHolder.add(randomRect);
					break;
				case 4:
					Square randomSquare = new Square(randomFillColor, randomBorderColor, randomX, randomY);
					this.randomShapeHolder.add(randomSquare);
					break;
				case 5:
					Triangle randomTriangle = new Triangle(randomFillColor, randomBorderColor, randomX, randomY);
					this.randomShapeHolder.add(randomTriangle);
					break;
				case 6:
					Polygon randomPolygon = new Polygon(randomFillColor, randomBorderColor, randomX, randomY);
					this.randomShapeHolder.add(randomPolygon);
					break;
				case 7:
					Pentagon randomPentagon = new Pentagon(randomFillColor, randomBorderColor, randomX, randomY);
					this.randomShapeHolder.add(randomPentagon);
					break;
				case 8:
					Hexagon randomHexagon = new Hexagon(randomFillColor, randomBorderColor, randomX, randomY);
					this.randomShapeHolder.add(randomHexagon);
					break;
				default:
					break;
			}
		}
	}

	// No implementation is needed for this lab assignment.
	@Override
	public void keyReleased(KeyEvent e) {
	}


	// No implementation is needed for this lab assignment.
	@Override
	public void keyTyped(KeyEvent e) {
	}
}

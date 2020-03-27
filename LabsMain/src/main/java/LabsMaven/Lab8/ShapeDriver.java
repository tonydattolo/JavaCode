////////////////////////////////////////////////////////////////////////////////////
//
//  C212
//
//  Lab8
//  @Author  
//  Explain: What does this class do?
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
 * Driver program for random shape generator app
 * NOTE: You are encouraged to experiment and try out various approaches
 * The comments given here are just guidelines to get you started 
 * Possibly, this problem can be finished in many ways.
 */
public class ShapeDriver extends JPanel implements ActionListener {

    // Panel constants
    public final int FRAME_WIDTH = 600;
    public final int FRAME_HEIGHT = 600;

    public Random random = new Random();
	
	// Need some data structure here to store all Shapes to be drawn
	// in the paintComponent
    ArrayList<Shape> randomShapesDynamic;
  // You can also keep other instance variables here as you deem fit
  
	
    public ShapeDriver() {
    
      super(); 
      /* TO-DO: 
        *  - set up this JPanel
        *  - initialize any other fields you've declared
        *  - You could also setBackground here
        */
        this.randomShapesDynamic = new ArrayList<>();
        this.setVisible(true);
        this.setSize(600, 600);
    }

    @Override
    public void paintComponent(Graphics g) {
      // calling super class paintComponent method
      // background will not be colored otherwise
      super.paintComponent(g);
      
      for(Shape s : randomShapesDynamic){
        s.draw(g);
      }
      
      // for (int i = 0; i < this.randomShapesDynamic.size(); i++) {
      //   this.randomShapesDynamic.get(i).draw(g);
      // }
      /*
		  Invoke the .draw() of the different Shapes here. It should take
		  the Graphics g object as a parameter. Iterate over your data structure
		  holding all the various Shape objects and call their draw() method.
      */
        
    }
    
	@Override
	public void actionPerformed(ActionEvent e){
		/*
		  This method gets invoked automatically whenever Timer runs out.
		  Purpose of this method should be to do all the randomization
		  such as picking random colors, (x,y) coords, sizes and also
		  deciding which type of shape to draw. Call this.repaint() at
		  the end, so that paintComponent() is invoked.
		  
		  Remember, a specific type of shape (Square, Oval etc) can be repeated
		  only 10 times max.
    */
    //Random r = new Random();
    //randomShapesDynamic.add(new Circle(Color.BLUE, Color.BLACK, r.nextInt(600), r.nextInt(600)));
    System.out.println("in actionPerformed");
    int rVal = random.nextInt(256);
    int gVal = random.nextInt(256);
    int bVal = random.nextInt(256);
    Color randomFillColor = new Color(rVal,gVal,bVal);
    Color randomBorderColor = new Color(rVal,gVal,bVal);
    int randomX = random.nextInt(this.FRAME_WIDTH - 1);
    int randomY = random.nextInt(this.FRAME_HEIGHT - 1);
    
    

     int randomShape = random.nextInt(2);
     switch (randomShape) {
       case 0:
          Oval randomOval = new Oval(Color.BLACK, Color.RED, random.nextInt(600), random.nextInt(600));
          this.randomShapesDynamic.add(randomOval);     
           //print 
       case 1:
           Circle randomCircle = new Circle(randomFillColor, randomBorderColor, randomX, randomY);
           this.randomShapesDynamic.add(randomCircle);
           //print
    // //   // case 2:
    // //   // case 3:
    // //   // case 4:
    // //   // case 5:
    // //   // case 6:
    // //   // case 7:
    // //   // case 8:
    //   default:
    //     break;
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
////////////////////////////////////////////////////////////////////////////////////
//
//  C212
//
//  Lab8
//  @Author  
//  Explain: What does this class do?
///////////////////////////////////////////////////////////////////////////////////
 
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

/*
 * Driver program for random shape generator app
 * NOTE: You are encouraged to experiment and try out various approaches
 * The comments given here are just guidelines to get you started 
 * Possibly, this problem can be finished in many ways.
 */
public class ShapeDriver extends JPanel {

    // Panel constants
    public final int FRAME_WIDTH = 600;
    public final int FRAME_HEIGHT = 600;

    private Random random;
	
	// Need some data structure here to store all Shapes to be drawn
	// in the paintComponent
	
	// You can also keep other instance variables here as you deem fit
	
    public ShapeDriver() {
        super(); 

        /* TO-DO: 
         *  - set up this JPanel
         *  - initialize any other fields you've declared
         *  - You could also setBackground here
         */
    }

    @Override
    public void paintComponent(Graphics g) {
        // calling super class paintComponent method
        // background will not be colored otherwise
        super.paintComponent(g);

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
		
		
	}
    // test client
    public static void main(String[] args) {

    }
}
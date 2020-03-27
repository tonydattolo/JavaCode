////////////////////////////////////////////////////////////////////////////////////
//
//  C212
//
//  Lab8
//  @Author  
//  Explain: What does this class do?
///////////////////////////////////////////////////////////////////////////////////
package LabsMaven.Lab8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionListener;



/*
 * Main application for random shape generator app
 * NOTE: You are encouraged to experiment and try out various approaches
 * The comments given here are just guidelines to get you started 
 * Possibly, this problem can be completed in many ways.
 */
public class ShapeWindow extends JFrame {

    

	private int timerDelay = 100; //milliseconds
	JPanel shapeDriver;

    public ShapeWindow() {
        super();
		// TO-DO: set up the frame
		

		/*
		Create a ShapeDriver object here (which is a JPanel)
		and add it to ShapeWindow (which is a JFrame). Don't forget to setSize,
		setVisible and any other required attributes (you might want to add the ShapeDriver
		object to the ContentPane (using this.getContentPane()) instead of directly adding
		to ShapeWindow.
		
		You can initialize a Timer here (with appropriate milliseconds and your 
		ShapeDriver obj created above as params). Use the timer.start() method to start Timer.
		However, you would also want to do Thread.sleep(<Appropriate milliseconds here>) afterwards
		It should be within a try-catch block. You can leave the catch block empty or provide some sysout msg
		You can stop your timer object after the try-catch block
		
		*/

		// JFrame frame = new JFrame();
		
		// JPanel shapeDriver = new ShapeDriver();
		// // this.setContentPane(shapeDriver);
		// this.getContentPane().add(shapeDriver);
		// // this.setContentPane(shapeDriver);
		// this.setTitle("Shapes");
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setSize(shapeDriver.getHeight(),shapeDriver.getWidth());
		// this.setVisible(true);


		// Timer delayDrawing = new Timer(100, (ActionListener) shapeDriver);
		// delayDrawing.start();
		// //this.add(shapeDriver);
		// try {
		// 	Thread.sleep(20000);			
		// } catch (Exception e) {
		// 	System.out.println("error");
		// }
		// delayDrawing.stop();


		shapeDriver = new ShapeDriver();
		this.setSize(600, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(shapeDriver);
		Timer t = new Timer(1000, (ActionListener) shapeDriver);
		t.start();

    }

    public static void main(String[] args) {
        // Create a JFrame and invoke the constructor
		JFrame shapeWindow = new ShapeWindow();
		
    }

	public int getTimerDelay() {
		return timerDelay;
	}
}

////////////////////////////////////////////////////////////////////////////////////
//
// C212
//
// Lab8
// @Author
// Explain: Creates a window and calls the ShapeDriver class to populate it with
// shapes of random colors, sides, etc. Has a timer to determine when
// to populate and when to stop. Every 100 miliseconds for 20 seconds
// or until max number of shapes is reached (10 each)
///////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionListener;


/**
 * Creates a window and calls the ShapeDriver class to populate it with shapes of random colors,
 * sides, etc. Has a timer to determine when to populate and when to stop. Every 100 miliseconds for
 * 20 seconds or until max number of shapes is reached (10 each)
 */

public class ShapeWindow extends JFrame {



	private int timerDelay = 100; // milliseconds
	// private int totalTime = 20000;
	JPanel shapeDriver;

	public ShapeWindow() {
		super();
		// TO-DO: set up the frame


		/*
		 * Create a ShapeDriver object here (which is a JPanel) and add it to ShapeWindow (which is
		 * a JFrame). Don't forget to setSize, setVisible and any other required attributes (you
		 * might want to add the ShapeDriver object to the ContentPane (using this.getContentPane())
		 * instead of directly adding to ShapeWindow.
		 * 
		 * You can initialize a Timer here (with appropriate milliseconds and your ShapeDriver obj
		 * created above as params). Use the timer.start() method to start Timer. However, you would
		 * also want to do Thread.sleep(<Appropriate milliseconds here>) afterwards It should be
		 * within a try-catch block. You can leave the catch block empty or provide some sysout msg
		 * You can stop your timer object after the try-catch block
		 * 
		 */

		shapeDriver = new ShapeDriver();
		this.setTitle("Shapes-o-rama!");
		this.setSize(600, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(shapeDriver);
		Timer t = new Timer(100, (ActionListener) shapeDriver);
		t.start();
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
			System.out.println("Error: End of 20s");
		}
		t.stop();

	}

	public static void main(String[] args) {
		// Create a JFrame and invoke the constructor
		JFrame shapeWindow = new ShapeWindow();

	}

	public int getTimerDelay() {
		return timerDelay;
	}
}

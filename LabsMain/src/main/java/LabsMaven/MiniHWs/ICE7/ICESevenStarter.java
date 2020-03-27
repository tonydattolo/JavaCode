import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import javax.swing.KeyStroke;


public class ICESevenStarter extends JComponent implements KeyListener {
	
	//For me, it is better to initiate some data when creating the fields
	//So that you will not encounter null exceptions later
	private String cityOfBirth = "";
	private String names = "";
	private int xLoc = 0;
	private int yLoc = 0;
	
	
	// TODO?
	// you might need another fields at here
	
	public ICESevenStarter(int xLoc, int yLoc) {
		// TODO
		// initiate x and y location as input x and y location
		// initiate other fields by reading the files
		this.xLoc = xLoc;
		this.yLoc = yLoc;

	   
	   // You can choose to store the new data to file directly in here
	   // Or you can create a function to do that
	}

    public void paintComponent(Graphics g) {
    	// TODO
		// print the text you want to draw at here
		
		System.out.println();

    }
    
    
    // TODO?
    // think about how to change your text in this class
    // if you choose to set Tester as KeyListener, then you should have set of setters for the fields to be called in Tester.java
	// If you choose to set this class as KeyListener, then you can directly setup the three functions for keyListener, and change the text to draw in here. 
	
	public void keyPressed (KeyEvent event) {

		switch (event.getKeyCode()) {
			case KeyEvent.VK_C:
				
				break;
			case KeyEvent.VK_N:
				
				break
			case KeyEvent.VK_B:

				break;
		
			default:
				break;
		}
	}
	public void keyTyped (KeyEvent event) {}
	public void keyReleased (KeyEvent event) {}
}

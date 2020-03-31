package LabsMaven.Lab7;

import java.util.ArrayList;
import javax.swing.JComponent;
import java.awt.*;

/**
 * Cannonball class implementation as outlined in Lab7.pdf
 */
public class Cannonball {

    
    public static void main(String[] args) {
        // Create a Cannonball obj
        // Use Scanner to take inputs
        // Call shoot method and store everything 
        // to an ArrayList
        // Instantiate an obj of this class and
        // do the regular JFrame stuff 
        // (setSize, add, setVisible etc etc)
        }

    private double xPosition, yPosition;
    private double xVelocity, yVelocity;
    private static final double g = 9.82;
    
    // Constructor here that takes xPosition as argument
    // and inits everything else to 0
    
    public void move(double deltaSec) {
    // Update xPosition, yPosition and yVelocity
    // here using the respective formulae
    }
    
    public Point getLocation() {
    // returns a new Point object with xPosition and yPos
    }
    
    public ArrayList<Point> shoot(double alpha, double v, double deltaSec){
    // Calculate initial xVelocity and yVelocity using
    // Math.cos() and Math.sin() 
    // Keep on calling move and store the
    // respective coords of current location into an ArrayList
    // while yPosition > 0 
    // How do you get the current location tho???
    }
   }
   // ---> DrawCannonball Class
   public class DrawCannonball extends JComponent {
    // Declare an array list here. This is what you
    // will be drawing with
    
    // Constructor here that takes an 
    // ArrayList as argument
    
    public void paint(Graphics g) {
    // Go over all the points in your ArrayList and
    // draw circles. You might wanna flip the y coord though
    // using getheight()-y
    }
    
}
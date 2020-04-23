package LabsMaven.Lab7;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;
import static java.lang.Math.*;

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
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the Cannonball Shooting Simulator!\nPlease enter the angle of your shot (ex. 1.55): ");
        double userAngle = console.nextDouble();
        System.out.println("Now enter the velocity of your shot (ex: 100.0): ");
        double userVelocity = console.nextDouble();
        System.out.println("Now enter the change in time interval (ex: .05): ");
        double userDeltaSec = console.nextDouble();

        Cannonball lecanon = new Cannonball(100);
        // DrawCannonball test = new DrawCannonball(lecanon.shoot(1.26, 80.0, .01));
        DrawCannonball shot0 = new DrawCannonball(lecanon.shoot(userAngle, userVelocity, userDeltaSec));
        

        // lecanon.shoot(alpha, v, deltaSec);
        JFrame battlefield = new JFrame();
        battlefield.setTitle("Cannonball shot: Angle=" + userAngle + " Velocity=" + userVelocity + " DeltaSec=" + userDeltaSec);
        battlefield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        battlefield.setBackground(Color.LIGHT_GRAY);
        battlefield.setSize(800, 800);
        
        battlefield.setVisible(true);
        // battlefield.add(test);
        battlefield.add(shot0);
        battlefield.setVisible(true);
        
        console.close();

        }

    private double xPosition, yPosition;
    private double xVelocity, yVelocity;
    private static final double g = 9.82;
    
    // Constructor here that takes xPosition as argument
    // and inits everything else to 0
    public Cannonball(double xPosition) {
        this.xPosition = xPosition;
        this.yPosition = 0;
        this.xVelocity = 0;
        this.yVelocity = 0;
    }
    public Cannonball() {
        this.xPosition = 0;
        this.yPosition = 0;
        this.xVelocity = 0;
        this.yVelocity = 0;
    }
    
    public void move(double deltaSec) {
    // Update xPosition, yPosition and yVelocity
    // here using the respective formulae
        this.setxPosition(this.getxPosition() + this.getG() * deltaSec);
        this.setyPosition(this.getyPosition() + this.getyVelocity() * deltaSec - (pow(this.getG()*deltaSec, 2) / 2));
        this.setyVelocity(this.getyVelocity() - this.getG() * deltaSec);
    }
    
    public Point getLocation() {
    // returns a new Point object with xPosition and yPos
        Point foo = new Point();
        foo.setLocation(round(this.getxPosition()), this.getyPosition());
        return foo;
    }
    
    public ArrayList<Point> shoot(double alpha, double v, double deltaSec){
    // Calculate initial xVelocity and yVelocity using
    // Math.cos() and Math.sin() 
    // Keep on calling move and store the
    // respective coords of current location into an ArrayList
    // while yPosition >= 0 
    // How do you get the current location tho???

        ArrayList<Point> shootList = new ArrayList<>();

        double initialxVelocity = v * cos(alpha);
        this.setxVelocity(initialxVelocity);
        double initialyVelocity = v * sin(alpha);
        this.setyVelocity(initialyVelocity);
        while (this.getyPosition() >= 0) {
            this.move(deltaSec);
            Point point = this.getLocation();
            shootList.add(point);
        }
        return shootList;
    }

    public double getxPosition() {
        return xPosition;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public double getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    public double getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    public double getG() {
        return g;
    }
   }
//    ---> DrawCannonball Class
    class DrawCannonball extends JComponent {
        // Declare an array list here. This is what you
        // will be drawing with
        private ArrayList<Point> drawPoints;
        
        // Constructor here that takes an 
        // ArrayList as argument
        public DrawCannonball(ArrayList<Point> arr) {
            this.drawPoints = arr;
        }
        
        public void paint(Graphics g) {
        // Go over all the points in your ArrayList and
        // draw circles. You might wanna flip the y coord though
        // using getheight()-y
            for (int i = 0; i < this.drawPoints.size(); i++) {
                g.setColor(Color.BLACK);
                g.drawOval((int) drawPoints.get(i).getX(),getHeight() - (int) drawPoints.get(i).getY(), 2, 2);
                g.fillOval((int) drawPoints.get(i).getX(),getHeight() - (int) drawPoints.get(i).getY(), 2, 2);
        
            }
        }
    
}
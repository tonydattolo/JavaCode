/**
 * Lab 4, Problem 5
 * Audi class to draw logo of Audi inside of a JFrame
 * Logo component is located in AudiLogoDrawer.java
 */

package LabsMaven.Lab4;

import javax.swing.*;

public class Audi extends JComponent {

    public static void main(String[] args) {
   
        // Initialize JFrame
        JFrame display = new JFrame("Audi Logo");
   
        // Set initial JFrame values
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setSize(500,500);
        display.setVisible(true);
        
        // Create new instance of AudiLogoDrawer class
        AudiLogoDrawer fourRings = new AudiLogoDrawer();
        
        // Add component to JFrame
        display.add(fourRings);
    }
}
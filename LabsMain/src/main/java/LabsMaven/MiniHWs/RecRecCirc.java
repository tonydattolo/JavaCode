/**
 * RecRecCirc
 * Creates a JFrame window to display drawing
 * Drawing is determined in DrawComponents.java
 */

package LabsMaven.MiniHWs;

import java.awt.*;
import javax.swing.*;

public class RecRecCirc extends JComponent {

    public static void main(String[] args) {
        JFrame geometry = new JFrame("Two Rectangles");
        // geometry.add();
        geometry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        geometry.setSize(500,500);
        geometry.setVisible(true);
        
        DrawComponents boxCircleBox = new DrawComponents();
        
        geometry.add(boxCircleBox);
    }
}
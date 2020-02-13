/**
 * DrawComponents class for use in RecRecCirc
 * Draws a box, then a smaller circle within it, then another box
 */

package LabsMaven.MiniHWs;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class DrawComponents extends JComponent{

    public void paintComponent (Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box0 = new Rectangle(50,50,100,100);
        g2.draw(box0);

        Ellipse2D.Double ellipse = new Ellipse2D.Double(55,55,90,90);
        g2.draw(ellipse);

        Rectangle box1 = new Rectangle(75,75,55,55);
        g2.draw(box1);
    }
}
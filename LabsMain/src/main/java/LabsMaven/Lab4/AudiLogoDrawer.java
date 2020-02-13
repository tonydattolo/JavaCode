/**
 * AudiLogoDrawer class for use in Audi.java
 * Draws the audi logo, 4 circles, using different colors
 */

package LabsMaven.Lab4;

import java.awt.*;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;

/**
 * Draws audi logo
 */
public class AudiLogoDrawer extends JComponent {

    public void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;

        Ellipse2D.Double ring0 = new Ellipse2D.Double(55,50,50,50);
        g2.setColor(Color.BLUE);
        g2.draw(ring0);
        
        Ellipse2D.Double ring1 = new Ellipse2D.Double(90,50,50,50);
        g2.setColor(Color.GREEN);
        g2.draw(ring1);
        
        Ellipse2D.Double ring2 = new Ellipse2D.Double(125,50,50,50);
        g2.setColor(Color.MAGENTA);
        g2.draw(ring2);
        
        Ellipse2D.Double ring3 = new Ellipse2D.Double(160,50,50,50);
        g2.setColor(Color.RED);
        g2.draw(ring3);
    }
}
////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/21/20
//
//  Lab 6
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/21/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab6.pdf
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab6;

import java.awt.*;
import javax.swing.JComponent;

public class CheckBoardFiller extends JComponent {

    public void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;

        Polygon p = new Polygon();
        p.addPoint(x, y);
}
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
import javax.swing.JFrame;

public class CheckBoardFiller extends JComponent {

    private int size;

    /**
     * Constructor to set size of shapes to print on board
     * @param size the size or length and width of triangle
     */
    public CheckBoardFiller(int size) {
        this.size = size;
    }

    public void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i+j) % 2 != 0) {
                    int[] xPoints = {(j*size),((j+1)*size),((j+1)*size)};
                    int[] yPoints = {(i*size),(i*size),((i+1)*size)};
                    g2.setColor(Color.WHITE);
                    // g2.drawPolygon(xPoints, yPoints, 3);
                    g2.fillPolygon(xPoints, yPoints, 3);
                    int[] xPoints2 = {(j*size),(j*size),((j+1)*size)};
                    int[] yPoints2 = {(i*size),((i+1)*size),((i+1)*size)};
                    g2.setColor(Color.WHITE);
                    // g2.drawPolygon(xPoints2, yPoints2, 3);
                    g2.fillPolygon(xPoints2, yPoints2, 3);
                } else {
                    int[] xPoints = {(j*size),((j+1)*size),((j+1)*size)};
                    int[] yPoints = {(i*size),(i*size),((i+1)*size)};
                    g2.setColor(Color.BLACK);
                    // g2.drawPolygon(xPoints, yPoints, 3);
                    g2.fillPolygon(xPoints, yPoints, 3);
                    int[] xPoints2 = {(j*size),(j*size),((j+1)*size)};
                    int[] yPoints2 = {(i*size),((i+1)*size),((i+1)*size)};
                    g2.setColor(Color.BLACK);
                    // g2.drawPolygon(xPoints2, yPoints2, 3);
                    g2.fillPolygon(xPoints2, yPoints2, 3);
                }
            }
        }
    }
}
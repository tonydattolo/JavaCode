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

import javax.swing.JFrame;
import javax.swing.JComponent;

public class CheckBoard extends JComponent {

    public static void main(String[] args) {
        
        // // Initialize JFrame
        // JFrame display = new JFrame("Checker Board");

        // // Set initial JFrame values
        // display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // display.setSize(500,500);
        // display.setVisible(true);
        
        // // Create new instance of CheckBoardFiller class
        // CheckBoardFiller boxes = new CheckBoardFiller();
        
        // Add component to JFrame
        // display.add();
        
        // printCheckBoard(10);
    }

    public void printCheckBoard(int n) {
        

        int length = n;
        int width = n;

        // Initialize JFrame
        JFrame display = new JFrame("Checker Board");

        // Set initial JFrame values
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setSize(length*8,width*8);
        display.setVisible(true);

        // Graphics2D g2 = 
        // Polygon p = new Polygon();
        

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i % 2 == j % 2) {
                    //TODO
                } else {
                    //TODO
                }
            }
        }
        
    
    }

    // public void paintComponent(Graphics g) {
        
    //     Graphics2D g2 = (Graphics2D) g;

    //     Polygon p = new Polygon();
    //     // p.addPoint(x, y);
    
    // }
    
}

// for (i = 1; i <= 3; i++)
// {
// for (j = 1; j <= 5; j++)
// {
// if (i % 2 == j % 2) { Print "*" }
// else { Print " " }
// }
// System.out.println();
// }
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

        printCheckBoard(100);
        // printCheckBoard(50);
        // printCheckBoard(25);
        
        
    }

    public static void printCheckBoard(int n) {

        // Initialize JFrame
        JFrame display = new JFrame("Checker Board");

        // Set initial JFrame values
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // display.setSize(length*8,width*8);
        // display.setVisible(true);
        display.setUndecorated(true);
        display.setSize(n*8,n*8);
        display.setVisible(true);

        CheckBoardFiller cb = new CheckBoardFiller(n);

        display.add(cb);
        display.setVisible(true);
        
    
    }
}

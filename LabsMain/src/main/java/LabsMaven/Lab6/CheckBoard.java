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
import java.util.Scanner;
import javax.swing.JComponent;

public class CheckBoard extends JComponent {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of your checkerboard: ");
        int testCB = in.nextInt();
        printCheckBoard(testCB);
        System.out.println("Please enter the size of your checkerboard: ");
        int testCB2 = in.nextInt();
        printCheckBoard(testCB2);
        in.close();
        
    }

    public static void printCheckBoard(int n) {

        // Initialize JFrame
        JFrame display = new JFrame("Checker Board");

        // Set initial JFrame values
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setUndecorated(true);
        display.setSize(n*8,n*8);
        display.setVisible(true);

        CheckBoardFiller cb = new CheckBoardFiller(n);

        display.add(cb);
        display.setVisible(true);
        
    
    }
}

// package LabsMaven.Lab7;


// import java.awt.*;
// import java.util.*;
// import javax.swing.JComponent;
// import static java.lang.Math.*;


// public class DrawCannonball extends JComponent {

//         // Declare an array list here. This is what you
//         // will be drawing with
//         public ArrayList<Point> drawPoints;
        
//         // Constructor here that takes an 
//         // ArrayList as argument
//         public DrawCannonball(ArrayList<Point> arr) {
//             this.drawPoints = arr;
//         }
        
//         public void paint(Graphics g) {
//         // Go over all the points in your ArrayList and
//         // draw circles. You might wanna flip the y coord though
//         // using getheight()-y

//             // System.out.println(this.drawPoints);

//             for (int i = 0; i < this.drawPoints.size(); i++) {
//                 // if (drawPoints.get(i).getY() >= getHeight()) {
//                 //     g.setColor(Color.BLACK);
//                 //     g.drawOval((int) round(drawPoints.get(i).getX()),(int) round(drawPoints.get(i).getY()), 10, 10);
//                 //     g.fillOval((int) round(drawPoints.get(i).getX()),(int) round(drawPoints.get(i).getY()), 10, 10);
//                 // } else {
//                 //     g.setColor(Color.BLACK);
//                 //     g.drawOval((int) round(drawPoints.get(i).getX()),getHeight() - (int) round(drawPoints.get(i).getY()), 10, 10);
//                 //     g.fillOval((int) round(drawPoints.get(i).getX()),getHeight() - (int) round(drawPoints.get(i).getY()), 10, 10);
//                 // }
//                 g.setColor(Color.BLACK);
//                 g.drawOval((int) drawPoints.get(i).getX(),getHeight() - (int) drawPoints.get(i).getY(), 2, 2);
//                 g.fillOval((int) drawPoints.get(i).getX(),getHeight() - (int) drawPoints.get(i).getY(), 2, 2);
//             }
//         }
// }
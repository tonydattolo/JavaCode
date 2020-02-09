//  Lab 1 
//  
//  Released:  1/20/20
//
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  1/24/2020
//
//
//  Directions:  1. print out a series of *'s to the terminal
//               2. Answer: What fields does the System class have?
//               
//////////////////////////////////////////////////////////////////////////////////

// On system path package
package LabsMaven.Lab1;

// What fields does the System class have?
// err - error output stream
// in - standard output stream 
// out - standard output stream
// output stream is basically your terminal or integrated terminal

public class Lab1 {
    // Main method makes calls to shape methods defined within Lab1 class.
    public static void main(String[] args) {
        System.out.println("Lab 1");
        shape1();
        shape2();
        shape3();
        shape4();
        shape5();
        shape6();
        shape7();
        shape8();
        shape9();
        lineDivider();System.out.println("End of Program");

    }

    // Shape 1 method
    public static void shape1() {
        lineDivider(); System.out.println("1");
        int bangCount = 1;
        int spaceCount = 4;
        for (int i = 0; i < 5; i++) {
                                   
            System.out.println(" ".repeat(spaceCount) + "*".repeat(bangCount));
            bangCount+=2;
            spaceCount--;
        }
    }
    // Shape 2 method
    public static void shape2() {
        lineDivider(); System.out.println("2");
        int bangCount = 9;
        int spaceCount = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(spaceCount) + "*".repeat(bangCount));
            bangCount-=2;
            spaceCount++;
        }
    }
    // Shape 3 method
    public static void shape3(){
        lineDivider(); System.out.println("3");
        int bangCount = 5;
        int spaceCount = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("*".repeat(bangCount) + " ".repeat(spaceCount) + "*".repeat(bangCount));
            bangCount--;
            spaceCount+=2;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("*".repeat(bangCount) + " ".repeat(spaceCount) + "*".repeat(bangCount));
            bangCount++;
            spaceCount-=2;
        }
    }
    // Shape 4 method
    public static void shape4(){
        lineDivider(); System.out.println("4");
        int bangCount = 1;
        int spaceCount = 4;
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(spaceCount) + "*".repeat(bangCount));
            bangCount+=2;
            spaceCount--;
        }
        int bangCount2 = 7;
        int spaceCount2 = 1;
        for (int i = 0; i < 4; i++) {
            System.out.println(" ".repeat(spaceCount2) + "*".repeat(bangCount2));
            bangCount2-=2;
            spaceCount2++;
        }
    }
    // Shape 5 method
    public static void shape5(){
        lineDivider(); System.out.println("5");
        int bangCount = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("*".repeat(bangCount));
            bangCount++;
        }
    }
    // Shape 6 method
    public static void shape6(){
        lineDivider(); System.out.println("6");
        int bangCount = 5;
        int spaceCount = 0;
        for (int i = 0; i < 5; i++) {
                                   
            System.out.println("*".repeat(bangCount) + " ".repeat(spaceCount));
            bangCount--;
            spaceCount++;
        }
    }
    // Shape 7 method
    public static void shape7(){
        lineDivider(); System.out.println("7");
        int bangCount = 1;
        int spaceCount = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(spaceCount) + "*".repeat(bangCount));
            bangCount++;
            spaceCount--;
        }
    }
    // Shape 8 method
    public static void shape8(){
        lineDivider(); System.out.println("8");
        int bangCount = 5;
        int spaceCount = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(spaceCount) + "*".repeat(bangCount));
            bangCount--;
            spaceCount++;
        }
    }
    // Shape 9 method
    public static void shape9(){
        lineDivider(); System.out.println("9");
        System.out.println("      *");
        int spaceCountLeft = 5;
        int spaceCountRight = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(" ".repeat(spaceCountLeft) + "*" + " ".repeat(spaceCountRight) + "*");
            spaceCountLeft--;
            spaceCountRight+=2;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(" ".repeat(spaceCountLeft) + "*" + " ".repeat(spaceCountRight) + "*");
            spaceCountLeft++;
            spaceCountRight-=2;
        }
        System.out.println("      *");
    }
    // Line Divider method
    public static void lineDivider() {
        System.out.print("=============");       
    }

}
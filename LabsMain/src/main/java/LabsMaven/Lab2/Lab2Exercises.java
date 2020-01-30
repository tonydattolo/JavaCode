//  Lab 2 
//  
//  Released:  1/20/20
//
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  1/24/2020
//
//
//  Directions:  Implement the following methods 
//               
//               
//////////////////////////////////////////////////////////////////////////////////

// Note:  Do not need to explicitly import classes from java.lang but wanted to make it explicit 
// Goal - understand using Static classes - i.e. the Math class was not designed to be Instantiated (make objects) 
// It is a class that provides functionality and will be used to complete one of the methods

package LabsMaven.Lab2;

import java.lang.Math;
import java.util.Scanner;

public class Lab2Exercises {

    // test client 
    public static void main(String[] args) {
      //TODO: Modify to test all functions
      // Use Scanner to read inputs from user. Don't use Scanner in above functions!
      
  
      // Test printMeasurements() method    
      Scanner test = new Scanner(System.in);
      System.out.println("Enter shape side length (as int): ");
      int test1 = test.nextInt();
      System.out.println(printMeasurements(test1));

      // Test lineFunction() method
      System.out.println("Enter x1: ");
      double testx1 = test.nextDouble();
      System.out.println("Enter y1: ");
      double testy1 = test.nextDouble();
      System.out.println("Enter x2: ");
      double testx2 = test.nextDouble();
      System.out.println("Enter y2: ");
      double testy2 = test.nextDouble();
      System.out.println("The y-intercept of the line is: " + lineFunction(testx1, testy1, testx2, testy2)); 
      
      // Test addCommas() method
      System.out.println("Enter number (as int) to be converted to $x,x notation: ");
      int testCommas = test.nextInt();
      System.out.println(addCommas(testCommas));

    }
    
    // computes area of a square when given its side length
    public static int areaOfSquare(double sideLength) {
      int area = (int) Math.pow(sideLength, 2);
      return area;
      
    }

    // computes perimeter of a square when given its side length
    public static int perimeterOfSquare(double sideLength) {
      int perimeter = (int) (sideLength * 4);
      return perimeter;
    }

    // computes volume of a cubic when given its side length
    public static double volumeOfCube(double sideLength) {
      int volume = (int) Math.pow(sideLength, 3);
      return volume;
    }
       
    // returns a String with three lines in the following format:
    // On Line1: "Length of one Side of Square is: *
    // On Line2: "Area: *, Perimeter: **, Volume: **** " where * refers to area, ** refers to 
    // perimeter of square and *** refers to volume of the cube respectively. 
    public static String printMeasurements(int value) {
      String sideMeasure = Integer.toString(value);
      String areaMeasure = Integer.toString(areaOfSquare(value));
      String perimeterMeasure = Integer.toString(perimeterOfSquare(value));
      String volumeMeasure = Double.toString(volumeOfCube(value));
      String measurements = "Length of one Side of Square is: " + sideMeasure + "\nArea: "
                            + areaMeasure + ", Perimeter: " + perimeterMeasure
                            + ", Volume: " + volumeMeasure;
      return measurements;
      // return measurements;
    }
    
	// given two points (x1,y1) and (x2,y2) return y intercept 	of the line
    public static int lineFunction(double x1, double y1, double x2, double y2) {
      double slope = ((y2)-(y1)) / ((x2)-(x1));
      double b = y1 - (slope*x1);
      return (int) b;
    }

    // reads a number between 1000 and 1 Billion and prints it with commas (,) separating 
    // every three digits. for example: 12317910 will be printed as $12,317,910
    // hint use modulus (%) to save part of the number, then concatenate back together as a String
    public static String addCommas(int num) {
      String moneyString = Integer.toString(num);
      StringBuilder moneyStringCopy = new StringBuilder(moneyString);
      StringBuilder commas = new StringBuilder("");
      for (int i=moneyString.length(); i > 3; i-=3) {
        if (moneyStringCopy.length() > 3) {
          commas.insert(0, ","+moneyString.substring(i-3,i));
        }
        else {
          commas.insert(0,moneyString.substring(0, i));
        }
        moneyStringCopy.delete(i-3, i);
      }
      if (moneyStringCopy.length() != 0){
        commas.insert(0, moneyStringCopy);
        moneyStringCopy.delete(0, moneyStringCopy.length());
      }
      String moneyWithCommas = "$"+commas; 
      return moneyWithCommas;
    }
    
}

///////////////////////////////////
//                               //
// ANSER THE FOLLOWING QUESTIONS //
//                               //
///////////////////////////////////

/*
 * Questions 1-3 are on explicit and implicit casting of some numerical types  
 *
 * 1.  What happens if you multipy an int with a char? 
 *     Gives the unicode value of the char multiplied by the int value
 * 
 * 2.  What happens if you multipy a double with a char? 
 *     Gives the unicode value of the char multiplied by the int value
 * 
 * 3.  What happens if you square a char? 
 *     Gives the square of the unicode value of the char
 * 
 * 4.  What happens if a method has a paramater of type int, but you pass it a char?
 *     Returns the unicode value of the char
 * 
 * 5.  What happens if a mehtod has a paramater of type char, but you pass it an int? 
 *     Error, not applicable for the arguments (int)
 * 
 * 6.  What is the difference between two floating point primitive data types in the Java?
 *     Memory size: 4 bytes vs 8 bytes, precision of decimal digits: 7 vs 15
 * 
 * 7.  Consider the following code snippet.
 *     int i = 10;
 *     n = ++(i++);
 *     System.out.println(++(i++) % 5);
 * 
 *     Without Compiling the Program:
 *     What {do you think} are the values of i and n if the code is executed?
 *     What are the final value printed?
 *    
 *     n wasn't initialized so there's an error
 *      
 * 
 *     Now Compile and Run the Program to check your answers. If they are different, explain why 
 *     and provide updated code!
 * 
 *      n cannot be resolved to a variable
        Invalid argument to operation ++/--
        Invalid argument to operation ++/--

        There's multiple errors
        you cannot call increment and decrement on the same variable at the same time.
        Alternatively you could do the following, which would result in values 2,13,12 respectively

        int i = 10;
        int n = ++i;
        n++;
        ++i;
        System.out.println(i++ % 5);
        System.out.println(i);
        System.out.println(n);
 */     

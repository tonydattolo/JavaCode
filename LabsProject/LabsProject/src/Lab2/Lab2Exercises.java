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
// package Labs.Lab2;
import java.lang.Math;

public class Lab2Exercises {
    
    // computes area of a square when given its side length
    public static int areaOfSquare(double sideLength) {
      //TODO
      
    }

    // computes perimeter of a square when given its side length
    public static int perimeterOfSquare(double sideLength) {
      //TODO
    }

    // computes volume of a cubic when given its side length
    public static double volumeOfCube(double sideLength) {
      //TODO
    }
       
    // returns a String with three lines in the following format:
    // On Line1: "Length of one Side of Square is: *
    // On Line2: "Area: *, Perimeter: **, Volume: **** " where * refers to area, ** refers to 
    // perimeter of square and *** refers to volume of the cube respectively. 
    public static String printMeasurements(int value) {
      //TODO 
      // Please reuse any of the functions defined above.
    
    }
    
	// given two points (x1,y1) and (x2,y2) return y intercept 	of the line
    public static int lineFunction(double x1, double y1, double x2, double y2) {
      //TODO 
   
    }

    // reads a number between 1000 and 1 Billion and prints it with commas (,) separating 
    // every three digits. for example: 12317910 will be printed as $12,317,910
    // hint use modulus (%) to save part of the number, then concatenate back together as a String
    public static String addCommas(int num) {
      //TODO
    }
    
 
    // test client 
    public static void main(String[] args) {
      //TODO: Modify to test all functions
      // Use Scanner to read inputs from user. Don't use Scanner in above functions!
        
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
 * 
 * 2.  What happens if you multipy a double with a char? 
 * 
 * 3.  What happens if you square a char? 
 * 
 * 4.  What happens if a method has a paramater of type int, but you pass it a char?
 * 
 * 5.  What happens if a mehtod has a paramater of type char, but you pass it an int? 
 * 
 * 6.  What is the difference between two floating point primitive data types in the Java?
 * 
 * 7.  Consider the following code snippet.
 *     int i = 10;
 *     n = ++(i++);
 *     System.out.println(++(i++) % 5);
 * 
 *     Without Compiling the Program:
 *     What {do you think} are the values of i and n if the code is executed?
 *     What are the final value printed?
 *     Now Compile and Run the Program to check your answers. If they are different, explain why 
 *     and provide updated code!
 */

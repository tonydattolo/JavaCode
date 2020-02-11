/**
 * Week5ClassNotes
 */

package LabsMaven.ClassCode.Week5;

import java.util.ArrayList;
import java.util.Arrays;

public class Week5ClassNotes {

    
    public static void main(String[] args) {
        
        double[] values = new double[10]; // exclusive, space for 10 doubles.

        int[] more = {1,2,3,4,5}; // can initialize values of array with comma separated in braces

        // reference or memory address
        System.out.println(values);
        System.out.println(more);

        // access
        System.out.println(values[0]);
        System.out.println(more[4]);

        for (int i = 0; i < more.length; i++ ) { //.length is a member variable, not method!
            System.out.print(more[i] + " ");
        }
        System.out.println();
        // copy
            // same reference
        double[] another = values; // these point to the same reference point in memory

            //
        double[] copyArr0 = Arrays.copyOf(values, values.length); // copies the exact array
        double[] copyArr1 = Arrays.copyOf(values, 20); // copies, then adds 10 empty memory slots
        
        // to return 
            // public static int[] methodName(int x){}

        // using enumeration
        MonthOfTheYear thisMonth = MonthOfTheYear.FEB;
        if (thisMonth == MonthOfTheYear.JAN){
            System.out.println("January");
        } else {
            System.out.println("Not January");
        }

        // enhanced for loop
        for(int oneVal : more) //when you want to one use values and not access index
            System.out.print(oneVal + " ");
        
        System.out.println();


        int[] myInts = {1,2,3,4,5,6,7};
        int[] copyInts = Arrays.copyOf(myInts, myInts.length);
        System.out.println(myInts + " " );
        System.out.println(copyInts + " "); //note: 2 different memory locations, 2 different objects

        // Partially filled array, wastes memory basically
            // if you only want to print 10 of the 5000 locations in the array,
            // keep a second variable to track the slots you're using

        System.out.println();

        // 2D array
        int[][] counts0 = new int[5][5]; // all initialized with 0's
        int[][] counts1 = {{1,2,3,4,5},{11,22,33,44,55}}; // initialized with values

        for (int i = 0; i < counts0.length; i++) {
            for (int j = 0; j < counts0[0].length; j++) {
                System.out.print(counts0[i][j] + " ");
            }
        }

        // same iterator for both arrays to move diagonally
        ArrayList<String> friends = new ArrayList<>();

        System.out.println("# of friends: " + friends.size());
        friends.add("Jack");
        System.out.println("# of friends: " + friends.size());
        friends.add("John");
        friends.add("Michael");
        System.out.println("# of friends: " + friends.size());
        System.out.println(friends); // prints contents, versus memory loc like arrays

        friends.remove(1); //removes the object at the index location in the ArrayList
        System.out.println(friends);

        friends.set(0, "Jacob"); // replaces index loc object with new object

        // friends.replaceAll(operator);
        // friends.removeAll(c);

        // When to use ArrayList versus Array
            // fixed size, array
            // dynamic, arraylist

        // Check slides for table of wrapper classes

        ArrayList<Double> friends2 = new ArrayList<>(); // wrapper class of the double



    }

    public enum MonthOfTheYear {JAN, FEB, MAR, APR, MAY, JUN};
}
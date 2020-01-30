/**
 * rectangle0
 */

package LabsMaven.ClassCode;

import java.awt.*;
import java.util.Scanner;

public class rectangle0 {

    public static void main(String[] args) {
        Rectangle a = new Rectangle(1,1,2,2);
        System.out.println(a.toString());
        a.translate(10, 10);
        System.out.println(a);
        // a.resize(44, 44); deprecated. documentation gives new usage .setSize()
        a.setSize(10,10);
        System.out.println(a);


        System.out.println(Math.PI);

        Rectangle b = new Rectangle(15,15,10,10);
        System.out.println(b.toString());
        
        
        Rectangle c = new Rectangle(15,15,10,10); // 4 bytes for each int, 4 ints = 16 bytes

        // Comparisons
        System.out.println(a == b); // values of variables
        System.out.println(b.equals(c)); // memory location
        //out is a static PrintStream variable of theSystem class.
        //Static member usage:
            //Class.method
        
        
        System.out.printf("%.4f\n", Math.sqrt(Math.PI));
        System.out.printf("%7.4f\n", Math.sqrt(Math.PI));
        // System.out.printf("%-07.4f\n", Math.sqrt(Math.PI));
        // 0's for 007 and - for right aligned?

        Scanner sc = new Scanner(System.in);
        int var = 0;
        if (sc.hasNextInt()) {
            var = sc.nextInt();
        }
        System.out.println(var);
        String var2 = sc.next();

        int quantity = 666;
        double total = 6.66;
        System.out.printf("Quantity: %d Total: %10.2f",quantity,total);
    
        String name = "tony";
        char start = name.charAt(0);
        char last = name.charAt(name.length()-1);

        String jobTitle = "Agent";
        int employeeID = 7;
        String bond = jobTitle + employeeID;
    }
}
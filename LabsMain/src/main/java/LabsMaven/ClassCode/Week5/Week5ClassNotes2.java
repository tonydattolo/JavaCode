package LabsMaven.ClassCode.Week5;

/**
 * Week5ClassNotes2
 */
public class Week5ClassNotes2 {

    
    public static void main(String[] args) {

        
        double[] values0; //just a reference, an address in memory
        double[] values1 = new double[10]; // now you have 10 double values in memory. in java, all set to 0.0
        System.out.println(values1[0]);

        // **Should not use enhanced for look when you want to modify values in the original array
        for(double oneVal : values1) {
            oneVal += 5;
            System.out.print(oneVal + " ");
        }

        System.out.println();
        for (double oneVal : values1)
            System.out.print(oneVal + " ");

        int[] values = {1,2,3,4,5,6,7}
        //Remove element from array
        // values[pos] = 

        //
        // for (int i = pos + 1; i < current size; i++) {
        //     values[i-1] = values[i];
        // }
        // currentSize--;

        // Public vs Private Class
        // All member variables of a class, should be private.

        // Designing
        // What classes do we need
        //      Each class should do one thing only, Cohesion - separation of concerns
        // what should that class have functionality
        //      getters, setters, custom methods, etc
        //      Encapsulation - all members private, you will provide public methods to get/set values of private members

        // Inheritance - superclass, uses extend keyword
    
    
    }
}
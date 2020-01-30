////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  1/20/20
//
//  Lab 2
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  1/27/2020
//
//
//  Directions: See Below 
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab2;

// 1. Change the following program to use compound assignments, pre- or post- increment/decrement statements ONLY as appropriate.
class CompoundExercises {

     // Test output main method
     public static void main(String[] args) {
          System.out.println("===Part 1===");
          compoundOperators();
          System.out.println("===Part 2===");
          question1();
     }

     public static void compoundOperators(){
          
          int result = -1; // result is -1
          System.out.println(result);

          --result; // result is now -2
          System.out.println(result);

          result = result * -2; // result is now 4
          System.out.println(result);

          result = result / 2; // result is now 2
          System.out.println(result);

          result += 3; // result is now 5
          System.out.println(result);

          result = result % 3; // result is now 2
          System.out.println(result);
     }
     
// 2. In the following program, explain why the value "-4" is printed thrice in a row:
     public static void question1() {
        int i = -5;
        i++;
        System.out.println(i);    // "-4"
        ++i;                     
        System.out.println(i);    // "-3"
        System.out.println(--i);  // "-4"
        System.out.println(i--);  // "-4"
        System.out.println(++i);  // "-4"
     }

}

// ANSWERS
//
// 2. -4 is printed thrice in a row because of the way pre/post incrementing/decrementing works.
// Line 49: i is initialized to -5
// Line 50: i++; is executed, meaning the next time i is called, it's value will be i + 1
// Line 51: i is called, the expected -4 is shown
// Line 52: ++i; is executed, the value of i has changed to -3 because pre-incrementing changes
//             the value of the variable before its called
// Line 53: i is called, we see the expected result of -3
// Line 54: --i is called. Pre-decrementing means the value of i changes before it is called.
//             We see the expected -4
// Line 55: i-- is called, meaning the value of i won't decrement until the next call.
//             called value is still -4
// Line 56: the value of i here is -5, but because we pre-increment i in this next call,
//             the value is incremented before i is called, and thus we have -4
////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  1/20/20
//
//  Lab 2
//  @Author  Your Name and username
//  Last Edited:  
//
//
//  Directions: See Below 
//               
//////////////////////////////////////////////////////////////////////////////////

// 1. Change the following program to use compound assignments, pre- or post- increment/decrement statements ONLY as appropriate.
class CompoundExercises {

     public static void compoundOperators(){
          
          int result = -1; // result is -1
          System.out.println(result);

          result = result - 1; // result is now -2
          System.out.println(result);

          result = result * -2; // result is now 4
          System.out.println(result);

          result = result / 2; // result is now 2
          System.out.println(result);

          result = result + 3; // result is now 5
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
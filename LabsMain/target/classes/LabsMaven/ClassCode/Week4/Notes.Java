/**
 * Bitwise
 * <<
 * >>
 * >>>
 * 
 * Ternary Operator
 * ?:
 * 
 * Switch/Case
 * 
 * Numbering Systems and Conversions
 * 20 in binary
 *      Decimal Systems: Base 10 - 0,1,2,3,4,5,6,7,8,9 - 10^x power series of 10
 *          523 = 5x10^2 + 2x10^1 + 3x10^0
 * 
 *      Binary System: Base 2 - 0,1 - 2^x (all hardware in the world)
 *          10101
 *          2^4x1+2^3x0+2^2x1+2^1x0+2^0x1 = 21
 * 
 *      Hex: Base 16 - 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F - 16^x (all coding in the world)
 *          A35
 *          16^2xA + 16^1x3 + 16^0x5
 * 
 *      Octal: Base 8 - 0,1,2,3,4,5,6,7 - 8^x - (all the screen displays)
 *          312
 *          8^2x3 + 8^1x1 + 8^0x2
 * 
 * 
 */

public class Notes {
    
    public static void main(String[] args) {
        // switch (key) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }

        Integer x = new Integer(10); //creates object of type Integer
        int y = 10; //
        //need wrapper class to use it in array. boxing and unboxing
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toBinaryString(x));

        System.out.println(2<<2);
        System.out.println(8>>2);
        System.out.println(2<<2);
        
        
    }
}
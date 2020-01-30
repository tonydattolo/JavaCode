package LabsMaven.Lab2;

// import java.lang.StringBuilder;

/**
 * scrap
 */

 public class scrap {
    public static void main(String[] args) {
        System.out.println(lineFunction(-3.0, 0, 0, 4.0));
    }
    public static int lineFunction(double x1, double y1, double x2, double y2) {
        System.out.printf("x1: %f, y1: %f, x2: %f, y2: %f\n",x1,y1,x2,y2);
        double slope = ((y2)-(y1)) / ((x2)-(x1));
        double b = y1 - (slope*x1);
        return (int) b;
      }
}


///////////////////////////////////////////////////////////////////////////////////////////////////
// DISCARDED SCRAP
///////////////////////////////////////////////////////////////////////////////////////////////////
// 1. addCommas method testing

// public static void main(String[] args) {
//     // 12317910
//     // long money = 12317910;
//     int money = 777;
    
//     String moneyString = Integer.toString(money);
//     StringBuilder moneyStringCopy = new StringBuilder(moneyString);
//     StringBuilder commas = new StringBuilder("");
//     for (int i=moneyString.length(); i > 3; i-=3) {
//         if (moneyStringCopy.length() > 3) {
//             commas.insert(0, ","+moneyString.substring(i-3,i));
//         }
//         else {
//             commas.insert(0,moneyString.substring(0, i));
//         }
//         moneyStringCopy.delete(i-3, i);
//     }
//     if (moneyStringCopy.length() != 0){
//         commas.insert(0, moneyStringCopy);
//         moneyStringCopy.delete(0, moneyStringCopy.length());
//     }
//     String moneyWithCommas = "$"+commas; 
//     System.out.println(moneyWithCommas);
//     // return moneyWithCommas;
// }

///////////////////////////////////////////////////////////////////////////////////////////////////

// int x = 2;
// char a = 'A';
// double y = 3.0;
// // System.out.println(x*a);
// // System.out.println(a*y);
// // System.out.println(a*a);

// // test0('A');
// // test1(66);
// int i = 10;
// int n = ++i;
// n++;
// ++i;
// System.out.println(i++ % 5);
// System.out.println(i);
// System.out.println(n);
// }

// public static void test0(int n) {
// System.out.println(n);
// }

// public static void test1(char a) {
// System.out.println(a);
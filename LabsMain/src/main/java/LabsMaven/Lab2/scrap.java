package LabsMaven.Lab2;

// import java.lang.StringBuilder;

/**
 * scrap
 */

 public class scrap {
    public static void main(String[] args) {
        
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
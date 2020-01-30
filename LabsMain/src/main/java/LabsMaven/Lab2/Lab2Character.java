/**
 * Lab2Character class for Lab2
 * Takes an int from the user and prints char value of that int
 */
package LabsMaven.Lab2;

import java.util.Scanner;

public class Lab2Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an int value: ");
        int givenInt = sc.nextInt();
        sc.close();
        System.out.println(getCharFromInt(givenInt));
        
    }
    public static char getCharFromInt(int n) {
        return (char) n;
    }
}
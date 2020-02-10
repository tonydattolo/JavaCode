package LabsMaven.Lab4;

import java.util.Random;
import java.util.Scanner;

/**
 * scrapLab4
 */
public class scrapLab4 {

    public static void main(String[] args) {
        shape9();




    }
    public static void shape9() {

        String numbers = "";
        String randomNumbers = "";
        
        Random randomNums = new Random();

        // Generate 10 random numbers between 1-10
        for (int i = 0; i < 10; i++) {
            int num = randomNums.nextInt(9)+1;
            numbers += Integer.toString(num);
            if (!(i == 9)) {
                randomNumbers += Integer.toString(num) + ',';
            } else {
                randomNumbers += Integer.toString(num);
            }
            
        }
        System.out.println("Random Numbers = " + randomNumbers + "\nFrequency:");

        
        char removeMostFrequent = '0';
        int frequencyCounter = 0;

        // Count frequency values of each number
        for (int i = 1; i <= 10; i++) {
            int counter = 0;
            char num0 = Character.forDigit(i,10);
            // char num0 = (char)(i + '0');
            for (int j = 0; j < numbers.length(); j++) {
                char num1 = numbers.charAt(j);
                if (num0 == num1) {
                    counter++;
                }
            }
            
            //print out frequency of each num
            if (counter > 0) {
                System.out.println(i + " -> " + counter);
            }

            //check to see if number is most frequent
            //if it is, update new value to remove
            if (counter > frequencyCounter) {
                frequencyCounter = counter;
                removeMostFrequent = num0;
            }
        }

        // Remove most frequent number, and print comma separated string of values
        System.out.println("Deleting the Numbers with Max Frequency...");
        String randomNumbersRemoved = "";
        for (int i = 0; i < numbers.length(); i++) {
            if (!(numbers.charAt(i) == removeMostFrequent)) {
                if (i != numbers.length()-1) {
                    randomNumbersRemoved += numbers.charAt(i) + ",";
                } else {
                    randomNumbersRemoved += numbers.charAt(i);
                }
                
            }
        }
        System.out.println("Random Numbers = " + randomNumbersRemoved);
    }
}
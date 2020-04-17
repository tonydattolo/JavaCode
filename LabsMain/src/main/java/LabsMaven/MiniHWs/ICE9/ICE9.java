package LabsMaven.MiniHWs.ICE9;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Iterator;

public class ICE9 {

    public static void main(String[] args) {

        System.out.println("    ICE9 PART 1");
        System.out.println("=====================");

        Random rn = new Random();
        int boundForKeys = 49;

        // Define letters to be used
        final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String letters2 = new String(LETTERS);

        Map<Integer, Character> randomMap = new HashMap<>();
        int randomNum;
        char randomChar;

        // Ensure there are at least 15 key value pairs
        while (randomMap.size() < 15) {

            // Generate random key numbers and characters as defined in LETTERS
            randomNum = 1 + rn.nextInt(boundForKeys);
            randomChar = letters2.charAt(rn.nextInt(letters2.length()));

            // Check to make sure they do not already exist within the key value pairs
            if (!(randomMap.containsKey(randomNum)) || !(randomMap.containsValue(randomChar))) {
                randomMap.put(randomNum, randomChar);
            }
        }

        System.out.println(randomMap);
        System.out.println("=====================\n");

        System.out.println("    ICE9 PART 2");
        System.out.println("=====================");


        Scanner in = new Scanner(System.in);
        Boolean success = false;

        // int userInput = in.nextInt();
        int numberOfAttempts = 0;


        while (!(success)) {

            System.out.println("Value Locator Tool!\nPlease enter a number: ");

            if (in.hasNextInt()) {
                int testInt = in.nextInt();
                if (randomMap.containsKey(testInt)) {
                    System.out
                            .println("The value for " + testInt + " is: " + randomMap.get(testInt));
                    success = true;
                } else {
                    System.out.println("Key not found! Try again...\n");
                    numberOfAttempts++;
                    if (numberOfAttempts >= 2) {
                        System.out.println("Maybe this will help...\n" + randomMap + "\n");
                    }
                }

            } else {
                System.out.println("Error: Please enter an integer");
            }
        }

    }
}

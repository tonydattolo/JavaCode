package LabsMaven.ClassCode.InputOutput_Recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadingWordsChars {

    public static void main(String[] args) throws FileNotFoundException {
        File fileInput = new File("input.txt");
        Scanner in = new Scanner(fileInput);   
        
        // Discards anything that isn't a letter, punctuation, letters, etc.
        in.useDelimiter("[^A-Za-z]+");

        // Read file one char at a time, eg for encryption
        in.useDelimiter("");

        // Each call to next returns a string with a single char
        while (in.hasNext()) {
            char ch = in.next().charAt(0);
            // Do something
        }

        // Character class testing methods
        // Character.isDigit(ch);      // 0,1,2
        // Character.isLetter(ch);     // A,B,C,a,b,c
        // Character.isUpperCase(ch);  // A,B,C
        // Character.isLowerCase(ch);  // a,b,c
        // Character.isWhitespace(ch); // newline, space, tab

        // Trimming Files with Strings and Number COdes

        while (in.hasNextLine()) {
            String line = in.nextLine();
        }
        int i = 0;
        while (!Character.isDigit(line.charAt(i))) { // Finds the point where the digit values start
            i++;
        }
        String countryName = line.substring(0, i);
        countryName = countryName.trim();
        String population = line.substring(i);

        // Scanning a String
        Scanner lineScanner = new Scanner(line);
        String countryName = lineScanner.next(); // read first word
        while(!lineScanner.hasNextInt()) { // Add more words to countryName until number encountered
            countryName += " " + lineScanner.next();
        }

        // Converting Strings to Numbers
        // int populationValue = Integer.parseInt(population);
        int populationValue = Integer.parseInt(population.trim());

        // Avoiding Errors when Reading Numbers (input mismatch exception)
        if (in.hasNextInt()) {
            int value = in.nextInt();
        }

        // Mixing Number, Word, and Line Input
        // China
        // 3274987324
        // India....
        // ****have to CONSUME newlines
        while (in.hasNextLine()) {
            String countryName = in.nextLine();
            int population = in.nextInt();
            in.nextLine(); // Consumes newline
        }

        // Formatting Output, printf options
        // System.out.printf("%-10s%10.2f", items[i] + ":" + prices[i]); // - hyphen signals to left align, aligns right by default
        // Format Flags
            // -    left alignment                      1.23 followed by spaces
            // 0    show leading zeroes                 001.23
            // +    show plus sign for pos nums         +1.23
            // (    () around neg nums                  (1.23)
            // ,    show decimal separators             12,300
            // ^    convert letters to uppercase        1.23E+1

        // Format Specifier Structure
        // %[flags][field width][optional precision for floating points][format type]
        
        // Format Types
            // d    decimal integer                     123
            // f    fixed floating-point                12.30
            // e    exponential floating-point          1.23e+1
            // g    general gloating point              12.3
            // s    string                              aString


        // Regular expression - a character pattern
            // grep is a program that allows you to run regex commands from a command line or compilation environment
            // grep [0-9]+ Homework.java
            // grep [^A-za-z][0-9]+
        // .useDelimiter() uses regex commands
            // String[] tokens = line.split("\\s+"); // splits string into an array of strings with delimiter specified as regex
            // word.replaceAll("[aeiou]", ""); // word with all vowels removed

        // Reading an Entire File
            // String filename = ...;
            // List<String> lines = Files.readAllLines(Paths.get(filename));
            // String content = new String(Files.readAllBytes(Paths.get(filename)));

        // Command Line Arguments - good for automation through batch files or shell scripts
            // java ProgramClass -v input.dat
            // 





    }
}
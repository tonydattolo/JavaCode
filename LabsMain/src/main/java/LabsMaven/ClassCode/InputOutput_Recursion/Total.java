package LabsMaven.ClassCode.InputOutput_Recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Total {

    public static void main(String[] args) throws FileNotFoundException {
        
        // Prompt for input and outfile file names
        Scanner console = new Scanner(System.in); // Scanner for terminal input
        System.out.println("Input file: ");
        String inputFileName = console.next();
        System.out.println("Output file: ");
        String outputFileName = console.next();

        // Construct scanner and pritnwriter objects for reading and wiriting
        File inputFile = new File(inputFileName);
        // ***dont forget 2 backslashes for file names
        File inputFile2 = new File("LabsMain\\src\\main\\java\\LabsMaven\\ClassCode\\InputOutput_Recursion\\input.txt");
        
        // ***dont forget to use File object and not string ("input.txt")
        Scanner in = new Scanner(inputFile); // Scanner for file reading input
        // ***or
        Scanner in2 = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(outputFileName);

        // Read input and write output
        double total = 0;
        while (in.hasNextDouble()) {
            double value = in.nextDouble();
            out.printf("%15.2f\n", total);
            total += value;
        }
        out.printf("TOtal: %8.2f\n", total);

        console.close();
        in.close();
        out.close();

        // Dealing with weird characters from other languages
        // Scanner in = new Scanner(file, "UTF-8");
        // PrintWriter out = new PrintWriter(file, "UTF-8");

    }
}
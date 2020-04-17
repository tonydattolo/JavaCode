package LabsMaven.ClassCode.InputOutput_Recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ReadingWritingFiles
 */
public class ReadingWritingFiles {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("input.txt");

        Scanner in = new Scanner(inputFile);

        PrintWriter out = new PrintWriter("output.txt");
        out.println("Hello, World!");

        
        int total = 0;
        while (in.hasNextDouble()) {
            double value = in.nextDouble();
            total += value;
        }

        
        out.printf("Total: %8.2f\n", total);
        in.close();
        out.close();

    }
}
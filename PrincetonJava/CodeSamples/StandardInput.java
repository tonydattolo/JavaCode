package PrincetonJava.CodeSamples;
import java.util.*;

public class StandardInput {

    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        System.out.println("Enter Username: ");

        String userName = test.nextLine();
        System.out.println("Username is: " + userName);
    }
}
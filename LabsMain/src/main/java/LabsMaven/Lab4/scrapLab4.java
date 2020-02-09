package LabsMaven.Lab4;

/**
 * scrapLab4
 */
public class scrapLab4 {

    public static void main(String[] args) {
        shape9(5);
        shape9(9);
        shape9(3);
        // shape9(1);
        shape9(2);
    }
    public static void shape9(int n) {

        int leftSpace = n-1;
        int midSpace = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(" ".repeat(leftSpace) + "*");
                leftSpace--;
            } else if (i < n-1) {
                System.out.println(" ".repeat(leftSpace) + "*" + " ".repeat(midSpace) + "*");
                leftSpace--;
                midSpace+=2;
            } else {
                System.out.println("*".repeat(n*2-1));
            }
        }
    }
}
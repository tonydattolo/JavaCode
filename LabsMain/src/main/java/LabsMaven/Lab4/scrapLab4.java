package LabsMaven.Lab4;

/**
 * scrapLab4
 */
public class scrapLab4 {

    public static void main(String[] args) {
        shape9(5);
        // shape9(9);
        // shape9(3);
        // // shape9(1);
        // shape9(2);
    }
    public static void shape9(int n) {

        int spaceCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("x".repeat(spaceCount));
            spaceCount++;
            for (int j = 1; j <= n; j++) {
                if (!(j < i)){
                    System.out.print(" "+ j);    
                }
            }
        }


    }
}
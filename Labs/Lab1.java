package Labs;

/**
 * Lab1
 * This assignment is for Lab1 in C212.
 * The task is to print out a series of *'s to the terminal.
 */
public class Lab1 {
    // Main method makes calls to shape methods defined within Lab1 class.
    public static void main(String[] args) {
        System.out.println("Lab 1");
        lineDivider();
        shape1();
        lineDivider();
        
    }

    // Shape 1 method
    public static void shape1() {
        int maxBangs = 9;
        int bangCount = 1;
        int spaceCount = 4;
        for ( int i = 0; i < 5; i++){
                                   
            System.out.println(" ".repeat(spaceCount) + "*".repeat(bangCount) + " ".repeat(spaceCount));
            bangCount+=2;
            spaceCount--;
        }
    }
    // Shape 2 method
    public void shape2(){

    }
    // Shape 3 method
    public void shape3(){

    }
    // Shape 4 method
    public void shape4(){

    }
    // Shape 5 method
    public void shape5(){

    }
    // Shape 6 method
    public void shape6(){

    }
    // Shape 7 method
    public void shape7(){

    }
    // Shape 8 method
    public void shape8(){

    }
    // Shape 9 method
    public void shape9(){

    }
    // Line Divider method
    public static void lineDivider() {
        System.out.println("=============");       
    }

}
package LabsMaven.ClassCode.Week5;

/**
 * C212Spring2020
 */
public class C212Spring2020 {

    public static void main(String[] args) {
        Student one = new Student();
        System.out.println(one);
 
        Student[] many = new Student[240];

        for (int i = 0; i < 240; i++) {
            Student oneStudent = new Student();
            many[i] = oneStudent;
        }
 
    }
}
package LabsMaven.ClassCode.Week5;

import java.util.Arrays;

/**
 * Student
 */
public class Student {

    private String studentName;
    private int studentID;
    private int[] grades;
    private char studentFinalGrade;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName1) {
        this.studentName = studentName1;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID1) {
        this.studentID = studentID1;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades1) {
        this.grades = grades1;
    }

    public char getStudentFinalGrade() {
        return studentFinalGrade;
    }

    public void setStudentFinalGrade(char studentFinalGrade1) {
        this.studentFinalGrade = studentFinalGrade1;
    }

    @Override
    public String toString() {
        return "Student [grades=" + Arrays.toString(grades) + ", studentFinalGrade=" + studentFinalGrade
                + ", studentID=" + studentID + ", studentName=" + studentName + "]";
    }


    //Generate constructors, no field selected
    public Student() {
        studentName = "No Name";
        studentID = 0;
        // studentGrades;
        studentFinalGrade = 'N';
    }

    //Generate constructors, only studentName and studentID selected.
    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    
}
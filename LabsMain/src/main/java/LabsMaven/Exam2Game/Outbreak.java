package LabsMaven.Exam2Game;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import LabsMaven.Exam2Game.*;
import static java.lang.Math.*;

public class Outbreak extends JFrame {


    JPanel outbreak;

    public Outbreak(int numberOfPerson) {
        super();

        this.setTitle("Outbreak!");
        this.outbreak = new CitizenDriver(numberOfPerson);
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        this.setFocusable(true);
        this.requestFocus();

        this.add(outbreak);


    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to Outbreak Simulator!");
        System.out.println("Please enter the number of people in your town:");
        int userValue = in.nextInt();
        
        // int userValue = 50;
        JFrame window = new Outbreak(userValue);

    }

}
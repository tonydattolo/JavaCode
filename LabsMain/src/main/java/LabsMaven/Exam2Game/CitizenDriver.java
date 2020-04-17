package LabsMaven.Exam2Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import LabsMaven.Exam2Game.*;
import static java.lang.Math.*;


public class CitizenDriver extends JPanel implements ActionListener {


    private Timer timer;
    public Random rn = new Random();
    public final int FRAME_WIDTH = 800;
    public final int FRAME_HEIGHT = 800;
    ArrayList<Citizen> townsfolk;
    ArrayList<Citizen> infectedUpdate;

    private int totalHealthy = 0;
    private int totalInfected = 0;
    private int totalRecovered = 0;

    public final Color HEALTHY = Color.BLUE;
    public final Color INFECTED = Color.RED;
    public final Color RECOVERED = Color.PINK;

    // final JLabel totalHealthyLabel = new JLabel();
    // final JLabel totalInfectedLabel = new JLabel();
    // final JLabel totalRecoveredLabel = new JLabel();
    JLabel totalHealthyLabel;
    JLabel totalInfectedLabel;
    JLabel totalRecoveredLabel;

    public CitizenDriver(int numberOfCitizens) {

        this.totalHealthyLabel = new JLabel("Total Healthy: " + this.getTotalHealthy());
        this.totalInfectedLabel = new JLabel("Total Infected: " + this.getTotalInfected());
        this.totalRecoveredLabel = new JLabel("Total Recovered: " + this.getTotalRecovered());


        timer = new Timer(1000 / 60, this);
        timer.start();

        this.setBackground(Color.LIGHT_GRAY);
        
        this.townsfolk = new ArrayList<>();
        for (int i = 0; i < numberOfCitizens; i++) {
            Citizen person = new Citizen();
            townsfolk.add(person);
            this.setTotalHealthy(this.getTotalHealthy() + 1);;
        }
        int randomStartSick = rn.nextInt(townsfolk.size()); 
        this.townsfolk.get(randomStartSick).setInfected();
        this.setTotalHealthy(this.getTotalHealthy() - 1);
        this.setTotalInfected(1);

        // Sets initial random direction each citizen will move in
        for (int i = 0; i < townsfolk.size(); i++) {
            int randomDirection = rn.nextInt(4);
            int dx = 0;
            int dy = 0;
            switch (randomDirection) {
                case 0:
                    dx = -1; dy = -1;
                    townsfolk.get(i).setDirectionX(dx);
                    townsfolk.get(i).setDirectionY(dy);	
					break;
				case 1:
                    dx = 1; dy = -1;
                    townsfolk.get(i).setDirectionX(dx);
                    townsfolk.get(i).setDirectionY(dy);
					break;
				case 2:
					dx = -1; dy = 1;
                    townsfolk.get(i).setDirectionX(dx);
                    townsfolk.get(i).setDirectionY(dy);
					break;
				case 3:
                    dx = 1; dy = 1;
                    townsfolk.get(i).setDirectionX(dx);
                    townsfolk.get(i).setDirectionY(dy);
				default:
					break;
            }
        }

        this.infectedUpdate = new ArrayList<>();
        this.add(totalHealthyLabel);
        this.add(totalInfectedLabel);
        this.add(totalRecoveredLabel);

        this.setVisible(true);
        this.setSize(this.FRAME_HEIGHT, this.FRAME_WIDTH);

        this.setFocusable(true);
        this.requestFocus();
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // this.add(new JLabel("Total Healthy: " + this.getTotalHealthy()));
        // this.add(new JLabel("Total Infected: " + this.getTotalInfected()));
        // this.add(new JLabel("Total Recovered: " + this.getTotalRecovered()));
        this.totalHealthyLabel.setText("Total Healthy: " + this.getTotalHealthy());
        this.totalInfectedLabel.setText("Total Infected: " + this.getTotalInfected());
        this.totalRecoveredLabel.setText("Total Recovered: " + this.getTotalRecovered());
        

        // Start movement
        for (int i = 0; i < townsfolk.size(); i++) {
            townsfolk.get(i).moveLocation();
        }

        // Check if citizens are hitting boundaries
        for (int i = 0; i < townsfolk.size(); i++) {
            if (townsfolk.get(i).getX() >= this.FRAME_WIDTH - 30 || townsfolk.get(i).getX() <= 1) {
                int currDir = townsfolk.get(i).getDirectionX();
                townsfolk.get(i).setDirectionX(currDir * -1);
            }
            if (townsfolk.get(i).getY() >= this.FRAME_HEIGHT - 45 || townsfolk.get(i).getY() <= 1) {
                int currDir = townsfolk.get(i).getDirectionY();
                townsfolk.get(i).setDirectionY(currDir * -1);
            }
        }

        // Check timers on infected, recover after 14, update totals
        for (int i = 0; i < townsfolk.size(); i++) {
            if (townsfolk.get(i).getFillColor() == Color.RED) {
                townsfolk.get(i).addTimeSick();
                if (townsfolk.get(i).getTimeSick() == 14 * 60) {
                    townsfolk.get(i).setRecovered();
                    this.setTotalInfected(this.getTotalInfected() - 1);
                    this.setTotalRecovered(this.getTotalRecovered() + 1);
                }
            }
        }

        // Spread infection, start timer.

        // Check if nearby shapes are infected, and spread if so
        for (int i = 0; i < townsfolk.size(); i++) {
            for (int j = 0; j < townsfolk.size(); j++) {
                if (i != j) {
                    if ((abs(townsfolk.get(i).getX() - townsfolk.get(j).getX()) < 8) && (abs(townsfolk.get(i).getY() - townsfolk.get(j).getY()) < 8)) {
                        int currDirX = townsfolk.get(i).getDirectionX();
                        townsfolk.get(i).setDirectionX(currDirX * -1);
                        int currDirY = townsfolk.get(i).getDirectionY();
                        townsfolk.get(i).setDirectionX(currDirY * -1);
                        
                        currDirX = townsfolk.get(j).getDirectionX();
                        townsfolk.get(j).setDirectionX(currDirX * -1);
                        currDirY = townsfolk.get(j).getDirectionY();
                        townsfolk.get(j).setDirectionX(currDirY * -1);

                        if (townsfolk.get(i).getFillColor() == HEALTHY && townsfolk.get(j).getFillColor() == INFECTED) {
                            townsfolk.get(i).setFillColor(INFECTED);
                            this.setTotalHealthy(this.getTotalHealthy() - 1);
                            this.setTotalInfected(this.getTotalInfected() + 1);
                        } else if (townsfolk.get(i).getFillColor() == INFECTED && townsfolk.get(j).getFillColor() == HEALTHY) {
                            townsfolk.get(j).setFillColor(INFECTED);
                            this.setTotalHealthy(this.getTotalHealthy() - 1);
                            this.setTotalInfected(this.getTotalInfected() + 1);
                        }
                        
                        
                    }
                }
            }
        }
    
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Citizen citizen : townsfolk) {
            citizen.draw(g);
        }
    }

    public int getTotalHealthy() {
        return totalHealthy;
    }

    public void setTotalHealthy(int totalHealthy) {
        this.totalHealthy = totalHealthy;
    }

    public int getTotalInfected() {
        return totalInfected;
    }

    public void setTotalInfected(int totalInfected) {
        this.totalInfected = totalInfected;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }



}
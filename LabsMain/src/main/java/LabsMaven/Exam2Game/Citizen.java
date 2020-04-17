package LabsMaven.Exam2Game;

import java.awt.*;
import java.util.Random;
import static java.lang.Math.*;



public class Citizen {

    
    // private Boolean infected;
    // private Boolean healthy;
    // private Boolean recovered;
    public Random rn = new Random();
    private Color fillColor;
    public final Color HEALTHY = Color.BLUE;
    public final Color INFECTED = Color.RED;
    public final Color RECOVERED = Color.PINK;

    private int timeSick = 0;

    private Point location;
    private final int PERSON_RADIUS = 15;
    
    private int centerX;
    private int centerY;

    private int directionX;
    private int directionY;

    public Citizen() {
        this.fillColor = this.HEALTHY;
        this.location = new Point(rn.nextInt(800),rn.nextInt(800));

    }


    public void draw(Graphics g) {
        g.setColor(this.getFillColor());
        g.drawOval(this.getX(), this.getY(), this.getPersonRadius(), this.getPersonRadius());
        g.fillOval(this.getX(), this.getY(), this.getPersonRadius(), this.getPersonRadius());

    }

    public void setHealthy() {
        this.fillColor = HEALTHY;
    }

    public void setInfected() {
        this.fillColor = INFECTED;
    }

    public void setRecovered() {
        this.fillColor = RECOVERED;
    }

    public Color getFillColor() {
        return this.fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Point getLocation() {
        return this.location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public int getX() {
        return this.location.x;
    }

    public void setX(int n) {
        this.location.x = n;
    } 

    public int getY() {
        return this.location.y;
    }

    public void setY(int n) {
        this.location.y = n;
    }

    public int getPersonRadius() {
        return this.PERSON_RADIUS;
    }

    public void moveLocation() {
        this.setX(this.getX() + this.getDirectionX());
        this.setY(this.getY() + this.getDirectionY());
    }


    public int getDirectionX() {
        return directionX;
    }


    public void setDirectionX(int directionX) {
        this.directionX = directionX;
    }


    public int getDirectionY() {
        return directionY;
    }


    public void setDirectionY(int directionY) {
        this.directionY = directionY;
    }


    public int getCenterX() {
        int pythaMidPt = (int) (this.getX() + (sqrt(pow(getPersonRadius(), 2) + pow(getPersonRadius(), 2))));
        this.centerX = pythaMidPt;
        return this.centerX;
    }


    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        int pythaMidPt = (int) (this.getY() + (sqrt(pow(this.getPersonRadius(), 2) + pow(this.getPersonRadius(), 2))));
        this.centerY = pythaMidPt;
        return this.centerY;
    }


    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }


    public int getTimeSick() {
        return timeSick;
    }


    public void addTimeSick() {
        this.timeSick++;
    }


}
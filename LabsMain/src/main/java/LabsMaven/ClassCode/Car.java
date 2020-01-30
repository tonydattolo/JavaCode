/**
 * Car class
 * GETTERS AND SETTERS IN VSCODE:
 * https://twitter.com/vscodejava/status/1075134977749213184?lang=en
 */

package LabsMaven.ClassCode;

public class Car {
    int year;
    String make;
    String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void getCarInfo() {
        System.out.printf("\nCar Info: Make: %s, Model: %s, Year: %s",make,model,year);
    }
}
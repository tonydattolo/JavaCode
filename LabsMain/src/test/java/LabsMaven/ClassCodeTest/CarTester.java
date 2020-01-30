/**
 * CarTester
 */

package LabsMaven.ClassCodeTest;

import LabsMaven.ClassCode.Car;

public class CarTester {

    public static void main(String[] args) {
        Car one = new Car();
        one.setYear(2016);
        one.setMake("Nissan");
        one.setModel("Altima");
        
        System.out.println();        
        one.getCarInfo(); // prints all info
    }
}
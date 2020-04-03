package LabsMaven.ClassCode.scrap.UML;

public class CustomerAddress extends Address {

    private int customerID;

    public CustomerAddress(String street, int houseNumber, int customerID) {
        super(street, houseNumber);
        this.customerID = customerID;
    }
}
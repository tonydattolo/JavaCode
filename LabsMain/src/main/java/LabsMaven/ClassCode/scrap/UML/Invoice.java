package LabsMaven.ClassCode.scrap.UML;

public class Invoice implements Printable {
    private int customerID;
    private int lineItemNumber;

    private int total;

    public int getProductCost(Product aProduct) {
        return aProduct.getProductCost();
    }
    
}
package LabsMaven.ClassCode.scrap.UML;

public class Product {
    private int productID;
    private int productCost;
    private boolean inStock;

    public Product(int productCost, int productID, boolean inStock){
        this.productCost = productCost;
        this.productID = productID;
        this.inStock = inStock;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductCost() {
        return productCost;
    }

    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
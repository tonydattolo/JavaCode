package LabsMaven.ClassCode.scrap;

public class Motorcycle extends Vehicle
{
   private String model;
   private int numberAxles;
   public Motorcycle(String type, int numberAxles, String modelName){
        super(type);
        this.numberAxles = numberAxles;
        this.model = modelName;
   }
}
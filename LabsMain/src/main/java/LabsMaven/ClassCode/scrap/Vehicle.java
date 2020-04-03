package LabsMaven.ClassCode.scrap;


public class Vehicle
{
   private String style;
   public Vehicle(String style)
   {
      this.style = style;
   }
   public String displayInfo()
   {
      return “Vehicle”+style;
   }
}
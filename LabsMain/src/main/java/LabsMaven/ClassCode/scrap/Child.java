package LabsMaven.ClassCode.scrap;

public class Child extends Parent
{
   public int getValue() {
      return -7;
   }

   public static void main(String[] args) {
    Parent kid = new Child();
    Parent adult = new Parent();
    kid.display();
    adult.display();
    
   }
}
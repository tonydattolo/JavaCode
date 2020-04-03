package LabsMaven.ClassCode.scrap;

public class Checker
{
   public static int count = 0;
   public int number = 0;
   public Checker()
   {
      count++;
      number++;
   }
   public int getCount() { return count; }
   public int getNumber() { return number; }

   public static void main(String[] args) {
    Checker one = new Checker();
    Checker two = new Checker();
    System.out.println(one.getCount() + " " + two.getCount());
    System.out.println(one.getNumber() + " " + two.getNumber());
   }
}
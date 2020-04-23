package LabsMaven.Lab7;

public class ComplexDriver {
    public static void main(String[] args) {
        StandardComplex z1 = new StandardComplex(-1, Math.sqrt(3));
        PolarComplex z2 = new PolarComplex(2, 5 * Math.PI / 3);
        System.out.printf("%35s%s\n", "-------------------z", "1-------------------");
        System.out.printf("%35s: %s%n", "a StandardComplex", z1.getStandardComplex());
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s %s%n", "convert to " + "PolarComplex", z1.getPolarComplex().toString());
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s\n%35s %s%n", "check equality between", z1, " and ", z1.getPolarComplex(), z1.isEqual(z1.getPolarComplex()));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s\n%35s %s%n", "check equality between", z1.getPolarComplex(), " and ", z1, z1.getPolarComplex().isEqual(z1));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s %s%n", "convert PolarComplex", " back to StandardComplex", z1.getPolarComplex().getStandardComplex());
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s\n%35s %s%n", "check equality between", "original StandardComplex", " and ", "the new StandardComplex", z1.isEqual(z1.getPolarComplex().getStandardComplex()));

        System.out.printf("%35s%s\n", "-------------------z", "2-------------------");
        System.out.printf("%35s: %s%n", "a PolarComplex", z2.getPolarComplex());
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s %s%n", "convert to " + "StandardComplex", z2.getStandardComplex());
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s\n%35s %s%n", "check equality between", z2, " and ", z2.getStandardComplex(), z2.isEqual(z2.getStandardComplex()));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s\n%35s %s%n", "check equality between", z2.getStandardComplex(), " and ", z2, z2.getStandardComplex().isEqual(z2));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s %s%n", "convert StandardComplex", " back to PolarComplex", z2.getStandardComplex().getPolarComplex());
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s\n%35s %s%n", "check equality between", "original PolarComplex", " and ", "the new PolarComplex", z2.isEqual(z2.getStandardComplex().getPolarComplex()));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");

        System.out.printf("%35s\n%35s\n%35s %s%n", z1, "add", z2, z1.add(z2));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s %s%n", z1, "subtract", z2, z1.subtract(z2));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s %s%n", z1, "multiply", z2, z1.multiply(z2));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s %s%n", z1, "divide", z2, z1.divide(z2));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");

        System.out.printf("%35s\n%35s\n%35s %s%n", z2, "add", z1, z2.add(z1));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s %s%n", z2, "subtract", z1, z2.subtract(z1));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s %s%n", z2, "multiply", z1, z2.multiply(z1));
        System.out.printf("%35s%s\n", "--------------------", "--------------------");
        System.out.printf("%35s\n%35s\n%35s %s%n", z2, "divide", z1, z2.divide(z1));
    }
}
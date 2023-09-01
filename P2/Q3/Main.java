package P2.Q3;

public class Main {
    public static void main(String[] args) {
        UnitConverter uc = new UnitConverter();
        double inch = 1.0;
        double cm = 5.0;
        System.out.printf("%-10s%-20s\n", "Inches", "Centimeters");
        for (; inch <= 10.0; inch += 1.0) {
            System.out.printf("%-10.1f%-20.2f\n", inch, uc.inchToCentimeter(inch));
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("%-20s%-10s\n", "Centimeters", "Inches");
        for (; cm <= 50.0; cm += 5.0) {
            System.out.printf("%-20.1f%-10.2f\n", cm, uc.centimeterToInch(cm));
        }
    }
}

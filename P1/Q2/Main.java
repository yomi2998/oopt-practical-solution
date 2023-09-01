package P1.Q2;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age (years): ");
        int age = s.nextInt();
        System.out.println("Age in years: " + age + " years");
        System.out.println("Age in days: " + (age * 365) + " days");
        System.out.println("Age in seconds: " + (age * 365 * 24 * 60 * 60) + " seconds");
    }
}

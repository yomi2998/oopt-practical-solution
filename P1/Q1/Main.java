package P1.Q1;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();
        System.out.print("Enter your year of study: ");
        int year = s.nextInt();
        System.out.print("What is your target GPA for this semester? ");
        double targetGPA = s.nextDouble();
        System.out.println("Welcome " + name + "!");
        System.out.println("Work hard to achieve your target GPA of " + targetGPA + " this semester of your Year " + year + ".");
    }
}

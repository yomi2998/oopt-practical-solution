package P5.Q2;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = "";
        System.out.print("Enter a string: ");
        str = s.nextLine();
        System.out.println("Modified string: " + new StringConverter().convert(str));
        s.close();
    }
}

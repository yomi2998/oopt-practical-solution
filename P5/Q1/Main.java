package P5.Q1;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = "";
        char ch = ' ';
        System.out.print("Enter a word: ");
        str = s.nextLine();
        System.out.print("Enter the letter you want to count: ");
        ch = s.nextLine().charAt(0);
        System.out.println(str + " contains " + LetterCounter.countLetter(str, ch) + ch);
        s.close();
    }
}

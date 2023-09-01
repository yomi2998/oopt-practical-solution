package P2.Q1;

public class Main {
    public static void main(String args[]) {
        System.out.printf("%-10s%-20s\n", "Number", "SquareRoot");
        for (int i = 0; i <= 20; i += 2)
            System.out.printf("%-10d%-20.4f\n", i, Math.sqrt(i));
    }
}

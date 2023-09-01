package P3.Q3;

import java.util.Scanner;

public class Banking {

    public static void main(String args[]) {
        int[] banknote = { 100, 50, 20, 10, 5, 1 };
        int[] qty = new int[banknote.length];

        for (int i = 0; i < banknote.length; ++i) {
            boolean proc_done = false;
            while (!proc_done) {
                try {
                    proc_done = false;
                    Scanner s = new Scanner(System.in);
                    System.out.print("Enter amount for RM " + banknote[i] + ": ");
                    qty[i] = s.nextInt();
                    if (qty[i] < 0) {
                        throw new Exception();
                    }
                    proc_done = true;
                } catch (Exception e) {
                    System.out.println("Invalid amount, please try again.");
                }
            }
        }

        System.out.printf("Before:\n\n");
        System.out.printf("%-20s%-10s\n", "Denomination (RM)", "Quantity");
        for (int i = 0; i < banknote.length; ++i) {
            System.out.printf("%-20d%-10d\n", banknote[i], qty[i]);
        }

        System.out.printf("\n\nAfter:\n\n");
        System.out.printf("%-20s%-15s%-15s\n", "Denomination (RM)", "Quantity", "Value (RM)");
        int total = 0;
        for (int i = 0; i < banknote.length; ++i) {
            if (qty[i] == 0)
                continue;
            int val = banknote[i] * qty[i];
            System.out.printf("%-20d%-15d%-15d\n", banknote[i], qty[i], val);
            total += val;
        }
        System.out.println("Total: RM " + total);
    }
}
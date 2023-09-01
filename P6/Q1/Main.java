package P6.Q1;

public class Main {
    public static void main(String args[]) {
        int choice = 0;
        CurrentAccount current = new CurrentAccount();
        System.out.println("Transaction for current account");
        while (choice != 3) {
            choice = 0;
            System.out.println("-------------------------------");
            System.out.println("Current balance: " + current.getBalance());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.println("-------------------------------");
            System.out.print("Enter your choice: ");
            while (choice == 0)
                try {
                    java.util.Scanner input = new java.util.Scanner(System.in);
                    choice = input.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid input please try again.");
                }
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    try {
                        java.util.Scanner input = new java.util.Scanner(System.in);
                        double amount = input.nextDouble();
                        current.deposit(amount);
                    } catch (Exception e) {
                        System.out.println("Invalid input please try again.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    try {
                        java.util.Scanner input = new java.util.Scanner(System.in);
                        double amount = input.nextDouble();
                        current.withdraw(amount);
                    } catch (Exception e) {
                        System.out.println("Invalid input please try again.");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using our service.");
                    break;
                default:
                    System.out.println("Invalid input please try again.");
                    break;
            }
        }
    }
}
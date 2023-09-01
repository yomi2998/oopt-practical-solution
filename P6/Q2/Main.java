package P6.Q2;

public class Main {
    public static void main(String args[]) {
        CurrentAccount account = new CurrentAccount();
        account.setAccountNumber("1234567890");
        System.out.println(account.equals("1234567890"));
        System.out.println(account.equals("0987654321"));
        account.deposit(1000);
        account.withdraw(500);
        System.out.println(account.toString());
    }
}
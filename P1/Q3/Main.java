package P1.Q3;

import java.util.Scanner;

public class Main {
    public static int getValue(int val, int place) {
        int result = (val / place) % 10;
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 8-digit credit card number: ");
        int num = s.nextInt();
        int sum = getValue(num, 1) + getValue(num, 100) + getValue(num, 10000) + getValue(num, 1000000);
        int doubleSum = 0;
        for (int i = 0, j = 10; i < 4; ++i, j *= 100) {
            int bufferValue;
            bufferValue = getValue(num, j) * 2;
            bufferValue = bufferValue >= 10 ? getValue(bufferValue, 1) + getValue(bufferValue, 10) : bufferValue;
            doubleSum += bufferValue;
        }
        int totalSum = sum + doubleSum;
        System.out.println(totalSum);
        if (totalSum % 10 == 0) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

package P3.Q1;

import java.util.Scanner;

public class Quiz {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of quiz scores to process: ");
        final int quiz_cnt = s.nextInt();
        int sum = 0;
        int scores[] = new int[quiz_cnt];
        for (int i = 0; i < quiz_cnt; ++i) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = s.nextInt();
            sum += scores[i];
        }
        double avg = (double) sum / scores.length;
        int scoreHi = 0, scoreLo = 0;
        for (int i = 0; i < scores.length; ++i) {
            if (scores[i] < avg) {
                ++scoreLo;
            } else {
                ++scoreHi;
            }
        }
        System.out.println();
        System.out.println("Results");
        System.out.println("=======");
        System.out.println("Average is " + avg);
        System.out.println("Number of scores above or equal to the average is " + scoreHi);
        System.out.println("Number of scores below the average is " + scoreLo);
    }
}
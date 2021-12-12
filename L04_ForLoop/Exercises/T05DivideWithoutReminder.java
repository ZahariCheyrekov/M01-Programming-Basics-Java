package M01_ProgrammingBasics.L04_ForLoop.Exercises;

import java.util.Scanner;

public class T05DivideWithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            counter++;
            if (num % 2 == 0) {
                p1++;
            }
            if (num % 3 == 0) {
                p2++;
            }
            if (num % 4 == 0) {
                p3++;
            }
        }
        double p1Percent = 1.0 * p1 / counter * 100;
        double p2Percent = 1.0 * p2 / counter * 100;
        double p3Percent = 1.0 * p3 / counter * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
    }
}

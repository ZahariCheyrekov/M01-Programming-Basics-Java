package M01_ProgrammingBasics.L04_ForLoop.Exercises;

import java.util.Scanner;

public class T04Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            counter++;

            if (num < 200) {
                p1++;
            } else if (num < 400) {
                p2++;
            } else if (num < 600) {
                p3++;
            } else if (num < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        double p1Percent = 1.0 * p1 / counter * 100;
        double p2Percent = 1.0 * p2 / counter * 100;
        double p3Percent = 1.0 * p3 / counter * 100;
        double p4Percent = 1.0 * p4 / counter * 100;
        double p5Percent = 1.0 * p5 / counter * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
        System.out.printf("%.2f%%%n", p4Percent);
        System.out.printf("%.2f%%", p5Percent);
    }
}

package M01_ProgrammingBasics.ExamPrep.From2And3May2019;

import java.util.Scanner;

public class T05DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int divBy2 = 0;
        int divBy3 = 0;
        int divBy4 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                divBy2++;
            }
            if (number % 3 == 0) {
                divBy3++;
            }
            if (number % 4 == 0) {
                divBy4++;
            }
        }
        double percent2 = 1.0 * divBy2 / n * 100;
        double percent3 = 1.0 * divBy3 / n * 100;
        double percent4 = 1.0 * divBy4 / n * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%", percent2, percent3, percent4);
    }
}
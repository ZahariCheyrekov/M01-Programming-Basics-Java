package M01_ProgrammingBasics.L04_ForLoop.Exercises;

import java.util.Scanner;

public class T03OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double evenSum = 0;
        double evenMax = Double.NEGATIVE_INFINITY;
        double evenMin = Double.POSITIVE_INFINITY;
        double oddSum = 0;
        double oddMax = Double.NEGATIVE_INFINITY;
        double oddMin = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            } else {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddSum == 0) {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenSum == 0) {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
}
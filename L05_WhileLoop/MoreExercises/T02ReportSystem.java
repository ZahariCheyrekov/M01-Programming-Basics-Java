package M01_ProgrammingBasics.L05_WhileLoop.MoreExercises;

import java.util.Scanner;

public class T02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wantedSum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        String product = "";
        int successfulCardPayments = 0;
        int successfulCashPayments = 0;
        int cashCard = 0;
        int cash = 0;
        int payment = 0;
        int allSum = 0;
        double averageCS = 0;
        double averageCC = 0;
        int count = 0;

        while (!input.equals("End")) {
            count++;
            if (count % 2 == 0) {
                payment = Integer.parseInt(input);
                if (payment > 10) {
                    product = "Product sold!";
                    System.out.println(product);
                    successfulCardPayments++;
                    cashCard += payment;
                } else {
                    product = "Error in transaction!";
                    System.out.println(product);
                }
            } else {
                payment = Integer.parseInt(input);
                if (payment <= 100) {
                    product = "Product sold!";
                    System.out.println(product);
                    successfulCashPayments++;
                    cash += payment;
                } else {
                    product = "Error in transaction!";
                    System.out.println(product);
                }
            }
            allSum = cash + cashCard;
            if (allSum >= wantedSum) {
                break;
            }
            input = scanner.nextLine();
        }
        averageCS = (double) cash / successfulCashPayments;
        averageCC = (double) cashCard / successfulCardPayments;

        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%nAverage CC: %.2f", averageCS, averageCC);
        }
    }
}

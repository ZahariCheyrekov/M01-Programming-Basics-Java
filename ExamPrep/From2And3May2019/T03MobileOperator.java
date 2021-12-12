package M01_ProgrammingBasics.ExamPrep.From2And3May2019;

import java.util.Scanner;

public class T03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String duration = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (duration.equals("one")) {
            if (type.equals("Small")) {
                price += 9.98;
            } else if (type.equals("Middle")) {
                price += 18.99;
            } else if (type.equals("Large")) {
                price += 25.98;
            } else if (type.equals("ExtraLarge")) {
                price += 35.99;
            }
        } else if (duration.equals("two")) {
            if (type.equals("Small")) {
                price += 8.58;
            } else if (type.equals("Middle")) {
                price += 17.09;
            } else if (type.equals("Large")) {
                price += 23.59;
            } else if (type.equals("ExtraLarge")) {
                price += 31.79;
            }
        }
        if (internet.equals("yes")) {
            if (price <= 10.00) {
                price += 5.50;
            } else if (price <= 30.00) {
                price += 4.35;
            } else if (price > 30) {
                price += 3.85;
            }
        }
        double sum = price * months;
        if (duration.equals("two")) {
            sum = sum - sum * 0.0375;
        }
        System.out.printf("%.2f lv.", sum);
    }
}
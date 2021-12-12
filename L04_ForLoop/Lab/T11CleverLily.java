package M01_ProgrammingBasics.L04_ForLoop.Lab;

import java.util.Scanner;

public class T11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int sumMoney = 0;
        int evenBirthdays = 0;
        int toys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                evenBirthdays++;
                evenSum = evenSum + 10;
                sumMoney = sumMoney + evenSum;
            } else {
                toys++;
            }
        }
        int toysSold = toys * toyPrice;
        int moneyFinal = sumMoney + toysSold - evenBirthdays;

        double moneyLeft = Math.abs(moneyFinal - washerPrice);

        if (moneyFinal >= washerPrice) {
            System.out.printf("Yes! %.2f", moneyLeft);
        } else {
            System.out.printf("No! %.2f", moneyLeft);
        }

    }
}

package M01_ProgrammingBasics.ExamPrep.From2And3May2019;

import java.util.Scanner;

public class T04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int product = 0;
        double totalSum = 0;

        while (!input.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());
            product++;
            if (product % 3 == 0) {
                totalSum = totalSum + productPrice / 2;
            } else {
                totalSum = totalSum + productPrice;
            }
            if (budget < totalSum) {
                double shortMoney = Math.abs(budget - totalSum);
                System.out.printf("You don't have enough money!\n" +
                        "You need %.2f leva!", shortMoney);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", product, totalSum);
        }
    }
}
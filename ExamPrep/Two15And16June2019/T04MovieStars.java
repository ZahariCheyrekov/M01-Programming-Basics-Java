package M01_ProgrammingBasics.ExamPrep.Two15And16June2019;

import java.util.Scanner;

public class T04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();

        while (!name.equals("ACTION")) {
            int lengthName = name.length();
            if (lengthName <= 15) {
                double profit = Double.parseDouble(scanner.nextLine());
                budget -= profit;
            } else {
                budget = budget - budget * 0.20;
            }
            if (budget < 0) {
                double moneyNeeded = Math.abs(budget);
                System.out.printf("We need %.2f leva for our actors.", moneyNeeded);
                break;
            }
            name = scanner.nextLine();
        }
        if (name.equals("ACTION")) {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
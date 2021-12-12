package M01_ProgrammingBasics.L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class T06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceCostumeStatist = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;

        if (statists >= 150) {
            priceCostumeStatist *= 0.90;
        }
        double expenses = decor + statists * priceCostumeStatist;

        if (expenses > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", expenses - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - expenses);
        }
    }
}


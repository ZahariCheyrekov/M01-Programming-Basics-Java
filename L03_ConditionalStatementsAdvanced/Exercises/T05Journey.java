package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class T05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = "";
        double price = 0;

        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            if (season.equals("summer")) {
                price = budget * 0.30;
                place = "Camp";
                System.out.printf("%s - %.2f", place, price);
            } else if (season.equals("winter")) {
                price = budget * 0.70;
                place = "Hotel";
                System.out.printf("%s - %.2f", place, price);
            }
        } else if (budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            if (season.equals("summer")) {
                price = budget * 0.40;
                place = "Camp";
                System.out.printf("%s - %.2f", place, price);
            } else if (season.equals("winter")) {
                price = budget * 0.80;
                place = "Hotel";
                System.out.printf("%s - %.2f", place, price);
            }
        } else if (budget > 1000) {
            System.out.println("Somewhere in Europe");
            price = budget * 0.90;
            place = "Hotel";
            System.out.printf("%s - %.2f", place, price);
        }
    }
}

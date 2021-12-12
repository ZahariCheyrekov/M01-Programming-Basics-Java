package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class T04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfFishermen = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (season.equals("Spring")) {
            price = 3000;
            if (numberOfFishermen <= 6) {
                price = price - price * 0.10;
            }
            if (numberOfFishermen >= 7 && numberOfFishermen <= 11) {
                price = price - price * 0.15;
            }
            if (numberOfFishermen >= 12) {
                price = price - price * 0.25;
            }
        } else if (season.equals("Summer")) {
            price = 4200;
            if (numberOfFishermen <= 6) {
                price = price - price * 0.10;
            }
            if (numberOfFishermen >= 7 && numberOfFishermen <= 11) {
                price = price - price * 0.15;
            }
            if (numberOfFishermen >= 12) {
                price = price - price * 0.25;
            }
        } else if (season.equals("Autumn")) {
            price = 4200;
            if (numberOfFishermen <= 6) {
                price = price - price * 0.10;
            }
            if (numberOfFishermen >= 7 && numberOfFishermen <= 11) {
                price = price - price * 0.15;
            }
            if (numberOfFishermen >= 12) {
                price = price - price * 0.25;
            }
        } else if (season.equals("Winter")) {
            price = 2600;
            if (numberOfFishermen <= 6) {
                price = price - price * 0.10;
            }
            if (numberOfFishermen >= 7 && numberOfFishermen <= 11) {
                price = price - price * 0.15;
            }
            if (numberOfFishermen >= 12) {
                price = price - price * 0.25;
            }
        }
        if (!season.equals("Autumn")) {
            if (numberOfFishermen % 2 == 0) {
                price = price - price * 0.05;
            }
        }
        double diff = Math.abs(budget - price);

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}

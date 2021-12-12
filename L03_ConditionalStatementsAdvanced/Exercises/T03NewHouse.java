package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class T03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (flowerType.equals("Roses")) {
            price = numberOfFlowers * 5;
            if (numberOfFlowers > 80) {
                price = price - price * 0.10;
            }
        } else if (flowerType.equals("Dahlias")) {
            price = numberOfFlowers * 3.80;
            if (numberOfFlowers > 90) {
                price = price - price * 0.15;
            }
        } else if (flowerType.equals("Tulips")) {
            price = numberOfFlowers * 2.80;
            if (numberOfFlowers > 80) {
                price = price - price * 0.15;
            }
        } else if (flowerType.equals("Narcissus")) {
            price = numberOfFlowers * 3;
            if (numberOfFlowers < 120) {
                price = price + price * 0.15;
            }
        } else if (flowerType.equals("Gladiolus")) {
            price = numberOfFlowers * 2.50;
            if (numberOfFlowers < 80) {
                price = price + price * 0.20;
            }
        }
        double diff = Math.abs(budget - price);

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowerType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}

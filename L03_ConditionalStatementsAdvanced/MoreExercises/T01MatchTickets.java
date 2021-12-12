package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class T01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (numberOfPeople >= 1 && numberOfPeople <= 4) {
            price = budget - budget * 0.75;
        } else if (numberOfPeople >= 5 && numberOfPeople <= 9) {
            price = budget - budget * 0.60;
        } else if (numberOfPeople >= 10 && numberOfPeople <= 24) {
            price = budget - budget * 0.50;
        } else if (numberOfPeople >= 25 && numberOfPeople <= 49) {
            price = budget - budget * 0.40;
        } else if (numberOfPeople >= 50) {
            price = budget - budget * 0.25;
        }
        double ticketPrice = 0;

        if (category.equals("Normal")) {
            ticketPrice = 249.99 * numberOfPeople;
        } else if (category.equals("VIP")) {
            ticketPrice = 499.99 * numberOfPeople;
        }
        double diff = Math.abs(price - ticketPrice);

        if (price >= ticketPrice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}

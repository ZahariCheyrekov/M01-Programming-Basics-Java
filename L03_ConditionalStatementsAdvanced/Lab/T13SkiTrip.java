package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class T13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();
        int nights = numberOfDays - 1;
        double price = 0;

        if (roomType.equals("room for one person")) {
            price = 18 * nights;
        } else if (roomType.equals("apartment")) {
            price = 25 * nights;
            if (nights < 10) {
                price = price - price * 0.30;
            }
            if (nights >= 10 && nights <= 15) {
                price = price - price * 0.35;
            }
            if (nights > 15) {
                price = price - price * 0.50;
            }
        } else if (roomType.equals("president apartment")) {
            price = 35 * nights;
            if (nights < 10) {
                price = price - price * 0.10;
            }
            if (nights >= 10 && nights <= 15) {
                price = price - price * 0.15;
            }
            if (nights > 15) {
                price = price - price * 0.20;
            }
        }
        if (review.equals("positive")) {
            price = price + price * 0.25;
        } else {
            price = price - price * 0.10;
        }
        System.out.printf("%.2f", price);
    }
}

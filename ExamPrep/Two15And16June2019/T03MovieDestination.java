package M01_ProgrammingBasics.ExamPrep.Two15And16June2019;

import java.util.Scanner;

public class T03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double movieBudget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (season.equals("Winter")) {
            if (destination.equals("Dubai")) {
                price = 45_000 * numberOfDays;
                price = price - price * 0.30;
            } else if (destination.equals("Sofia")) {
                price = 17_000 * numberOfDays;
                price = price + price * 0.25;
            } else if (destination.equals("London")) {
                price = 24_000 * numberOfDays;
            }
        } else if (season.equals("Summer")) {
            if (destination.equals("Dubai")) {
                price = 40_000 * numberOfDays;
                price = price - price * 0.30;
            } else if (destination.equals("Sofia")) {
                price = 12_500 * numberOfDays;
                price = price + price * 0.25;
            } else if (destination.equals("London")) {
                price = 20_250 * numberOfDays;
            }
        }
        double diff = Math.abs(movieBudget - price);
        if (price <= movieBudget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }
    }
}

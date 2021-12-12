package M01_ProgrammingBasics.ExamPrep.One6And7July2019;

import java.util.Scanner;

public class T02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceNight = Double.parseDouble(scanner.nextLine());
        int tax = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            priceNight = priceNight - priceNight * 0.05;
        }
        double nightsSum = priceNight * nights;
        double expenses = (budget * tax) / 100;
        double totalSum = nightsSum + expenses;

        double diff = Math.abs(totalSum - budget);

        if (totalSum <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }
    }
}
package M01_ProgrammingBasics.ExamPrep.From18And19July2020;

import java.util.Scanner;

public class T02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForLuggageOver20Kg = Double.parseDouble(scanner.nextLine());
        double luggageKG = Double.parseDouble(scanner.nextLine());
        int daysToTrip = Integer.parseInt(scanner.nextLine());
        int numberLuggage = Integer.parseInt(scanner.nextLine());

        double luggagePrice = 0;
        if (luggageKG < 10) {
            luggagePrice = priceForLuggageOver20Kg * 0.20;
        } else if (luggageKG >= 10 && luggageKG <= 20) {
            luggagePrice = priceForLuggageOver20Kg * 0.50;
        } else if (luggageKG > 20) {
            luggagePrice = priceForLuggageOver20Kg;
        }
        if (daysToTrip > 30) {
            luggagePrice = luggagePrice + luggagePrice * 0.10;
        } else if (daysToTrip >= 7 && daysToTrip <= 30) {
            luggagePrice = luggagePrice + luggagePrice * 0.15;
        } else {
            luggagePrice = luggagePrice + luggagePrice * 0.40;
        }
        double totalSum = luggagePrice * numberLuggage;

        System.out.printf("The total price of bags is: %.2f lv.", totalSum);
    }
}
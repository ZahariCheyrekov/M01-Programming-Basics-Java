package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class T07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceApartment = 0;
        double priceStudio = 0;

        if (season.equals("May") || season.equals("October")) {
            priceStudio = 50;
            priceApartment = 65;
            if (nights > 7 && nights <= 14) {
                priceStudio = priceStudio - priceStudio * 0.05;
            } else if (nights > 14) {
                priceStudio = priceStudio - priceStudio * 0.30;
                priceApartment = priceApartment - priceApartment * 0.10;
            }
            priceStudio = nights * priceStudio;
            priceApartment = nights * priceApartment;
        } else if (season.equals("June") || season.equals("September")) {
            priceStudio = 75.20;
            priceApartment = 68.70;
            if (nights > 14) {
                priceStudio = priceStudio - priceStudio * 0.20;
                priceApartment = priceApartment - priceApartment * 0.10;
            }
            priceStudio = nights * priceStudio;
            priceApartment = nights * priceApartment;
        } else if (season.equals("July") || season.equals("August")) {
            priceStudio = 76;
            priceApartment = 77;
            if (nights > 14) {
                priceApartment = priceApartment - priceApartment * 0.10;
            }
            priceStudio = nights * priceStudio;
            priceApartment = nights * priceApartment;
        }
        System.out.printf("Apartment: %.2f lv.\n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}


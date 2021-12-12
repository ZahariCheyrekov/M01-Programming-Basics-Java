package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class T04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double priceCabrio = 0;
        double priceJeep = 0;
        String typeClass = "";
        String carType = "";

        if (budget <= 100) {
            if (season.equals("Summer")) {
                typeClass = "Economy class";
                carType = "Cabrio";
                priceCabrio = budget * 0.35;
                System.out.println(typeClass);
                System.out.printf(carType + " - %.2f", priceCabrio);
            } else if (season.equals("Winter")) {
                typeClass = "Economy class";
                carType = "Jeep";
                priceJeep = budget * 0.65;
                System.out.println(typeClass);
                System.out.printf(carType + " - %.2f", priceJeep);
            }
        } else if (budget > 100 && budget <= 500) {
            if (season.equals("Summer")) {
                typeClass = "Compact class";
                carType = "Cabrio";
                priceCabrio = budget * 0.45;
                System.out.println(typeClass);
                System.out.printf(carType + " - %.2f", priceCabrio);
            } else if (season.equals("Winter")) {
                typeClass = "Compact class";
                carType = "Jeep";
                priceJeep = budget * 0.80;
                System.out.println(typeClass);
                System.out.printf(carType + " - %.2f", priceJeep);
            }
        } else if (budget > 500) {
            if (season.equals("Summer") || season.equals("Winter")) {
                typeClass = "Luxury class";
                carType = "Jeep";
                priceJeep = budget * 0.90;
                System.out.println(typeClass);
                System.out.printf(carType + " - %.2f", priceJeep);
            }


        }
    }
}


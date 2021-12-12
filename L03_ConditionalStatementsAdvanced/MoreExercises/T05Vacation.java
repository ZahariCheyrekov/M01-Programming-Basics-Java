package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class T05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String accommodation = "";
        double price = 0;

        if (budget <= 1000) {
            if (season.equals("Summer")) {
                price = budget * 0.65;
                place = "Alaska";
                accommodation = "Camp";
                System.out.print(place);
                System.out.print(" - " + accommodation + " - ");
                System.out.printf("%.2f", price);
            } else if (season.equals("Winter")) {
                price = budget * 0.45;
                place = "Morocco";
                accommodation = "Camp";
                System.out.print(place);
                System.out.print(" - " + accommodation + " - ");
                System.out.printf("%.2f", price);
            }
        } else if (budget > 1000 && budget <= 3000) {
            if (season.equals("Summer")) {
                price = budget * 0.80;
                place = "Alaska";
                accommodation = "Hut";
                System.out.print(place);
                System.out.print(" - " + accommodation + " - ");
                System.out.printf("%.2f", price);
            } else if (season.equals("Winter")) {
                price = budget * 0.60;
                place = "Morocco";
                accommodation = "Hut";
                System.out.print(place);
                System.out.print(" - " + accommodation + " - ");
                System.out.printf("%.2f", price);
            }
        } else if (budget > 3000) {
            if (season.equals("Summer")) {
                price = budget * 0.90;
                place = "Alaska";
                accommodation = "Hotel";
                System.out.print(place);
                System.out.print(" - " + accommodation + " - ");
                System.out.printf("%.2f", price);
            } else if (season.equals("Winter")) {
                price = budget * 0.90;
                place = "Morocco";
                accommodation = "Hotel";
                System.out.print(place);
                System.out.print(" - " + accommodation + " - ");
                System.out.printf("%.2f", price);
            }


        }
    }
}

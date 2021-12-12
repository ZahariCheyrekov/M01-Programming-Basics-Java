package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class T03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hr = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String YorN = scanner.nextLine();

        double priceAll = 0;
        double numberFlowers = hr + roses + tulips;

        if (season.equals("Spring") || season.equals("Summer")) {
            double priceHr = hr * 2.00;
            double priceRoses = roses * 4.10;
            double priceTulips = tulips * 2.50;
            priceAll = priceHr + priceRoses + priceTulips;
            if (season.equals("Spring")) {
                if (tulips >= 7) {
                    priceAll *= 0.95;
                }
            }
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            double priceHr = hr * 3.75;
            double priceRoses = roses * 4.50;
            double priceTulips = tulips * 4.15;
            priceAll = priceHr + priceRoses + priceTulips;
            if (season.equals("Winter")) {
                if (roses >= 10) {
                    priceAll *= 0.90;
                }
            }
        }
        if (numberFlowers >= 20) {
            priceAll *= 0.80;
        }

        if (YorN.equals("Y")) {
            priceAll = priceAll + priceAll * 0.15;
        }

        double priceWithArranging = priceAll + 2;

        System.out.printf("%.2f", priceWithArranging);


    }
}

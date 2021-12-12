package M01_ProgrammingBasics.L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class T04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceKilogramVegetables = Double.parseDouble(scanner.nextLine());
        double priceKilogramFruits = Double.parseDouble(scanner.nextLine());
        double totalKilogramsVeg = Double.parseDouble(scanner.nextLine());
        double totalKilogramsFr = Double.parseDouble(scanner.nextLine());

        double veg = priceKilogramVegetables * totalKilogramsVeg;
        double fr = priceKilogramFruits * totalKilogramsFr;
        double totalPrice = veg + fr;

        double inEuro = totalPrice / 1.94;

        System.out.printf("%.2f", inEuro);
    }
}

package M01_ProgrammingBasics.ExamPrep.From6And7April2019;

import java.util.Scanner;

public class T02GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double clothesSum = statists * priceClothes;
        if (statists > 150) {
            clothesSum = clothesSum - clothesSum * 0.10;
        }
        double totalSum = decorPrice + clothesSum;
        double diff = Math.abs(totalSum - budget);

        if (totalSum > budget) {
            System.out.print("Not enough money!\n");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.printf("Action!\n" +
                    "Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
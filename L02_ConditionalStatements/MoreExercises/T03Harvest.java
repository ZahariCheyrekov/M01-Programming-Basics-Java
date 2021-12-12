package M01_ProgrammingBasics.L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class T03Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double vineyardSquareMeters = Integer.parseInt(scanner.nextLine());
        double grapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        int requiredLitersWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double harvestedForWine = 0.4 * vineyardSquareMeters;
        double litersWineProduced = harvestedForWine * grapePerSquareMeter / 2.5;

        if (requiredLitersWine > litersWineProduced) {
            double notEnoughWine = requiredLitersWine - litersWineProduced;
            double roundedNotEnoughWine = Math.floor(notEnoughWine);
            System.out.printf("It will be a tough winter! More " + "%.0f" + " " + "liters wine needed.", roundedNotEnoughWine);
        } else {
            double roundedWineProduced = Math.floor(litersWineProduced);
            double enoughWine = Math.ceil(litersWineProduced - requiredLitersWine);
            double winePerPerson = Math.ceil(enoughWine / workers);
            System.out.printf("Good harvest this year! Total wine: " + "%.0f" + " liters.", roundedWineProduced);
            System.out.println();
            System.out.printf("%.0f" + " liters left -> " + "%.0f" + " liters per person.", enoughWine, winePerPerson);
        }


    }
}

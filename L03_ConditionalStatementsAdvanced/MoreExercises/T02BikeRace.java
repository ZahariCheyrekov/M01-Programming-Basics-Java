package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class T02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double youngBikers = Double.parseDouble(scanner.nextLine());
        double olderBikers = Double.parseDouble(scanner.nextLine());
        String typeRace = scanner.nextLine();

        double sum = 0;
        double bikers = youngBikers + olderBikers;

        if (typeRace.equals("trail")) {
            sum = youngBikers * 5.5 + olderBikers * 7;
        } else if (typeRace.equals("cross-country")) {
            sum = youngBikers * 8 + olderBikers * 9.50;
            if (bikers >= 50) {
                sum = sum - sum * 0.25;
            }
        } else if (typeRace.equals("downhill")) {
            sum = youngBikers * 12.25 + olderBikers * 13.75;
        } else if (typeRace.equals("road")) {
            sum = youngBikers * 20 + olderBikers * 21.5;
        }

        double finalSum = sum * 0.95;

        System.out.printf("%.2f", finalSum);
    }
}

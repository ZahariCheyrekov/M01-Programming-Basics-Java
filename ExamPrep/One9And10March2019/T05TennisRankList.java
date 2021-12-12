package M01_ProgrammingBasics.ExamPrep.One9And10March2019;

import java.util.Scanner;

public class T05TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int wins = 0;

        for (int tournament = 1; tournament <= numberOfTournaments; tournament++) {
            String result = scanner.nextLine();
            if (result.equals("W")) {
                startingPoints += 2000;
                sum += 2000;
                wins++;
            } else if (result.equals("F")) {
                startingPoints += 1200;
                sum += 1200;
            } else if (result.equals("SF")) {
                startingPoints += 720;
                sum += 720;
            }
        }
        System.out.printf("Final points: %d\n", startingPoints);
        System.out.printf("Average points: %d\n", (sum / numberOfTournaments));
        System.out.printf("%.2f%%", ((1.0 * wins / numberOfTournaments) * 100));
    }
}

package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class T09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yearType = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int numberOfWeekends = 48;
        double gamesInSofia = (numberOfWeekends - h) * 0.75;
        double holidayGames = p * 2.0 / 3;
        double totalGamesInSofia = gamesInSofia + h + holidayGames;
        double games = 0;

        if (yearType.equals("leap")) {
            games = totalGamesInSofia * 0.15;
        }
        double finalGamesPlayed = totalGamesInSofia + games;
        double result = Math.floor(finalGamesPlayed);
        System.out.printf("%.0f", result);
    }
}

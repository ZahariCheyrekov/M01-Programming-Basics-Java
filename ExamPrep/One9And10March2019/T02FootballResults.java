package M01_ProgrammingBasics.ExamPrep.One9And10March2019;

import java.util.Scanner;

public class T02FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wins = 0;
        int loses = 0;
        int draws = 0;

        for (int games = 1; games <= 3; games++) {
            String result = scanner.nextLine();
            char score1 = result.charAt(0);
            char score2 = result.charAt(2);

            if (score1 > score2) {
                wins++;
            } else if (score1 == score2) {
                draws++;
            } else if (score1 < score2) {
                loses++;
            }
        }
        System.out.printf("Team won %d games.\n", wins);
        System.out.printf("Team lost %d games.\n", loses);
        System.out.printf("Drawn games: %d", draws);
    }
}

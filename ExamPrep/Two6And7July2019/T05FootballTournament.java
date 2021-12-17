package M01_ProgrammingBasics.ExamPrep.Two6And7July2019;

import java.util.Scanner;

public class T05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String footballClub = scanner.nextLine();
        int playedMatches = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int win = 0;
        int draw = 0;
        int loses = 0;

        if (playedMatches <= 0) {
            System.out.printf("%s hasn't played any games during this season.", footballClub);
        } else {
            for (int results = 1; results <= playedMatches; results++) {
                String resultFromMatch = scanner.nextLine();
                if (resultFromMatch.equals("W")) {
                    totalPoints += 3;
                    win++;
                } else if (resultFromMatch.equals("D")) {
                    totalPoints += 1;
                    draw++;
                } else if (resultFromMatch.equals("L")) {
                    loses++;
                }
            }
        }
        double winRate = 1.0 * win / playedMatches * 100;
        if (playedMatches > 0) {
            System.out.printf("%s has won %d points during this season.\n", footballClub, totalPoints);
            System.out.print("Total stats:\n");
            System.out.printf("## W: %d\n" +
                    "## D: %d\n" +
                    "## L: %d\n", win, draw, loses);
            System.out.printf("Win rate: %.2f%%", winRate);
        }
    }
}
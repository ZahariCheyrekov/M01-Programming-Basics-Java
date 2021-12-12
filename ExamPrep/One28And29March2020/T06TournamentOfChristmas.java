package M01_ProgrammingBasics.ExamPrep.One28And29March2020;

import java.util.Scanner;

public class T06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int totalWins = 0;
        int totalLoses = 0;

        for (int day = 1; day <= days; day++) {
            int winsForDay = 0;
            int losesForDay = 0;
            double total = 0;
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    total += 20;
                    winsForDay++;
                    totalWins++;
                } else if (result.equals("lose")) {
                    losesForDay++;
                    totalLoses++;
                }
                input = scanner.nextLine();
            }
            if (winsForDay > losesForDay) {
                total = total + total * 0.10;
            }
            sum += total;
        }
        if (totalWins > totalLoses) {
            sum = sum + sum * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", sum);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", sum);
        }
    }
}
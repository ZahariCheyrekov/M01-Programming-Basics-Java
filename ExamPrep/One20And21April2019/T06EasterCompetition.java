package M01_ProgrammingBasics.ExamPrep.One20And21April2019;

import java.util.Scanner;

public class T06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easterBreads = Integer.parseInt(scanner.nextLine());
        int maxScore = Integer.MIN_VALUE;
        String winner = "";

        for (int i = 1; i <= easterBreads; i++) {
            String name = scanner.nextLine();
            String input = scanner.nextLine();
            int sumPlayer = 0;
            while (!input.equals("Stop")) {
                int points = Integer.parseInt(input);
                sumPlayer += points;

                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.\n", name, sumPlayer);
            if (maxScore < sumPlayer) {
                maxScore = sumPlayer;
                winner = name;
                System.out.printf("%s is the new number 1!\n", name);
            }
        }
        System.out.printf("%s won competition with %d points!", winner, maxScore);
    }
}

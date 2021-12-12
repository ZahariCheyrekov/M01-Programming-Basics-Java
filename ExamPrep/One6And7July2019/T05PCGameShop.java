package M01_ProgrammingBasics.ExamPrep.One6And7July2019;

import java.util.Scanner;

public class T05PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int hearthstone = 0;
        int fortnite = 0;
        int overwatch = 0;
        int others = 0;

        for (int games = 1; games <= n; games++) {
            String gameName = scanner.nextLine();

            if (gameName.equals("Hearthstone")) {
                hearthstone++;
            } else if (gameName.equals("Fornite")) {
                fortnite++;
            } else if (gameName.equals("Overwatch")) {
                overwatch++;
            } else {
                others++;
            }
        }
        double hearthstonePercent = 1.0 * hearthstone / n * 100;
        double fortnitePercent = 1.0 * fortnite / n * 100;
        double overwatchPercent = 1.0 * overwatch / n * 100;
        double othersPercent = 1.0 * others / n * 100;
        System.out.printf("Hearthstone - %.2f%%\n", hearthstonePercent);
        System.out.printf("Fornite - %.2f%%\n", fortnitePercent);
        System.out.printf("Overwatch - %.2f%%\n", overwatchPercent);
        System.out.printf("Others - %.2f%%", othersPercent);
    }
}
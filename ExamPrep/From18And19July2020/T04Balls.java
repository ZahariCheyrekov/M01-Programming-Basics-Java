package M01_ProgrammingBasics.ExamPrep.From18And19July2020;

import java.util.Scanner;

public class T04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;
        int othersColorsPicked = 0;
        int pointsFromRedBalls = 0;
        int pointsFromOrangeBalls = 0;
        int pointsFromYellowBalls = 0;
        int pointsFromWhiteBalls = 0;
        int dividesFromBlackBalls = 0;

        for (int i = 1; i <= n; i++) {
            String ballColor = scanner.nextLine();

            if (ballColor.equals("red")) {
                totalPoints += 5;
                pointsFromRedBalls++;
            } else if (ballColor.equals("orange")) {
                totalPoints += 10;
                pointsFromOrangeBalls++;
            } else if (ballColor.equals("yellow")) {
                totalPoints += 15;
                pointsFromYellowBalls++;
            } else if (ballColor.equals("white")) {
                totalPoints += 20;
                pointsFromWhiteBalls++;
            } else if (ballColor.equals("black")) {
                totalPoints = Math.floor(totalPoints / 2);
                dividesFromBlackBalls++;
            } else {
                othersColorsPicked++;
            }
        }
        System.out.printf("Total points: %.0f", totalPoints);
        System.out.printf("%nPoints from red balls: %d", pointsFromRedBalls);
        System.out.printf("%nPoints from orange balls: %d", pointsFromOrangeBalls);
        System.out.printf("%nPoints from yellow balls: %d", pointsFromYellowBalls);
        System.out.printf("%nPoints from white balls: %d", pointsFromWhiteBalls);
        System.out.printf("%nOther colors picked: %d", othersColorsPicked);
        System.out.printf("%nDivides from black balls: %d", dividesFromBlackBalls);
    }
}
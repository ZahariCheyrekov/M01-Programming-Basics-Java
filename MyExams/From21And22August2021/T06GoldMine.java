package M01_ProgrammingBasics.MyExams.From21And22August2021;

import java.util.Scanner;

public class T06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLocations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfLocations; i++) {
            double sumGold = 0;
            double averageForDay = 0;
            double averageGoldExpected = Integer.parseInt(scanner.nextLine());
            int daysWorking = Integer.parseInt(scanner.nextLine());
            for (int j = 1; j <= daysWorking; j++) {
                double goldForDay = Double.parseDouble(scanner.nextLine());
                sumGold += goldForDay;
            }
            averageForDay = sumGold / daysWorking;
            if (averageForDay >= averageGoldExpected) {
                System.out.printf("Good job! Average gold per day: %.2f.\n", averageForDay);
            } else {
                System.out.printf("You need %.2f gold.\n", averageGoldExpected - averageForDay);
            }
        }
    }
}
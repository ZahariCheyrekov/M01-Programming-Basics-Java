package M01_ProgrammingBasics.L05_WhileLoop.MoreExercises;

import java.util.Scanner;

public class T01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottlesOfDetergent = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int detergentAmount = bottlesOfDetergent * 750;
        int count = 0;
        int platesCleaned = 0;
        int potsCleaned = 0;
        int pots = 0;
        int plates = 0;
        int detergentUsagePlates = 0;
        int detergentUsagePots = 0;

        while (!input.equals("End")) {
            count++;

            if (count % 3 != 0) {
                plates = Integer.parseInt(input);
                platesCleaned += plates;
                detergentUsagePlates = platesCleaned * 5;
            } else {
                pots = Integer.parseInt(input);
                potsCleaned += pots;
                detergentUsagePots = potsCleaned * 15;
            }
            if (detergentAmount < (detergentUsagePlates + detergentUsagePots)) {
                break;
            }
            input = scanner.nextLine();
        }
        int detergentUsageTotal = detergentUsagePlates + detergentUsagePots;
        int diff = Math.abs(detergentAmount - detergentUsageTotal);

        if (detergentAmount >= detergentUsageTotal) {
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%n" +
                    "Leftover detergent %d ml.", platesCleaned, potsCleaned, diff);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", diff);
        }
    }
}
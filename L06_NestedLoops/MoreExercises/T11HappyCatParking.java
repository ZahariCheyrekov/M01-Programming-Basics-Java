package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T11HappyCatParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDays = Integer.parseInt(scanner.nextLine());
        int numberHours = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        int numberOfDays = 0;

        for (int days = 1; days <= numberDays; days++) {
            double sumForTheDay = 0;
            numberOfDays++;
            for (int hours = 1; hours <= numberHours; hours++) {
                if (days % 2 == 0) {
                    if (hours % 2 == 1) {
                        sumForTheDay += 2.50;
                    } else {
                        sumForTheDay += 1;
                    }
                } else if (days % 2 == 1) {
                    if (hours % 2 == 0) {
                        sumForTheDay += 1.25;
                    } else {
                        sumForTheDay += 1;
                    }
                }
            }
            totalSum += sumForTheDay;
            System.out.printf("Day: %d - %.2f leva\n", numberOfDays, sumForTheDay);
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
package M01_ProgrammingBasics.ExamPrep.From2And3May2019;

import java.util.Scanner;

public class T06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfHours = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int days = 1; days <= numberOfDays; days++) {
            double forTheDay = 0;
            for (int hours = 1; hours <= numberOfHours; hours++) {
                if (days % 2 == 0 && hours % 2 == 1) {
                    total += 2.50;
                    forTheDay += 2.50;
                } else if (days % 2 == 1 && hours % 2 == 0) {
                    total += 1.25;
                    forTheDay += 1.25;
                } else {
                    total += 1;
                    forTheDay += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva\n", days, forTheDay);
        }
        System.out.printf("Total: %.2f leva", total);
    }
}
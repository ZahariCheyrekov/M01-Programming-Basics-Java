package M01_ProgrammingBasics.ExamPrep.From2And3May2019;

import java.util.Scanner;

public class T02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double litersFuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double furlPrice = litersFuel * 2.10;
        double excursionGuy = furlPrice + 100;

        if (day.equals("Saturday")) {
            excursionGuy = excursionGuy - excursionGuy * 0.10;
        } else if (day.equals("Sunday")) {
            excursionGuy = excursionGuy - excursionGuy * 0.20;
        }
        double diff = Math.abs(budget - excursionGuy);
        if (budget >= excursionGuy) {
            System.out.printf("Safari time! Money left: %.2f lv.", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }
    }
}
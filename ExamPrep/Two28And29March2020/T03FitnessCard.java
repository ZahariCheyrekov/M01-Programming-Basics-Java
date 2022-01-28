package M01_ProgrammingBasics.ExamPrep.Two28And29March2020;

import java.util.Scanner;

public class T03FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double availableSum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0;

        if (gender.equals("m")) {
            if (sport.equals("Gym")) {
                price = 42;
            } else if (sport.equals("Boxing")) {
                price = 41;
            } else if (sport.equals("Yoga")) {
                price = 45;
            } else if (sport.equals("Zumba")) {
                price = 34;
            } else if (sport.equals("Dances")) {
                price = 51;
            } else if (sport.equals("Pilates")) {
                price = 39;
            }
        } else if (gender.equals("f")) {
            if (sport.equals("Gym")) {
                price = 35;
            } else if (sport.equals("Boxing")) {
                price = 37;
            } else if (sport.equals("Yoga")) {
                price = 42;
            } else if (sport.equals("Zumba")) {
                price = 31;
            } else if (sport.equals("Dances")) {
                price = 53;
            } else if (sport.equals("Pilates")) {
                price = 37;
            }
        }
        if (age <= 19) {
            price = price - price * 0.20;
        }
        if (availableSum >= price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - availableSum);
        }
    }
}
package M01_ProgrammingBasics.ExamPrep.One28And29March2020;

import java.util.Scanner;

public class T02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int numberOfWalks = Integer.parseInt(scanner.nextLine());
        int caloriesConsumed = Integer.parseInt(scanner.nextLine());

        int totalMinutes = minutesWalk * numberOfWalks;
        int caloriesBurned = totalMinutes * 5;
        int halfCalories = caloriesConsumed / 2;

        if (caloriesBurned >= halfCalories) {
            System.out.println("Yes, the walk for your cat is enough. " +
                    "Burned calories per day: " + caloriesBurned + ".");
        } else {
            System.out.println("No, the walk for your cat is not enough. " +
                    "Burned calories per day: " + caloriesBurned + ".");
        }
    }
}
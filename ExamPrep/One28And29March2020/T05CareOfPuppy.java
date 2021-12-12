package M01_ProgrammingBasics.ExamPrep.One28And29March2020;

import java.util.Scanner;

public class T05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodDogKilograms = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int foodInGrams = foodDogKilograms * 1000;
        int totalFoodEaten = 0;

        while (!input.equals("Adopted")) {
            int gramsEaten = Integer.parseInt(input);
            totalFoodEaten += gramsEaten;
            input = scanner.nextLine();
        }
        if (foodInGrams >= totalFoodEaten) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - totalFoodEaten);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", totalFoodEaten - foodInGrams);
        }
    }
}
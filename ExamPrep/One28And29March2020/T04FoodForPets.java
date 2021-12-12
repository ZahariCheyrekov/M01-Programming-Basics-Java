package M01_ProgrammingBasics.ExamPrep.One28And29March2020;

import java.util.Scanner;

public class T04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double foodAmount = Double.parseDouble(scanner.nextLine());
        double eatenBiscuits = 0;
        int eatenByDog = 0;
        int eatenByCat = 0;
        int eatenFoodTotal = 0;

        for (int day = 1; day <= days; day++) {
            int dog = Integer.parseInt(scanner.nextLine());
            eatenByDog += dog;
            int cat = Integer.parseInt(scanner.nextLine());
            eatenByCat += cat;
            eatenFoodTotal += dog + cat;
            if (day % 3 == 0) {
                eatenBiscuits += (dog + cat) * 0.10;
            }
        }
        double biscuits = Math.abs(eatenBiscuits);
        double foodEatenPercent = eatenFoodTotal / foodAmount * 100;
        double dogPercent = 1.0 * eatenByDog / eatenFoodTotal * 100;
        double catPercent = 1.0 * eatenByCat / eatenFoodTotal * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n", foodEatenPercent);
        System.out.printf("%.2f%% eaten from the dog.\n", dogPercent);
        System.out.printf("%.2f%% eaten from the cat.", catPercent);
    }
}
package M01_ProgrammingBasics.MyExams.From21And22August2021;

import java.util.Scanner;

public class T04CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCats = Integer.parseInt(scanner.nextLine());
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        double totalFoodEaten = 0;

        for (int i = 1; i <= numberOfCats; i++) {
            int gramsFood = Integer.parseInt(scanner.nextLine());
            totalFoodEaten += gramsFood;
            if (gramsFood >= 100 && gramsFood < 200) {
                group1++;
            } else if (gramsFood >= 200 && gramsFood < 300) {
                group2++;
            } else if (gramsFood >= 300 && gramsFood < 400) {
                group3++;
            }
        }
        double inKg = totalFoodEaten / 1000;
        double totalSum = inKg * 12.45;

        System.out.printf("Group 1: %d cats.\n" +
                "Group 2: %d cats.\n" +
                "Group 3: %d cats.\n" +
                "Price for food per day: %.2f lv.", group1, group2, group3, totalSum);
    }
}
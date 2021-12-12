package M01_ProgrammingBasics.MyExams.From21And22August2021;

import java.util.Scanner;

public class T05PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodBought = Integer.parseInt(scanner.nextLine());
        int foodInGrams = foodBought * 1000;
        int foodEatenGrams = 0;

        String command = scanner.nextLine();
        while (!command.equals("Adopted")) {
            int grams = Integer.parseInt(command);
            foodEatenGrams += grams;
            command = scanner.nextLine();
        }
        if (foodInGrams >= foodEatenGrams) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - foodEatenGrams);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", foodEatenGrams - foodInGrams);
        }
    }
}
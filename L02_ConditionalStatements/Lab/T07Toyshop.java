package M01_ProgrammingBasics.L02_ConditionalStatements.Lab;

import java.util.Scanner;

public class T07Toyshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int numberPuzzles = Integer.parseInt(scanner.nextLine());
        int numberDolls = Integer.parseInt(scanner.nextLine());
        int numberBears = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());

        double totalSum = (numberPuzzles * 2.60) +
                (numberDolls * 3) +
                (numberBears * 4.10) +
                (numberMinions * 8.20) +
                (numberTrucks * 2);

        int allToys = numberPuzzles + numberDolls +
                numberBears + numberMinions + numberTrucks;

        if (allToys >= 50) {
            totalSum = totalSum - totalSum * 0.25;
        }

        totalSum = totalSum - totalSum * 0.10;
        double profit = Math.abs(totalSum - tripPrice);

        if (totalSum >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", profit);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", profit);
        }

    }
}

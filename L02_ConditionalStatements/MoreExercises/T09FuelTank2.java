package M01_ProgrammingBasics.L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class T09FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double fuelAmount = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double discount = 0;
        double fuelPrice = 0;

        if (clubCard.equals("Yes")) {
            if (fuel.equals("Gasoline")) {
                discount = 2.22 - 0.18;
                fuelPrice = fuelAmount * discount;
            } else if (fuel.equals("Diesel")) {
                discount = 2.33 - 0.12;
                fuelPrice = fuelAmount * discount;
            } else if (fuel.equals("Gas")) {
                discount = 0.93 - 0.08;
                fuelPrice = fuelAmount * discount;
            }
        } else if (clubCard.equals("No")) {
            if (fuel.equals("Gasoline")) {
                fuelPrice = fuelAmount * 2.22;
            } else if (fuel.equals("Diesel")) {
                fuelPrice = fuelAmount * 2.33;
            } else if (fuel.equals("Gas")) {
                fuelPrice = fuelAmount * 0.93;
            }
        }

        double amountFuel = 0;

        if (fuelAmount >= 20 && fuelAmount <= 25) {
            amountFuel = fuelPrice - fuelPrice * 0.08;
        } else if (fuelAmount >= 25) {
            amountFuel = fuelPrice - fuelPrice * 0.10;
        } else if (fuelAmount < 20) {
            amountFuel = fuelPrice;
        }

        System.out.printf("%.2f lv.", amountFuel);

    }
}

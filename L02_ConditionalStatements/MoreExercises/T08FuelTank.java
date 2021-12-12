package M01_ProgrammingBasics.L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class T08FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());
        boolean validFuel = (fuel.equals("Diesel") || fuel.equals("Gasoline") || fuel.equals("Gas"));
        if (!validFuel) {
            System.out.println("Invalid fuel!");
        } else {
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuel.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
            }
        }
    }
}

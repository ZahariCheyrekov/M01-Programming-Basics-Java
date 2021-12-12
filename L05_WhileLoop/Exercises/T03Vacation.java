package M01_ProgrammingBasics.L05_WhileLoop.Exercises;

import java.util.Scanner;

public class T03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyVacation = Double.parseDouble(scanner.nextLine());
        double moneyBalance = Double.parseDouble(scanner.nextLine());

        int daysCount = 0;
        int spendingCounter = 0;

        while (moneyBalance < moneyVacation && spendingCounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCount++;

            if (command.equals("save")) {
                moneyBalance += money;
                spendingCounter = 0;
            } else if (command.equals("spend")) {
                moneyBalance -= money;
                spendingCounter++;
                if (moneyBalance < 0) {
                    moneyBalance = 0;
                }
            }
            if (spendingCounter == 5) {
                System.out.println("You can't save the money.");
                System.out.println(daysCount);
            } else if (moneyBalance >= moneyVacation) {
                System.out.printf("You saved the money for %d days.", daysCount);
            }
        }
    }
}
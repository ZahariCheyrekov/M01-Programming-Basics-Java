package M01_ProgrammingBasics.L05_WhileLoop.Lab;

import java.util.Scanner;

public class T05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalSum = 0;

        while (!input.equals("NoMoreMoney")) {
            double money = Double.parseDouble(input);

            if (money > 0) {
                totalSum += money;
                System.out.printf("Increase: %.2f%n", money);
            } else if (money < 0) {
                System.out.println("Invalid operation!");
                System.out.printf("Total: %.2f", totalSum);
                break;
            }
            input = scanner.nextLine();

            if (input.equals("NoMoreMoney")) {
                System.out.printf("Total: %.2f", totalSum);
                break;
            }
        }
    }
}

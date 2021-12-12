package M01_ProgrammingBasics.ExamPrep.One6And7July2019;

import java.util.Scanner;

public class T04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double expectedProfit = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Party!")) {
            double total = 0;
            int length = input.length();
            int numberOfDrinks = Integer.parseInt(scanner.nextLine());
            total = numberOfDrinks * length;
            if (total % 2 != 0) {
                total = total - total * 0.25;
            }
            sum += total;
            if (sum >= expectedProfit) {
                System.out.print("Target acquired.\n");
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Party!")) {
            if (sum >= expectedProfit) {
                System.out.print("Target acquired.\n");
            } else {
                System.out.printf("We need %.2f leva more.\n", expectedProfit - sum);
            }
        }
        System.out.printf("Club income - %.2f leva.", sum);
    }
}
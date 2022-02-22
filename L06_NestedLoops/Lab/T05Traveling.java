package M01_ProgrammingBasics.L06_NestedLoops.Lab;

import java.util.Scanner;

public class T05Traveling {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double sumCollected = 0;

        while (!input.equals("End")) {
            double minimalBudget = Double.parseDouble(scanner.nextLine());

            while (sumCollected < minimalBudget) {
                double money = Double.parseDouble(scanner.nextLine());
                sumCollected = sumCollected + money;
            }
          
            System.out.printf("Going to %s!%n", input);
            sumCollected = 0;
            input = scanner.nextLine();
        }
    }
}

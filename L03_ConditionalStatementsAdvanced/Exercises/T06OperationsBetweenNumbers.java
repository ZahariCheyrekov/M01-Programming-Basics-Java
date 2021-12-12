package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class T06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int calculation = 0;

        if (operator.equals("+")) {
            calculation = n1 + n2;
            if (calculation % 2 == 0) {
                System.out.printf("%d + %d = %d - even", n1, n2, calculation);

            } else {
                System.out.printf("%d + %d = %d - odd", n1, n2, calculation);

            }
        } else if (operator.equals("-")) {
            calculation = n1 - n2;
            if (calculation % 2 == 0) {
                System.out.printf("%d - %d = %d - even", n1, n2, calculation);

            } else {
                System.out.printf("%d - %d = %d - odd", n1, n2, calculation);

            }
        } else if (operator.equals("*")) {
            calculation = n1 * n2;
            if (calculation % 2 == 0) {
                System.out.printf("%d * %d = %d - even", n1, n2, calculation);
            } else {
                System.out.printf("%d * %d = %d - odd", n1, n2, calculation);

            }
        } else if (operator.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double calculated = 1.0 * n1 / n2;
                System.out.printf("%d / %d = %.2f", n1, n2, calculated);

            }
        } else if (operator.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                calculation = n1 % n2;
                System.out.printf("%d %% %d = %d", n1, n2, calculation);

            }
        }
    }
}

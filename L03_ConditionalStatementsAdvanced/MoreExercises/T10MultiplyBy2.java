package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class T10MultiplyBy2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {

            double x = Double.parseDouble(scanner.nextLine());

            if (x < 0) {
                System.out.println("Negative number!");
                break;
            } else {
                System.out.printf("Result: %.2f", x * 2);
                System.out.println("");
            }

        }
    }
}

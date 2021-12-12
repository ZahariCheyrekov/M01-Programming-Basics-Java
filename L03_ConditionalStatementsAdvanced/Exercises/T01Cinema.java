package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class T01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        if (projectionType.equals("Premiere")) {
            sum = rows * columns * 12.00;
        } else if (projectionType.equals("Normal")) {
            sum = rows * columns * 7.50;
        } else if (projectionType.equals("Discount")) {
            sum = rows * columns * 5.00;
        }
        System.out.printf("%.2f leva", sum);
    }
}

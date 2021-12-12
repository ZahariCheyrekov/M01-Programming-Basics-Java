package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class T06TruckDriver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kilometersMonth = Double.parseDouble(scanner.nextLine());

        double seasonTime = 4;
        double pay = 0;

        if (kilometersMonth <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                pay = kilometersMonth * 0.75 * seasonTime;
            } else if (season.equals("Summer")) {
                pay = kilometersMonth * 0.90 * seasonTime;
            } else if (season.equals("Winter")) {
                pay = kilometersMonth * 1.05 * seasonTime;
            }
        } else if (kilometersMonth > 5000 && kilometersMonth <= 10_000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                pay = kilometersMonth * 0.95 * seasonTime;
            } else if (season.equals("Summer")) {
                pay = kilometersMonth * 1.10 * seasonTime;
            } else if (season.equals("Winter")) {
                pay = kilometersMonth * 1.25 * seasonTime;
            }
        } else if (kilometersMonth > 10_000) {
            pay = kilometersMonth * 1.45 * seasonTime;
        }
        double afterTax = pay - pay * 0.10;

        System.out.printf("%.2f", afterTax);


    }
}


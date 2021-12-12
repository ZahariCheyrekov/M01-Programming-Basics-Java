package M01_ProgrammingBasics.L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class T04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String metric1 = scanner.nextLine();
        String metric2 = scanner.nextLine();

        if (metric1.equals("cm")) {
            number /= 100;
        } else if (metric1.equals("mm")) {
            number /= 1000;
        }

        if (metric2.equals("cm")) {
            number *= 100;
        } else if (metric2.equals("mm")) {
            number *= 1000;
        }
        System.out.printf("%.3f", number);
    }
}


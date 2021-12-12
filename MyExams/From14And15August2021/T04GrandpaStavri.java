package M01_ProgrammingBasics.MyExams.From14And15August2021;

import java.util.Scanner;

public class T04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double alcoholTotal = 0;
        double degreesSum = 0;

        for (int days = 1; days <= n; days++) {
            double alcoholAmount = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());
            alcoholTotal += alcoholAmount;
            degreesSum = degreesSum + degrees * alcoholAmount;
        }
        double averageDegrees = degreesSum / alcoholTotal;

        System.out.printf("Liter: %.2f\n", alcoholTotal);
        System.out.printf("Degrees: %.2f\n", averageDegrees);

        if (averageDegrees < 38.0) {
            System.out.print("Not good, you should baking!");
        } else if (averageDegrees >= 38.0 && averageDegrees <= 42.0) {
            System.out.print("Super!");
        } else if (averageDegrees > 42.0) {
            System.out.print("Dilution with distilled water!");
        }
    }
}
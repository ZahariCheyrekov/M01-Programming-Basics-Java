package M01_ProgrammingBasics.L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class T01TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h= Double.parseDouble(scanner.nextLine());
        double sum = (b1 + b2) * h / 2;
        System.out.printf("%.2f", sum);

    }
}

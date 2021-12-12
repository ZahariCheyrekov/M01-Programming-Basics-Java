package M01_ProgrammingBasics.L02_ConditionalStatements.Lab;

import java.util.Scanner;

public class T06AreaOfFigures {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String figure = scanner.nextLine();
    double side1 = Double.parseDouble(scanner.nextLine());

    if (figure.equals("square")) {
        side1 = side1 * side1;
        System.out.printf("%.3f",side1);
    } else if (figure.equals("rectangle")) {
        double side2 = Double.parseDouble(scanner.nextLine());
        side1 = side2 * side1;
        System.out.printf("%.3f",side1);
    } else if (figure.equals("circle")) {
        side1 = Math.PI * (side1 * side1);
        System.out.printf("%.3f",side1);
    } else if (figure.equals("triangle")) {
        double h = Double.parseDouble(scanner.nextLine());
        side1 = side1 * h / 2;
        System.out.printf("%.3f",side1);
    }
}
}

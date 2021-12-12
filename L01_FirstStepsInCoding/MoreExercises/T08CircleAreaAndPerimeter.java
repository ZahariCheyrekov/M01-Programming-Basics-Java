package M01_ProgrammingBasics.L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class T08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double area = r * r * Math.PI;
        double perimeter = 2 * r * Math.PI;
        System.out.printf("%.2f", area);
        System.out.printf("\n%.2f", perimeter);
    }

}

package M01_ProgrammingBasics.L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class T03CelsiusToF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());
        double fahrenheit = degrees * 1.8 + 32;
        System.out.printf("%.2f", fahrenheit);

    }
}

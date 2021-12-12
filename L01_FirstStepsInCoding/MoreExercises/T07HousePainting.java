package M01_ProgrammingBasics.L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class T07HousePainting {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double side = x * y;
        double window = 1.5 * 1.5;
        double twoSides = side * 2 - window * 2;
        double backSide = x * x;
        double entrance = 1.2 * 2;
        double frondAndBackSide = backSide * 2 - entrance;
        double totalArea = twoSides + frondAndBackSide;
        double greenPaint = totalArea / 3.4;
        double roofSides = 2 * (x * y);
        double roof = 2 * (x * h / 2);
        double roofArea = roof + roofSides;
        double redPaint = roofArea / 4.3;

        System.out.printf("%.2f", greenPaint);
        System.out.printf("\n%.2f", redPaint);
    }
}

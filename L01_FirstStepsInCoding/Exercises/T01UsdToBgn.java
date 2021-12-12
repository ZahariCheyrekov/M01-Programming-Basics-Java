package M01_ProgrammingBasics.L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class T01UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());

        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}

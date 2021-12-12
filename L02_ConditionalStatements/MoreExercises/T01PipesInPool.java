package M01_ProgrammingBasics.L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class T01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double V = Double.parseDouble(scanner.nextLine());
        double P1 = Double.parseDouble(scanner.nextLine());
        double P2 = Double.parseDouble(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double p1Hours = P1 * H;
        double p2Hours = P2 * H;
        double p1p2 = p1Hours + p2Hours;
        double over = p1p2 - V;

        double percentP1 = p1Hours / V * 100;
        double percentP2 = p2Hours / V * 100;
        double finalPercent = percentP1 + percentP2;
        double percentP1f = p1Hours / p1p2 * 100;
        double percentP2f = p2Hours / p1p2 * 100;

        if (p1p2 <= V) {
            System.out.printf("The pool is %6.2f%%", finalPercent);
            System.out.print(" full.");
            System.out.printf(" Pipe 1: %6.2f%%", percentP1f);
            System.out.print(". ");
            System.out.printf(" Pipe 2: %6.2f%%", percentP2f);
            System.out.print(".");
        } else {
            System.out.printf("For %.2f hours the fool overflows with %.2f liters.", H, over);
        }
    }
}

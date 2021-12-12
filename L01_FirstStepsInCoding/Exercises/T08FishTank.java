package M01_ProgrammingBasics.L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class T08FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double v = length * width * height;
        double inLiters = v / 1000;
        double percentFullness = percent * 0.01;
        double litersNeeded = inLiters * (1 - percentFullness);

        System.out.printf("%.2f", litersNeeded);
    }
}

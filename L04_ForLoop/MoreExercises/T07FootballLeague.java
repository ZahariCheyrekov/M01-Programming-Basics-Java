package M01_ProgrammingBasics.L04_ForLoop.MoreExercises;

import java.util.Scanner;

public class T07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int numberOfFans = Integer.parseInt(scanner.nextLine());
        int A = 0;
        int B = 0;
        int V = 0;
        int G = 0;

        for (int i = 1; i <= numberOfFans; i++) {
            String fans = scanner.nextLine();

            if (fans.equals("A")) {
                A++;
            } else if (fans.equals("B")) {
                B++;
            } else if (fans.equals("V")) {
                V++;
            } else if (fans.equals("G")) {
                G++;
            }
        }
        double fansAPercent = 1.0 * A / numberOfFans * 100;
        double fansBPercent = 1.0 * B / numberOfFans * 100;
        double fansVPercent = 1.0 * V / numberOfFans * 100;
        double fansGPercent = 1.0 * G / numberOfFans * 100;
        double allFans = 1.0 * numberOfFans / stadiumCapacity * 100;

        System.out.printf("%.2f%%%n", fansAPercent);
        System.out.printf("%.2f%%%n", fansBPercent);
        System.out.printf("%.2f%%%n", fansVPercent);
        System.out.printf("%.2f%%%n", fansGPercent);
        System.out.printf("%.2f%%", allFans);
    }
}

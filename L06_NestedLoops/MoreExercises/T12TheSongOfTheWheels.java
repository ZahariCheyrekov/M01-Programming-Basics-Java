package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T12TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = Integer.parseInt(scanner.nextLine());
        int numberOfCombinations = 0;
        boolean hasFound = false;
        String last4 = "";

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d) {
                            if ((a * b + c * d) == M) {
                                numberOfCombinations++;
                                if (numberOfCombinations == 4) {
                                    last4 = String.format("%d%d%d%d", a, b, c, d);
                                    hasFound = true;
                                }
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if (hasFound) {
            System.out.printf("Password: %s", last4);
        } else {
            System.out.println("No!");
        }
    }
}

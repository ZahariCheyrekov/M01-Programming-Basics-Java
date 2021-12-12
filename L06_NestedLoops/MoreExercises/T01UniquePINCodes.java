package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumberCeil = Integer.parseInt(scanner.nextLine());
        int secondNumberCeil = Integer.parseInt(scanner.nextLine());
        int thirdNumberCeil = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= firstNumberCeil; i += 2) {
            for (int j = 2; j <= secondNumberCeil; j++) {
                for (int k = 2; k <= thirdNumberCeil; k += 2) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }
    }
}
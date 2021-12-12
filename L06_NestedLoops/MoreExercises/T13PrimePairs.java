package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T13PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startPosition1 = Integer.parseInt(scanner.nextLine());
        int startPosition2 = Integer.parseInt(scanner.nextLine());
        int startPositionDiff1 = Integer.parseInt(scanner.nextLine());
        int startPositionDiff2 = Integer.parseInt(scanner.nextLine());

        int endPosition1 = startPosition1 + startPositionDiff1;
        int endPosition2 = startPosition2 + startPositionDiff2;

        for (int a = startPosition1; a <= endPosition1; a++) {
            for (int b = startPosition2; b <= endPosition2; b++) {
                if (a % 2 != 0 && a % 3 != 0 && a % 5 != 0 && a % 7 != 0) {
                    if (b % 2 != 0 && b % 3 != 0 && b % 5 != 0 && b % 7 != 0) {
                        System.out.printf("%d%d\n", a, b);
                    }
                }
            }
        }
    }
}

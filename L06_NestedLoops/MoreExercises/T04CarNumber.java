package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());

        for (int i = startInterval; i <= endInterval; i++) {
            for (int j = startInterval; j <= endInterval; j++) {
                for (int k = startInterval; k <= endInterval; k++) {
                    for (int l = startInterval; l < i; l++) {
                        if ((j + k) % 2 == 0) {
                            if (i % 2 == 0 && l % 2 == 1 || i % 2 == 1 && l % 2 == 0) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }
                    }
                }
            }
        }
    }
}

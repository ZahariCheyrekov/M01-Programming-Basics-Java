package M01_ProgrammingBasics.L06_NestedLoops.Exercises;

import java.util.Scanner;

public class T05PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int z = 97 + l;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 97; c < z; c++) {
                    for (int d = 97; d < z; d++) {
                        for (int e = 1; e <= n; e++) {
                            if (e > a && e > b) {
                                System.out.printf("%d%d%c%c%d ", a, b, c, d, e);
                            }
                        }
                    }
                }
            }
        }
    }
}

package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T07SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        int numberOfCombinations = 0;
        boolean flag = false;

        for (int A1 = 35; A1 <= 55; A1++) {
            for (int B1 = 64; B1 <= 96; B1++) {
                for (int x = 1; x <= a; x++) {
                    for (int y = 1; y <= b; y++) {
                        numberOfCombinations++;
                        if (numberOfCombinations > maxPasswords) {
                            flag = true;
                            break;
                        }
                        System.out.printf("%c%c%d%d%c%c|", A1, B1, x, y, B1, A1);
                        if (x == a && y == b) {
                            flag = true;
                            break;
                        }
                        A1 += 1;
                        if (A1 > 55) {
                            A1 = 35;
                        }
                        B1 += 1;
                        if (B1 > 96) {
                            B1 = 64;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
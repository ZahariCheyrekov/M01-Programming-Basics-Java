package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T08SecretDoorLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int finalNum = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= firstNum; i += 2) {
            for (int j = 2; j <= secondNum; j++) {
                boolean klsIsPrime = true;
                for (int k = 2; k < j / 2 + 1; k++) {
                    if (j % k == 0 && j != 2) {
                        klsIsPrime = false;
                        break;
                    }
                }
                for (int l = 2; l <= finalNum; l += 2) {
                    if (!klsIsPrime) {
                        break;
                    }
                    System.out.printf("%d %d %d\n", i, j, l);
                }
            }
        }
    }
}

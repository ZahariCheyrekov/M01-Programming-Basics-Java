package M01_ProgrammingBasics.L04_ForLoop.MoreExercises;

import java.util.Scanner;

public class T08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int lastSum = 0;
        int diff = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            int sum = num + num2;

            if (i > 0) {
                diff = Math.abs(lastSum - sum);
            }
            lastSum = sum;
        }
        if (diff == 0) {
            System.out.printf("Yes, value=%d", lastSum);
        } else {
            System.out.printf("No, maxdiff=%d", diff);
        }
    }
}
